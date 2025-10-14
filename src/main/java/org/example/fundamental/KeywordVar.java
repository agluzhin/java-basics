package org.example.fundamental;

public class KeywordVar {
    // Ключевое слово "var" - компилятор автоматически определяет типа данных для переменных.
    /* Ограничения:
        - можно использовать только для "локальных" переменных;
        - не может использоваться для полей, параметров метода или конструктора;
        - такая переменная обязательно должна быть "проинициализирована".
     */
    public static void printVarLocalVariable() {
        var message = "Hello, world!";
        System.out.println(message);
    }
}
