package org.example;


import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Задание 1 Повторение каждого символа n раз: "+repeat("mice",5));//Повторение каждого символа n раз
        System.out.println("Задание 2 Разница между максимальным и минимальным значением: "+differenceMaxMin(new int [] {10, 4, 1, 4, -10, -50, 32, 21}));// Разница между максимальным и минимальным значением
        System.out.println("Задание 3 Среднее значение: "+isAvgWhole(new int [] {1, 3}));//Среднее значение
        System.out.println("Задание 4 Вывод значений массива сложенных с самим собой и предыдущими элементами: "); cumulativeSum(new int [] {1,2,3});//Вывод значений массива сложенных с самим собой и предыдущими элементами
        System.out.println("Задание 5 Сколько десятичных знаков: "+getDecimalPlaces("43.20"));// Сколько десятичных знаков
        System.out.println("Задание 6 Число фибоначи: "+Fibonacci(3));//Числа фибоначи
        System.out.println("Задание 7 Проверка почтовых индексов: "+isValid("59001"));//Проверка почтовых индексов
        System.out.println("Задание 8 Пара строк по определ условиям: "+isStrangePair("ratio", "orator") );//Пара строк по определ условиям
        System.out.println("Задание 9 Префикс: "+isPrefix("automation", "auto-"));//Префикс
        System.out.println("Задание 9.2 Суффикс: "+isSuffix("arachnophobia", "-phobia"));//Суффикс
        System.out.println("Задание 10 Шаги-клетки: "+boxSeq(1));//Шаги-клетки


    }
    //Повторение каждого символа n раз
    public static String repeat(String s, int n){
        String news="";
        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j <n; j++) {
                news+=s.charAt(i);
            }
        }
        return news;
    }
    // Разница между максимальным и минимальным значением
    public static int differenceMaxMin (int [] mas){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <mas.length; i++) {
            if(mas[i]>max){
                max=mas[i];
            }
            else{
                if(mas[i]<min){
                    min=mas[i];
                }
            }
        }
        return max-min;
    }
    //Среднее значение
    public static boolean isAvgWhole (int [] mas){
        int middle=0;
        for (int i = 0; i <mas.length; i++) {
            middle+=mas[i];
        }
        return (middle%mas.length)==0;
    }
    //Вывод значений массива сложенных с самим собой и предыдущими элементами
    public static void cumulativeSum(int [] array){
        int sum=0;
        int[] array1 = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j <= i; j++)
                array1[i] += array[j];
        }
        System.out.println(Arrays.toString(array1));
    }
    // Сколько десятичных знаков
    public static int getDecimalPlaces(String s){
        int da=s.indexOf(".");
        int Length=s.length()-da-1;
        return Length;
    }
    // Числа фибоначи
    public static int Fibonacci(int n)
    {
        if (n <= 2) {
            return 1;
        } else {
            int s = 0;
            int f1 = 1;
            int f2 = 1;
            for(int i = 2; i <=n; i++){
                s = f1+f2;
                f1=f2;
                f2=s;
            }
            return s;
        }
    }

    //Проверка почтовых индексов
    public static boolean isValid(String s){

            if(!s.matches("[0-9]+")){
                return false;
            }
        return s.length() == 5;
    }
    //Пара строк по определ условиям
    public static boolean isStrangePair(String s,String s2){
        if(s.isEmpty()){return false;}
        else if(s.charAt(0)==s2.charAt(s2.length()-1)){
            if(s2.charAt(0)==s.charAt(s.length()-1)){
                return true;
            }
            else return false;
        }
        else return false;
    }
    //Префикс
    public static Boolean isPrefix (String a,String b){
        if(a == null || b == null) return false;
        if(b.length() <= 1 || !b.endsWith("-")) return false;

        return a.startsWith(b.substring(0,b.length()-1));
    }
    //Суффикс
    public static Boolean isSuffix (String a,String b){
        if(a == null || b == null) return false;
        if(b.length() <= 1 || !b.startsWith("-")) return false;

        return a.endsWith(b.substring(1));
    }
    //Шаги-клетки
    public static int boxSeq(int n){
        int count=0;
        if (n==0) return 0;
        for (int i = 1; i <=n; i++) {
            if(i%2!=0) count+=3;
            else count--;
        }
        return count;
    }
}