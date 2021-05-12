package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiple = new int[size][size];
        for (int row = 0; row < multiple.length; row++) {
            for (int cell = 0; cell < multiple.length; cell++) {
                multiple[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return multiple;
    }
}