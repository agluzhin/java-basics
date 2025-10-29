package org.example.baselibs;

import java.util.Date;

public class DateLib {
    // Класс Date, используемый для работы с датами - сейчас считается устаревшим (deprecated).

    // Если передать без параметров, то будет отображаться текущее время.
    public static Date date = new Date();
    // В качества параметра можно передать дату в миллисекундах (с типом long).
    public static Date dateMillis = new Date(11111111111L);

    public static void printDate() {
        System.out.println(date);
    }

    public static void printDateMillis() {
        System.out.println(dateMillis);
    }

    public static void useDateMethods() {
        // Метод "after" проверяет: следует ли дата 1 за датой 2.
        System.out.printf("%s СЛЕДУЕТ ПОСЛЕ %s?\nОтвет: %b\n", date, dateMillis, date.after(dateMillis));
        // Метод "before" проверяет: предшествует ли дата 1 дате 2.
        System.out.printf("%s ПРЕДШЕСТВУЕТ %s?\nОтвет: %b\n", date, dateMillis, date.before(dateMillis));
        // Метод "compareTo" сравнивает даты: 0 - одинаковые, -1 - вызывающая более ранняя, 1 - вызывающая более поздняя.
        System.out.printf("СРАВНЕНИЕ %s и %s.\nОтвет: %d\n", date, dateMillis, date.compareTo(dateMillis));
        // Метод "getTime()" возвращает значение вызывающей даты в миллисекундах (тип long).
        System.out.printf("%s В ВИДЕ МИЛЛИСЕКУНД.\nОтвет: %d\n", dateMillis, dateMillis.getTime());
        // Метод "setTime()" позволяет установить время в миллисекундах (тип long).
        dateMillis.setTime(2L);
        System.out.printf("Дата в миллисекундах ПОСЛЕ ИЗМЕНЕНИЯ \"setTime(2L)\".\nОтвет: %d\n", dateMillis.getTime());
    }
}
