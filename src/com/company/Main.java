package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("4 of brunels basic engineering equations");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1. Calculate the angle between two adjacent propeller blades");
        calculateAngle("how many fins");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2. Calculate the width of an arch of a viaduct");
        System.out.println("The arch width is " + calculateArchWidth());
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3. Calculate the percentage slope of a train track");
        System.out.println("The percentage slope is " + calculatePercentSlope());
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("4. Calculate the Arc length of a bridge");
        System.out.println("The arc length is " + calculateArcLength());
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
    }

    public static float calculateAngle(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        float angle = 360 / scanner.nextFloat();
        System.out.println("The angle  is " + angle);
        return angle;

    }

    public static float calculateArchWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        float len = scanner.nextFloat();
        System.out.println("Enter the number of arches");
        int num = scanner.nextInt();
        float width = len / num;
        return width;
    }

    public static float calculatePercentSlope() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        float len = scanner.nextFloat();
        System.out.println("Enter the height");
        float height = scanner.nextFloat();
        float slope = (height / len) * 100;
        return slope;
    }

    public static double calculateArcLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        float len = scanner.nextFloat();
        System.out.println("Enter the height");
        float height = scanner.nextFloat();
        float radius = (height / 2) + ((len * len) / (8 * height));
        double theta = 2 * Math.asin(len / (2 * radius));
        double arcLength = ((2 * Math.PI * radius) * theta / 360);
        return arcLength;
    }

}

