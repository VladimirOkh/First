package Справочник;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneManual {
    public static String[][] Manual = new String[5][1];
    public static String phone;
    public static String name = null;
    public static boolean isCorrectName = false;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
            System.out.println("Введите ФИО");
            name = scanner.nextLine();
            checkName(name);

    }




    private static void formatNumber(String name, String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1, 4) + " " +
                clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);
    }

    private static void checkName(String name) {
        int blockCount = name.trim().split(" ").length;
        PhoneManual.isCorrectName = blockCount == 3;
        if (PhoneManual.isCorrectName) {
            System.out.println("Введите номер");
            phone = scanner.nextLine();
            formatNumber(name, phone);
        } else {
            System.out.println("Введите корректное имя!");
            checkName(name = scanner.nextLine());
        }
    }
}

