package by.practice.task_3_4;


import java.util.Scanner;

public class Task_3_4 {
    public static void main(String[] args) {

        //1. Дано уравнение: (10+12)*x=88;. Найти значение x.
        int a = 88;
        int b = 10 + 12;
        int x = a / b;
        System.out.println("Значение x: " + x);

/* 2. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
Результат выведите в косноль */

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите x1: ");
        int x1 = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        System.out.print("Введите z: ");
        int z = in.nextInt();
        x1+= y;  // x1 = x1 + y
        y*= z;  // y = y * z
        System.out.println(x1 + " "+y);*/


//3. Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x
        int sum1 = 213 + 258;
        int sum2 = 217 - 60;
        int x2 = sum1 / sum2;
        System.out.println("Значение x: " + x2);
        System.out.println("*******************************************");

/* 4. Даны значения: x=5; y=2; c=x*y;
Расставьте операции инкремента декремента так,  чтобы после выполнения операции (c=x*y) с=10; x=6; y=1 */
        int x3 = 5;
        int y3 = 2;
        int c = x3++ * y3--;
        System.out.println("c = " + c); // 10
        System.out.println("x = " + x3); // 6
        System.out.println("y = " + y3); // 1
        System.out.println("*******************************************");

/* 5. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.*/
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a1 = in.nextInt();
//        System.out.print("Введите b: ");
//        int b1 = in.nextInt();
//        int result;
//        if (a1 > b1) {
//            result = a1 - b1;
//        } else if (a1 == b1) {
//            result = a1 + b1;
//        } else {
//            result = b1 - a1;
//        }
//        System.out.println("Результат " + result);

/* 6.Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.*/
//        if (a1 > b1 & b1 != 0) {
//            result = a1 / b1;
//        } else if (a1 != 0) {
//            result= b1 / a1;
//        } else {
//            result = a1 + b1;
//        }
//        System.out.println("Результат " + result);

// 7.На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
        if (a1 % 3 == 0) {
            System.out.println("Число делится на 3.");
        } else {
            System.out.println("Число не делится на 3.");
        }
    }
}






