package org.example;


public class task1 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println("Задание 1 Остаток от деления: " +remaider(1,3) );//Остаток от деления
        System.out.println("Задание 2 Площадь треугольника: " +triArea(3,2));//Площадь треугольника
        System.out.println("Задание 3 Ноги животных: " +animals(2,3,5));//Ноги животных
        System.out.println("Задание 4 Выгода при игре: " +profitableGamble(0.2,50,9));//Функция
        System.out.println("Задание 5 Действия с числами: " +operation(24, 15, 9));//Действие с числами
        System.out.println("Задание 6 Преобразование в номер по таблице ASCII: " +ctoa('A'));//Преобразование в номер по таблице ASCII
        System.out.println("Задание 7 Факториал: " +addUpTo(3));//Факториал
        System.out.println("Задание 8 Максимальное значение третьего ребра: " +nextEdge(8,10));//Максимальное значение третьего ребра
        System.out.println("Задание 9 Сумма кубов массива чисел: " +sumOfCubes(nums));//Сумма кубов массива чисел
        System.out.println("Задание 10 Функция добавления числа к самому себе n раз и проверка деления: " +abcmath(42, 5, 10));//Функция добавления числа к самому себе n раз и проверка деления

    }
    //Задание №1
    public static int remaider(int a, int b){
        return a%b;
    }
    //Задание №2
    public static int triArea(int a, int b){
        return (a*b)/2;
    }
    //Задание №3
    public static int animals (int a, int b, int c){
        int chic=2,cow=4,pig=4;
        return chic*a+cow*b+pig*c;
    }
    //Задание №4
    public static boolean profitableGamble(double a,int b, int c){
        if((a*b-c)>0){
            return true;
        }
        else return false;
    }
    //Задание №5
    public static String operation (int c, int b,int a){
        String s="none";
        if (a+b==c){
            s="added";
        }
        else{
            if(a-b==c || b-a==c){
                s="subtracted";
            }
            else{
                if(a*b==c){
                    s="multiplicated";
                }
                else{
                    if (a/b==c || b/c==c){
                        s="separated";
                    }
                }
            }
        }
        return (s);
    }
    //Задание №6
    public static int ctoa (char a){
        return (int)a;

    }
    //Задание №7
    public static int addUpTo(int a){
        int i=0,sum=0;
        while (i!=a){
            i++;
            sum+=i;

        }
        return sum;
    }
    //Задание №8
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
    //Задание №9
    public static int sumOfCubes(int [] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=(a[i]*a[i]*a[i]);

        }
        return sum;
    }
    //Задание №10
    public static boolean abcmath(int a, int b, int c){
        int i=0;
        while (i!=b){
            a=a*2;
            i++;
        }
        return a % c == 0;
    }

}