package by.practice.task5_6;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5_6 {
    public static void main(String[] args) {
// 1. Необходимо, чтобы программа отображала следующую последовательность чисел:
//       7 14 21 28 35 42 49 56 63 70 77 84 91 98
//        int a = 7;
//        int b = 98;
//        int c = 7;
//        for (int i = a; i <= b; i += c) {
//            System.out.print(i + " ");
//        }
//    }
//}
// 2. Необходимо вывести следующую последовательность цифр:1 2 4 8 16 32 64 128 256 512 (цикл while)
//        int a1 = 1;
//        int b1 = 512;
//        while (a1 <= b1) {
//            System.out.print(a1 + " ");
//            a1 *= 2;
//        }
//    }
//}

// 3.Написать программу, которая посчитает сумму первых 10 чисел (цикл while)

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//            System.out.println("Сумма 10 чисел " + sum);
//        }
//    }
//}

//4.Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)
//        for (int i = 100; i > 1; i--) {
//            System.out.print(i + ", ");
//                    }
//        System.out.print(" 1 ");
//    }
//    }

//5. Вывести числа от 1 до 100. (while)
//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//6. Вывести только нечётные числа от 1 до 100.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }
//    }
//}

//7. Вывести каждый десяток от 1 до 100.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 10 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//8.Создать массив из чисел. Вывести макс и мин число.
//        int[] numbers = {1, 3, 4, 5, 6};
//        int min = numbers[0];
//        int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println("Минимальное значение: " + min);
//        System.out.println("Минимальное значение: " + max);
//    }
//}

//9. Создать массив чисел от 1 до 100. Вывести полученный массив
//int [] numbers = new int [100];
//for (int i = 0; i < numbers.length; i++) {
//numbers [i]= i + 1;
//}
//for (int number : numbers) {
//    System.out.print(number + " ");
//}
//}
//    }

//10. Сортировать массив чисел. Сортирвка пузырьком
        int [] array = {2, 3, 5, 8, 9, 14, 20};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}