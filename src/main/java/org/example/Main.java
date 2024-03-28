package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Requesting input for side lengths
        System.out.println("Masukkan panjang sisi segitiga:");
        System.out.print("Sisi A: ");
        int a = scanner.nextInt();
        System.out.print("Sisi B: ");
        int b = scanner.nextInt();
        System.out.print("Sisi C: ");
        int c = scanner.nextInt();

        // Checking valid input and valid triangle criteria
        checkValidRightTriangleInput(a, b, c);

        // Checking if the triangle is a right triangle
        if (isRightTriangle(a, b, c)) {
            System.out.println("Segitiga ini adalah segitiga siku-siku.");
        } else {
            System.out.println("Segitiga ini bukan segitiga siku-siku.");
        }
    }

    // Method for checking if the input is valid and meets the criteria for a right triangle
    private static void checkValidRightTriangleInput(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Panjang sisi tidak boleh negatif atau nol.");
            System.exit(1); // Terminate the program
        }

        // Check if the input forms a valid triangle
        if (!isValidTriangle(a, b, c)) {
            System.out.println("Error: Tidak memenuhi syarat segitiga.");
            System.exit(1); // Terminate the program
        }

        // Check if the triangle is a right triangle
        if (isRightTriangle(a, b, c)) {
            System.out.println("Segitiga ini adalah segitiga siku-siku.");
        } else {
            System.out.println("Segitiga ini bukan segitiga siku-siku.");
        }
    }

    // Method for checking if the given sides form a valid triangle
    public static boolean isValidTriangle(int a, int b, int c) {
        int shortestSide = Math.min(a, Math.min(b, c));
        int sumOfOtherSides = a + b + c - shortestSide;
        return shortestSide < sumOfOtherSides;
    }

    // Method for checking if the triangle meets the criteria for a right triangle
    public static boolean isRightTriangle(int a, int b, int c) {
        // Memeriksa apakah sisi terpanjang memenuhi syarat segitiga siku-siku
        int hypotenuse = Math.max(a, Math.max(b, c));
        int oppositeSide, adjacentSide;

        if (hypotenuse == a) {
            oppositeSide = b;
            adjacentSide = c;
        } else if (hypotenuse == b) {
            oppositeSide = a;
            adjacentSide = c;
        } else {
            oppositeSide = a;
            adjacentSide = b;
        }

        return hypotenuse * hypotenuse == oppositeSide * oppositeSide + adjacentSide * adjacentSide;
    }
}
