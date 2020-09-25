package Справочник;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneManual {
    public static String[] names = new String[5];
    public static long[] phones = new long[5];
    public static long phone;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите ФИО");
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
            else {
                addName(names, name);
            }
        }
    }

    private static String[] addName(String[] names, String name) {
        if (names[names.length - 1] != null) {                       //если массив заполнен то создается новый массив большего размера
            PhoneManual.names = new String[names.length];            //а данные из прошлого массива переносятся в новый
            PhoneManual.names = names.clone();
            PhoneManual.names[names.length] = name;
            return PhoneManual.names;
        } else {
            for (int i = 0; i < names.length; i++) {
                if ((names[i] == null)){
                    names[i] = name;
                }
            }
        }
        return names;
    }


    private static boolean checkName(String name) {
        boolean isTrue;
        int blockCount = name.trim().split(" ").length;
        isTrue = blockCount == 3;
        return isTrue;
    }
}
