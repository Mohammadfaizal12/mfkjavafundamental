package com.juaracoding.testharian.pratikum1;
import java.util.Scanner;

public class Pratikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan string : ");
        String input = scanner.nextLine();

        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);
            boolean isHurufBesar = Character.isUpperCase(karakter);
            boolean isBukanHuruf = !Character.isLetter(karakter);

            if (isHurufBesar || isBukanHuruf) {
                total += (int) karakter;
            }

        }
        System.out.println("Hasil: " + total);
        scanner.close();
    }
}
