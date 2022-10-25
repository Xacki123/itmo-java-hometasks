package ru.tsvetkov.homeworke.hw14.task1;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int low = 0;
        int medium = 0;
        int high = 0;
        int urgent = 0;
        for (Message message : messageList) {
            if (message.getPriority().equals(MessagePriority.LOW)) {
                low++;
            } else if (message.getPriority().equals(MessagePriority.MEDIUM)) {
                medium++;
            } else if (message.getPriority().equals(MessagePriority.HIGH)) {
                high++;
            } else {
                urgent++;
            }
        }
        System.out.println("LOW = " + low + ", MEDIUM = " + medium + ", HIGH = " + high + ", URGENT = " + urgent);
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        for (int i = 0, j = 0; i < 10; i++, j = 0) {
            for (Message message : messageList) {
                if (message.getCode() == i) j++;
            }
            System.out.println("Для кода " + i + " количество сообщений = " + j);

        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        HashSet<Message> hashSet = new HashSet<>(messageList);
        System.out.println("Количество уникальных эллементов " + hashSet.size());


    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]

        LinkedHashSet<Message> linkedHashSet = new LinkedHashSet<>(messageList);
        ArrayList<Message> list = new ArrayList<>(linkedHashSet);
        return list;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPriority().equals(priority)) iterator.remove();
        }
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("");
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().getPriority().equals(priority)) iterator.remove();
        }
        System.out.println(messageList);


    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);

        countEachPriority(messages);

        countEachCode(messages);

        uniqueMessageCount(messages);

        System.out.println(uniqueMessagesInOriginalOrder(messages));

        removeEach(messages, MessagePriority.LOW);


        removeOther(messages,MessagePriority.MEDIUM);
    }
}
