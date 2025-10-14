package org.example.fundamental;

import java.util.Arrays;

public class ArrayDataType {
    // Массив - это объект-контейнер, который содержит фиксированное количество значений одного типа.
    // Массив содержит различные "элементы", доступ к которым осуществляется по "индексу" - порядковому номеру.

    // Объявление переменной для обращения к массиву со значениями типа int.
    int[] arrayOfInts;

    // Создание, инициализация массива с явным ограничением длины или явно указанными значениями.
    byte[] arrayOfBytes = new byte[5];
    float[] arrayOfFloats = {1.0f, 2.5f, 4.5f, 0.3f, 0.01f};

    // "Многомерный массив" - массив массивов (массив ссылок, так как массив является ссылочным типом данных).
    // *многомерный массив, содержащий в себе массивы разной длины называется "зубчатым".
    String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
    };

    // Свойство "length" - содержит в себе значение длины массива (количества его элементов).
    int arrayLength = names.length;

    // Метод "arraycopy" - системный метод для эффективного копирования данных из одного массива в другой.
    // Можно явно передать: исходный/целевой массив, точку начала/завершения копирования, длину конечного массива.
    // Обязательными параметрами являются - "src" и "dest" (на них декоратор @NotNull).
    public static void arraycopyExample() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    }

    // Манипуляции с массивом.
    public static void arrayManipulationExample() {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = {1, 2, 3, 4, 5};

        // Метод "binarySearch" - бинарный поиск индекса элемента по его значению.
        int searchingNumberIndex = Arrays.binarySearch(firstArray, 5);

        // Метод "equals" - сравнение двух массивов для определения их равенства
        boolean isEqual = Arrays.equals(firstArray, secondArray);

        // Метод "fill" - заполнение массива значением элемента целиком/по индексу/по диапазону индексов.
        Arrays.fill(firstArray, 0, 5,10);

        // Метод "sort" - последовательная (на базе проверки соседей одна за другой) сортировка массива.
        // Метод "parallelSort" - параллельная (деление массива на под-массивы со сравнением) сортировка массива.
        Arrays.sort(firstArray);
        Arrays.parallelSort(secondArray);

        // Создание потока "stream", используя массив как источник для дальнейшего взаимодействия.
        Arrays.stream(firstArray);

        // Метод "toString" - преобразование массива в строку.
        Arrays.toString(secondArray);
    }
}
