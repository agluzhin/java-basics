package org.example.baselibs;

public class MathLib {
    // Класс Math предназначен для проведения математических расчетов, которые нельзя выполнить средствами Java.
    public static int a = 10;
    public static int b = 5;

    public static void useMathMethods() {
        // Метод "pow" используется для возведения числа в степень (результат типа double).
        System.out.printf("\nПри возведении %d в степень %d получим: %d.\n", a, b, (int)Math.pow(a, b));
        // Метод "abs" возвращает абсолютное значение числа.
        int negative = -5;
        System.out.printf("\nАбсолютное значение числа %d равняется: %d.\n", negative, Math.abs(negative));
        // Метод "sqrt" возвращает квадратный корень числа (результат типа double).
        int numberForSqrt = 36;
        System.out.printf("\nКорень числа %d равняется: %d.\n", numberForSqrt, (int)Math.sqrt(numberForSqrt));
        // Метод "max" возвращает наибольшее значение из переданных.
        System.out.printf("\nСреди значений %d и %d наибольшим будет: %d.\n", a, b, Math.max(a,b));
        // Метод "min" возвращает наименьшее значение из переданных.
        System.out.printf("\nСреди значений %d и %d наименьшим будет: %d.\n", a, b, Math.min(a,b));
        // Метод "random" возвращает случайное значение от 0 до 1 (результат типа double).
        System.out.printf("\nСлучайное значение будет равно: %f.\n", Math.random());
        // Метод "rint"

        // Метод "round" округляет в большую сторону от 0.5 включительно.
        float floatForRound = 3.5f;
        System.out.printf("\nЧисло %f после округления будет равно: %d.", floatForRound, Math.round(floatForRound));

    }
}
