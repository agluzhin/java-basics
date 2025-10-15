package org.example.fundamental;

import java.sql.SQLOutput;

public class StringDataType {
    // String - ссылочный тип данных обозначающий "строку".

    /* Важно:
        - неизменный тип данных, то есть при манипуляции с ними в памяти создаются новые объекты
        - ссылочный тип данных, то есть не хранят в себе явное значение, но содержат указатель на ячейку памяти
        - при инициализации одинаковых строк в разные переменные они будут ссылаться на одну ячейку в памяти
    */

    public static String firstStr = "Hello,";
    public static String secondStr = " World!";

    // При сложении двух строк получается их соединение - процесс "конкатенации".
    public static void getConcatenationExample() {
        String basicConcatResult = firstStr + secondStr;
        String specialConcatResult = firstStr.concat(secondStr);
        System.out.println(basicConcatResult + " " + specialConcatResult);
    }

    // Метод "length" возвращает длину строки (количество элементов в ней).
    public static int getStringLength() {
        return firstStr.length();
    }

    // Метод "charAt" возвращает элемент строки по переданному индексу.
    public static char getCharFromStringByIndex(int index) {
        return firstStr.charAt(index);
    }

    // Метод "equals" сравнивает строки как есть, а "equalsIgnoreCase" сравнивает без учета регистра.
    public static void checkStringComparison() {
        boolean basicComparison = firstStr.equals(secondStr);
        boolean specialComparisonIgnoringCase = firstStr.equalsIgnoreCase(secondStr);
        System.out.println(basicComparison + " " + specialComparisonIgnoringCase);
    }

    // Методы "indexOf"/"lastIndexOf" проверяют слева направо, перегрузка для типов данных и указания индекса старта.
    public static void getElementIndex() {
        String example = "Hello, World! Hello";
        // 2
        int firstIterationCharIndex = example.indexOf('l');
        // 17
        int lastIterationCharIndex = example.lastIndexOf('l');
        // 2
        int firstIterationStringIndex = example.indexOf("llo");
        // 16
        int lastIterationStringIndex = example.lastIndexOf("llo");
        // 3
        int firstIterationCharIndexWithStart = example.indexOf('l', 6);
    }

    // Методы "replace"/"replaceAll"/"replaceFirst" заменяют старое значение на новое.
    public static void replaceMethodExample() {
        String example = "abracadabra";
        // "bbrbcbdbbrb"
        String replaceAToB = example.replace('a', 'b');
        // "bilbocadbilbo"
        String replaceAllAbraToBilbo = example.replaceAll("abra", "bilbo");
        // "anacadabra"
        String replaceFirstBraToNa = example.replaceFirst("bra", "na");
    }

    // Метод "split" делит входную строку по переданному regex параметру на массив строк.
    public static void splitStringToArray() {
        String example = "a, b, c, d, e, f, g";
        // [a, b, c, d, e, f, g]
        String[] exampleArray = example.split(", ");
    }

    // Метод "substring" создает подстроку на базе исходной, по сути это определенный нами кусок исходной строки.
    public static void getSubString() {
        String example = "Hello, World!";
        // "World!"
        String substringWithBeginIndex = example.substring(7);
        // "Worl"
        String substringWithBeginAndEndIndex = example.substring(7, 10);
    }

    // Методы "toLowerCase"/"toUpperCase" переводят строку в нижний и верхний регистр соответственно.
    public static void setStringCase() {
        String example = "BIM bIm Test StRINg";
        // "bim bim test string"
        String exampleToLowerCase = example.toLowerCase();
        // "BIM BIM TEST STRING"
        String exampleToUpperCase = example.toUpperCase();
    }

    // Метод "trim" очищает строку от пробелов в начале и конце строки.
    public static void deleteBeginAndEndSpaces() {
        String example = " example ex ";
        // "example ex"
        String exampleWithoutBeginAndEndSpaces = example.trim();
    }

    // Метод "valueOf" позволяет получить строковое представление переданного примитивного значения.
    // в случае с объектами вернет полное имя объекта вместе с пакетом и hexadecimal код.
    public static void getStringFromValue() {
        // "3"
        String exampleThree = String.valueOf(3);
    }

    // Метод "format" позволяет задавать правила форматирования для строк.
    // вместо "format" для вывода в терминал можно использовать "printf"
    public static void formatString() {
        // Базовые placeholder'ы: %s - для строк, %d - для целых чисел и %f - для чисел с плавающей точкой.
        // "Привет, Alex! Твой рост - 185 и вес - 83.5"
        String placeHolderExample = String.format("Привет, %s! Твой рост - %d и вес - %f", "Alex", 185, 83.5);

        // Можно задать ширину с помощью "%10s" (по правому краю) и "%-10s" (по левому), добить число нулями "%05d".
        // "|     right|left      |00042|"
        String row = String.format("|%10s|%-10s|%05d|", "right", "left", 42);

        // Можно задать точность для вещественных чисел с помощью "%.3f", где 3 - указание количества символов.
        // "π ≈ 3.142"
        String pi = String.format("π ≈ %.3f", Math.PI);

        // Можно использовать разделитель тысяч (он зависит от текущей локали, либо ",", либо ".") с помощью "%,d".
        // "1,234,567" в US-локали
        String n = String.format("%,d", 1_234_567);

        // Можно менять параметры местами указав порядок "%1$s", "%2$s" и т.д.
        // "B потом A"
        String s = String.format("%2$s потом %1$s", "A", "B");

        // Чтобы ввести сам знак %, его нужно экранировать, введя дважды.
        // "Скидка 15% на товары".
        String sale = String.format("Скидка 15%% на %s", "товары");
    }
}
