package org.example.baselibs;

import java.util.Calendar;

public class CalendarLib {
    // Класс Calendar используется для работы с датами - считается более современным.

    // Создается объект календаря следующим образом (без ключевого слова new).
    public static Calendar calendar = Calendar.getInstance();

    public static void getCalendarData() {
        // Метод "get" позволяет из Calendar получить любой параметр.
        // Поддерживаемые параметры:
        // ERA, YEAR, MONTH, DAY_OF_MONTH, DAY_OF_WEEK, WEEK_OF_YEAR, WEEK_OF_MONTH,
        // HOUR, HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND.
        System.out.printf("\nДата вида \"dd.mm.yyyy hh:mm\" - %d.%d.%d %d:%d",
                calendar.get(Calendar.DATE),
                // +1 - так как JAN = 0, а DEC = 11.
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE)
        );
    }

    public static void getCurrentDate() {
        // Метод "getTime" позволяет получить текущую дату и время.
        System.out.printf("Текущая дата - %s", calendar.getTime());
    }

    public static void useCalendarMethods() {
        var calendarMonth = calendar.get(Calendar.MONTH);

        // Метод "add" позволяет добавить значение к любому параметру объекта calendar.
        calendar.add(Calendar.MONTH, 1);
        System.out.printf("Значение месяца объекта calendar до изменений - %d, после - %d.\n", calendarMonth, calendar.get(Calendar.MONTH));

        // Методы "after"/"before" работает аналогично с одноименным методом из класса Date.

        // Метод "clear" обнуляет значения всех параметров в объекте Calendar (до 1970 года).
        // Метод "getTime" возвращает объект класса Date.
        calendar.clear();
        System.out.printf("Пустой calendar: %s\n", calendar.getTime());

        // Метод "set" позволяет задать значение для параметра календаря.
        calendarMonth = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, 10);
        System.out.printf("Значение месяца объекта calendar до изменений - %d, после - %d.\n", calendarMonth, calendar.get(Calendar.MONTH));
    }
}
