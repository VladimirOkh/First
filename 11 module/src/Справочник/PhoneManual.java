package Справочник;

import java.util.Scanner;

public class PhoneManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

        private static boolean checkName(String name) {
            boolean isTrue;
            System.out.println("Введите ФИО");
            int blockCount = name.trim().split(" ").length;
            isTrue = blockCount == 3;
            return isTrue;
        }

}
