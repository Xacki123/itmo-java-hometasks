package ru.tsvetkov.homeworke.hw21.common;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Command {
    String[] command = {"/help", "/count", "/ping", "/exit"};
    public static Message count(ArrayList<Message> messages){
        Message message = new Message("Server", "Сообщение от сервера, количество сообщений = " + messages.size());
        return message;
    }
    public static Message ping(int nano){
        Message message = new Message("Server", "Сообщение от сервера, ping = " + (long)(LocalDateTime.now().getNano() - nano));
        return message;
    }
    public static Message help(){
        String[] command = {"/help", "/count", "/ping", "/exit"};
        Message message = new Message("Server", "Сообщение от сервера, доступные команды = " + Arrays.toString(command));
        return message;

    }
}
