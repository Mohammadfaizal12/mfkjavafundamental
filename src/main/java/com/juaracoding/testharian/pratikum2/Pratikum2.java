package com.juaracoding.testharian.pratikum2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberArrays = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Masukan Nilai Array : ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                numberArrays.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Input bukan angka keluar dari program");
                isRunning = false;
            }
        }

        if (!numberArrays.isEmpty()) {
            double total = 0;
            for (int number : numberArrays) {
                total += number;
            }
            double avarageArrays = total / numberArrays.size();
            System.out.println("\nRata-rata dari input angka yang dimasukkan : ");
            for (int number : numberArrays) {
                System.out.println(number);
            }
            System.out.println("Rata-rata : " + avarageArrays);
        } else {
            System.out.println("Inputan harus berupa angka (silahkan masukkan angka)");
        }

    }
}
