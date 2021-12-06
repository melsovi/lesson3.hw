package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] fractionalNumbers = {1.5, -8.6, 5.3, 9.5, -0.2, 6.1, 3.2, 5.7, 9.3,
                -3.4, 4.1, -0.8, 3.3, 5.9};
        System.out.println(fractionalNumbers[3]);
        double sum = 0.0;
        int quantity = 0;
        boolean isNegative = false;
        for (double arrays : fractionalNumbers) {
            if (arrays < 0) {
                isNegative = true;
            } else if (isNegative) {
                sum += arrays;
                quantity++;
            }
        }
        double arithmeticMeanNumber = sum / quantity;
        System.out.println(arithmeticMeanNumber);

        int[] wholeNumbers = new int[]{8, -2, -4, 2, 3, 6};


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < wholeNumbers.length; i++) {
                if (wholeNumbers[i] < wholeNumbers[i - 1]) {
                    int temp = wholeNumbers[i];
                    wholeNumbers[i] = wholeNumbers[i - 1];
                    wholeNumbers[i - 1] = temp;
                    isSorted = false;
                    System.out.println(Arrays.toString(wholeNumbers));
                }
            }

        }
    }
}
/*
Создать массив дробных (не целых) чисел размером 15 элементов и
наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое
положительных чисел расположенных после первого отрицательного числа и вывести его на экран
(8, -2, -4, 2, 3, 6) =  11/3
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию:
каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
При этом каждую новую итерацию начинать сдвигаясь вправо,
то есть первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
{-4, -2, 2, 3, 6, 8}
 */