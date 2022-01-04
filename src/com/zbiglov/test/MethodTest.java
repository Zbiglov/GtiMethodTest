package com.zbiglov.test;

public class MethodTest {
    public static void main(String[] args) {
        Goods goods = new Goods("Молоко Простоквашино", 77.77, 99, 777, "2021/12/22");

        goods.buy(7);
        goods.info();

        System.out.println();

        int x = 3;
        int y = 7;

        addition(x, y);
        subtraction(y, x);
        System.out.println(multiplication(x, y) + " переданное методом \"multiplication\" значение");
        System.out.println(division(y, x) + " переданное методом \"division\" значение");

    }

    public static void addition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b) + " отработал метод сложения \"addition\"");
    }

    public static void subtraction(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b) + " отработал метод вычитания \"subtraction\"");
    }

    public static int multiplication(int a, int b) {
        System.out.print(a + " * " + b + " = " + (a * b) + " отработал метод умножения \"multiplication\" с возвратом значения. ");
        return a * b;
    }

    public static double division(int a, int b) {
        double z = (double) a / (double) b;
        System.out.print(a + " / " + b + " = " + z + " отработал метод деления \"division\" с возвратом значения. ");
        return z;
    }
}
