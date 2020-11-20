package ru.geekbrains.java_1_14112020;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        byte a, b, c;
//        a=5;
//        b=2;
//        c=127;
//        System.out.println("a="+a+"  b="+b);
//        System.out.println(++c);

//        short d, e;
//        d=10000;
//        e=7000;
//        System.out.println(d+e);

//        int f, g;
//        f=1100;
//        g=30;
//        System.out.println(f*g);

//        System.out.println("long days = long seconds!\ndays = x\n");
//        System.out.println("seconds = days * 24 * 60 * 60");
//        long x;
//        x=1200000000000L;
//        System.out.println(x*24*60*60);

//        float f, g;
//        f=1100.5f;
//        g=30.5f;
//        System.out.println(f*g);


//        double f, g;
//        f=110008.5;
//        g=3005.5;
//        System.out.println(f*g);


//        char b= 67;
//        char d= 'S';
//        System.out.println(d);


//          byte a=3;
//          int d=1000;
//          float b=5.5f;
//          long  c=1000000000L;
//          System.out.println((( c / d ) + b) * a);


//        public static boolean inInterval(int a, int b)
//        { return a + b >= 10 && a + b <= 20;  }
//
//         //(Извините. Постоянно красная - java: illegal start of expression)


//     publuc static void printPositiveNumber ( int n){
//            if (n >= 0) {
//                System.out.println("Положительное");
//            } else {
//                System.out.println("Отрицательное");
//            }
//        //(Красное - java: not a statement)


//        public static void printHelloName(String name) {
//            System.out.println("Привет, " + name +);
//        }
//    //(name - красное. java: illegal start of expression


         public static boolean isLeapYear(int year) {
            return year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
        }
         public static void printIsLeapYearV2(int year) {
            if (isLeapYear(year)) {
                System.out.println("Год является высокосным");
            } else  {
                System.out.println("Год не является высокосным");
            }
        }
      //(Подчеркнуто красным. java: illegal start of expression
    }