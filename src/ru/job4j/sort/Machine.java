package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int result = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (result - coins[i] >= 0) {
                rsl[size] = coins[i];
                result = result - coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
