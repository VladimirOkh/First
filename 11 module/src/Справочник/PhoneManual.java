package Справочник;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneManual {
    public static String[][] Manual = new String[5][2];
    public static String phone;
    public static String name = null;
    public static boolean isCorrectName = false;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        name = scanner.nextLine();
        checkName(name);
        System.out.println(Arrays.deepToString(Manual));
    }

    public static void addPerson(String name, String phone) {
        if (Manual[Manual.length - 1][0] != null) {
            String[][] Temp = new String[Manual.length][2];
            for (int i = 0; i < Manual.length; i++)
                for (int j = 0; j < Manual[i].length; j++)
                    Temp[i][j] = Manual[i][j];
            Manual = new String[Manual.length][1];
            for (int i = 0; i < Temp.length; i++)
                for (int j = 0; j < Temp[i].length; j++)
                    Manual[i][j] = Temp[i][j];
                Manual[Manual.length-1][0] = name;
                Manual[Manual.length-1][1] = phone;
        }else {
            for (int i = 0; i < Manual.length; i++) {
                if (Manual[i][0] == null){
                    Manual[i][0] = name;
                    Manual[i][1] = phone;
                    break;
                }
            }
        }
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }



    private static void formatNumber(String name, String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1, 4) + " " + clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);
        addPerson(name, result);
    }

    private static void checkName(String name) {
        int blockCount = name.trim().split(" ").length;
        PhoneManual.isCorrectName = blockCount == 3;
        if (PhoneManual.isCorrectName) {
            System.out.println("Введите номер");
            phone = scanner.nextLine();
            formatNumber(formatName(name), phone);
        } else {
            System.out.println("Введите корректное имя!");
            checkName(name = scanner.nextLine());
        }
    }
}

