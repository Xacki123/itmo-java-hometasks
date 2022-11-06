package ru.tsvetkov.homeworke.hw15;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу


        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(getLogin(firstTaskMap, "Тверь"));

        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений


        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(dooblWord(words));


        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        System.out.println(getCostumer(20, 60, customerMap));
        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        // 1
        System.out.println("Частота появления слова " + getPeriodicity("web", text));
        //2
        System.out.println(getList(text));
        //3
        topTen(text);
    }

    public static List<String> getLogin(Map<String, String> map, String city) {
        List<String> login = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(city)) {
                login.add(pair.getKey());
            }
        }
        return login;
    }

    public static HashMap<String, Integer> dooblWord(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : list) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.replace(string, map.get(string) + 1);
            }

        }
        return map;
    }

    public static HashMap<Integer, Customer> getCostumer(int from, int to, HashMap<String, Customer> hashMap) {
        HashMap<Integer, Customer> map = new HashMap<>();
        int t = 1;
        for (Customer customer : hashMap.values()) {
            if (customer.getAge() >= from && customer.getAge() <= to) {
                map.put(t, customer);
                t++;
            }
        }
        return map;
    }

    public static Long getPeriodicity(String word, String text) {
        Long periodicity = 0L;
        String[] arr = text.toLowerCase().split(" ");
        List<String> list = Arrays.asList(arr);
        if (!list.contains(word)) {
            System.out.println("Слова нет");
            return periodicity;
        }
        for (String string : list) {
            if (string.equalsIgnoreCase(word)) periodicity++;
        }
        return periodicity;
    }

    public static HashMap<Integer, ArrayList<String>> getList(String text) {
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        String[] arr = text.split(" ");
        List<String> list = Arrays.asList(arr);
        for (String string : list) {
            if (!hashMap.containsKey(string.length())) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(string);
                hashMap.put(string.length(), arrayList);
            } else {
                hashMap.get(string.length()).add(string);
            }
        }
        return hashMap;
    }

    public static void topTen(String text) {
        String[] arr = text.toLowerCase().split(" ");
        List<String> list = Arrays.asList(arr);
        HashMap<String, Long> treeMap = new HashMap<>();
        for (String string : list) {
            if (!treeMap.containsKey(string)) {
                treeMap.put(string, getPeriodicity(string, text));
            }
        }



        List<Map.Entry<String, Long>> list2 = new ArrayList<>(treeMap.entrySet());
        list2.sort(new PeriodicityComparator());
        for (int i = 0; i < 10; i++) {
            System.out.println(list2.get(i));
        }
    }
}

// List<>
class PeriodicityComparator implements Comparator<Map.Entry<String, Long>> {

    @Override
    public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
        return (int) (o2.getValue() - o1.getValue());
    }
}
