package ru.tsvetkov.homeworke.hw21;

import ru.tsvetkov.homeworke.hw21.common.Connection;
import ru.tsvetkov.homeworke.hw21.common.Message;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class TCPClientIO {
    private final String ip; //адрес серверноц машины
    private final int port; //порт на котором сервер ожидает подключение


    public TCPClientIO(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = scanner.nextLine();

        while (true){
            System.out.println("Введите сообщение");
            String text = scanner.nextLine();

            if (("/exit".equalsIgnoreCase(text))) break;

            // формирование сообщения
            Message message = new Message(name, text);


            try(Connection<Message> connection = new Connection<>(new Socket(ip, port))) {
                // отпркавка
                connection.sendMessage(message);

                // получение
                Message fromServer = connection.readMessage();
                System.out.println("Сообщение от сервера - " + fromServer);

            } catch (IOException | ClassNotFoundException e){
                System.out.println("Обработка IOException | ClassNotFoundException");
            } catch (Exception e){
                System.out.println("Обработка Exception");
            }
        }

    }


    public static void main(String[] args) {
        Properties properties = new Properties();
        // загрузка из файла
        try(InputStream input = TCPClientIO.class.getClassLoader().getResourceAsStream( "config.properties")) {
            properties.load(input);
        } catch (IOException e){
            System.out.println("Проблемы с чтением config.properties");
        }

        TCPClientIO client = new TCPClientIO(properties.getProperty("ip"), Integer.parseInt(properties.getProperty("port")));
        client.run();
    }
}
