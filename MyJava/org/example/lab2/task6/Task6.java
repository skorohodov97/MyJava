package org.example.org.example.lab2.task6;

public class Task6 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p1);
        System.out.print("x: " + p1.getX() + ", y: " + p1.getY() + "\n");

        Point p2 = new Point();
        System.out.println(p2);
    }
}
