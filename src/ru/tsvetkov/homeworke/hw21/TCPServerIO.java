package ru.tsvetkov.homeworke.hw21;

import ru.tsvetkov.homeworke.hw21.common.Command;
import ru.tsvetkov.homeworke.hw21.common.Connection;
import ru.tsvetkov.homeworke.hw21.common.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TCPServerIO {
    private final int port;
    private ArrayList<Message> messages;

    public TCPServerIO(int port) {

        this.port = port;
        messages = new ArrayList<>();
    }

    public void run(){
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер зупущен");
            while (true){
                // считывание клиента и установка соединения
                Socket socket = serverSocket.accept();

                // взаимодействие с клиентом
                Connection<Message> connection = new Connection<>(socket);

                // получение сообщения от клиента
                Message fromClient = connection.readMessage();
                System.out.println("От клиента - " + fromClient);

                // вынести в отдельный класс
                if ("/count".equalsIgnoreCase(fromClient.getText())){
                    connection.sendMessage(Command.count(messages));
                    continue;
                }
                if ("/ping".equalsIgnoreCase(fromClient.getText())){
                    connection.sendMessage(Command.ping(fromClient.getDateTime().getNano()));
                    continue;
                }
                if ("/help".equalsIgnoreCase(fromClient.getText())){
                    connection.sendMessage(Command.help());
                    continue;
                }
                messages.add(fromClient);

                Message message = new Message("Server", "Сообщение от сервера");
                connection.sendMessage(message);
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Обработка IOException | ClassNotFoundException");
        }
    }

    public static void main(String[] args) {

        TCPServerIO serverIO = new TCPServerIO(Integer.parseInt(args[0]));
        serverIO.run();
    }
}
