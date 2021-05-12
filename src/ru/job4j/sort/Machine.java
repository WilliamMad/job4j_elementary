package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int result = money - price;
        for (int i : coins) {
            while (result - i >= 0) {
                rsl[size] = i;
                result = result - i;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
