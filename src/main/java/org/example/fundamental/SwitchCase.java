package org.example.fundamental;

public class SwitchCase {
    // Оператор switch принимает в качестве аргумента переменную-селектор и использует ее значение для выбора пути.
    /* Синтаксис:
        switch (day) {
            case "monday":
                currentDay = 1;
                break;
            case "tuesday":
                currentDay = 2;
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

      В качестве переменной-селектора могут выступать:
        - примитивные типы данных (byte, short, int, char)
        - типы оболочек (Integer, Character, Byte, Short)
        - перечисляемые типы
        - String

       Важно: boolean, long, float, double использовать в качестве переменной-селектора нельзя!

       Switch проверяет значение в case, а затем выполняет код выбранного блока.
       Один и тот же блок кода может быть использован для нескольких case.
       Данную конструкцию лучше всего использовать, когда заведомо известны все возможные значения селектора.
       Переменная-селектор может быть объектом и null в том, числе, поэтому следует защитить switch от null.

       С Java 14 появился новый синтаксис:
        int len = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };

        Для возврата значения из switch...case используется yield, а не return (появляется двусмысленность семантики).
    */
}
