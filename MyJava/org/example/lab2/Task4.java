package org.example.org.example.lab2;

public class Task4 {

    //Не получится, так как создаются копии
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    //Получится, так как это динамические объекты и в функцию приходят не копии, а ссылки на объекты(класс устарел работает с версией JDK11)
    /*
    public static void swap(IntHolder a, IntHolder b) {
        int c = a.value;
        a.value = b.value;
        b.value = c;
    }*/
    //Не получится, так как создаются копии
    public static void swap(Integer a, Integer b) {
        Integer c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        //int
        int a = -1;
        int b = 1;
        swap(a, b);
        System.out.println("a = " + a + "\nb = " + b);
        //IntHolder
        /*        IntHolder a = new IntHolder();
        IntHolder b = new IntHolder();
        a.value = -1;
        b.value = 1;
        swap(a,b);
        System.out.println("a = " + a.value + "\nb = " + b.value);*/
        //Integer
        Integer a1 = -1;
        Integer b1 = 1;
        swap(a1, b1);
        System.out.println("a = " + a1 + "\nb = " + b1);
    }
}