package ru.gb.lesson.homeWork4;


import java.lang.Math;


public class TriangleSquare {


    public static void main(String[] args) {
        //SquareTriangle(6,3,4);

    }
    //TriangleSquare square = new TriangleSquare();

    public static boolean SquareTriangle(int a1, int b1, int c1) {

        double a = a1;
        double b = b1;
        double c = c1;


        if (a + b - c <= 0 || a + c - b <= 0 || c + b - a <= 0) {
            // throw new IllegalArgumentException("The sides must be positive or triangle isn't valid");
            return false;
        }

        double halfPerimeter = (a + b + c) / 2;
        //System.out.println("Half Perimeter is " + halfPerimeter);
        int square = (int) (double) (Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));
        //String result = String.format("Результат"+ square);
        System.out.println("Square of triangle is " + square);
        return true;
        //return square;
    }

}