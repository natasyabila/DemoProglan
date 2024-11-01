package org.example;

import java.util.Scanner;

public class Main {
    // Refactor 3: Ekstraksi konstanta untuk pesan prompt
    private static final String INPUT_PROMPT = "Masukkan bilangan desimal: ";

    public static void main(String[] args) {
        // Refactor 1: Memisahkan pengambilan input dan konversi dalam metode terpisah
        try (Scanner scanner = new Scanner(System.in)) {
            int decimalNumber = getInputFromUser(scanner);
            String binary = convertDecimalToBinary(decimalNumber);
            displayBinaryResult(binary);
        }
    }

    // Refactor 1: Ekstraksi fungsi untuk pengambilan input
    private static int getInputFromUser(Scanner scanner) {
        System.out.print(INPUT_PROMPT);
        return scanner.nextInt();
    }

    // Refactor 1: Ekstraksi fungsi untuk konversi desimal ke biner
    private static String convertDecimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Refactor 1: Ekstraksi fungsi untuk menampilkan hasil
    private static void displayBinaryResult(String binary) {
        System.out.println("Bilangan biner: " + binary);
    }
}
