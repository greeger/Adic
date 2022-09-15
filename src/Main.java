import lab3.Building;
import lab3.HeatingSystem;
import lab4.Article;
import lab4.Book;
import lab4.Edition;
import lab4.OnlineResource;
import labStrings.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*List<Edition> listOfEditions = new ArrayList<Edition>();
        listOfEditions.add(new Book("книга 1", "автор 1", 2000, "Москва"));
        listOfEditions.add(new Book("книга 1", "автор 1", 2000, "Москва"));
        listOfEditions.add(new Book("книга 2", "автор 2", 1990, "Самара"));

        listOfEditions.add(new Article("статья 1", "автор 3", "журнал 1", 10, 2010));
        listOfEditions.add(new Article("статья 2", "автор 4", "журнал 2", 1, 2000));

        listOfEditions.add(new OnlineResource("ресурс 1", "автор 1", "google.com", "аннотация 1"));
        listOfEditions.add(new OnlineResource("ресурс 2", "автор 20", "yandex.ru", "аннотация 2"));

        listOfEditions.stream()
                .sorted((a, b) -> a.CompareTo(b))
                .forEach((a) -> a.print());
        String author = "автор 2";
        System.out.println();
        listOfEditions.stream()
                .filter((a) -> a.getAuthor().equals(author))
                .collect(Collectors.toList())
                .stream().forEach((a) -> a.print());*/

        Building building = new Building(new HeatingSystem(false, false), 20);
        building.getHeatingSystem().enable();
        building.getHeatingSystem().fill();
        System.out.println(building);

        System.out.println("\n");

        StringUtils stringUtils = new StringUtils("АА,,  ыы.. аЫ; ооАОаа fdsFDdfs");
        System.out.println(stringUtils.getSpaces());
        stringUtils.toUpperCase();
        System.out.println(stringUtils.getLine());
        stringUtils.removePunctuationMarks();
        System.out.println(stringUtils.getLine());

    }
}