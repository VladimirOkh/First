package Справочник;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneManual {
    public static String[] names = new String[5];
    public static long[] phones = new long[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите ФИО");
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
            else {
                for (int i = 0; i < names.length; i++) {
                    if ((names[i] == null)) names[i] = name;
                    System.out.println(Arrays.toString(names));
                    break;
                }
            }
        }
    }


    private static boolean checkName(String name) {
        boolean isTrue;
        int blockCount = name.trim().split(" ").length;
        isTrue = blockCount == 3;
        return isTrue;
    }
}
