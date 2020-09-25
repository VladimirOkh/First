package Справочник;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneManual {
    public static String[][] Manual = new String[5][1];
    public static String phone;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            boolean isCorrectName = false;
            while (!isCorrectName) {
                System.out.println("Введите ФИО " + i);
                String name = scanner.nextLine();
                isCorrectName = checkName(name);
                if (!isCorrectName)
                    System.out.println("Введите корректное имя!");
                else {
                    addPerson(Manual,name,phone);
                }
            }
        }
    }
    public static String[][] addPerson(String Manual[][],String name,String phone){

        return String[][];
    }





    private static boolean checkName(String name) {
        boolean isTrue;
        int blockCount = name.trim().split(" ").length;
        isTrue = blockCount == 3;
        return isTrue;
    }
}
