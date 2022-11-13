package ru.tsvetkov.homeworke.hw21.common;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection<T extends Message> implements AutoCloseable {

    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    // обработка ошибко будет по разному у клиента и сервера
    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        // передача сеариализованного в сокет
        output = new ObjectOutputStream(this.socket.getOutputStream());
        // десиариализация полученного из сокета
        input = new ObjectInputStream(this.socket.getInputStream());
    }

    public void sendMessage(T message) throws IOException {
        message.setDateTime();
        output.writeObject(message);
        // принужительная отправка
        output.flush();
    }

    public T readMessage() throws IOException, ClassNotFoundException {
        return (T) input.readObject();
    }

    // закрытие соединений при автоклоузе
    @Override
    public void close() throws Exception {
        input.close();
        output.close();
        socket.close();
    }
}
