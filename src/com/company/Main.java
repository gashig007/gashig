package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateRandomAge());

    }
    public static int generateRandomAge() {
        Random random = new Random();
        int math = random.nextInt(50);
        return  math;
    }
}
