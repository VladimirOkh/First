import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> customers = new ArrayList<>();
        BankAccount A0000 = new BankAccount("A0000", "123");
        BankAccount A0001 = new BankAccount("A0001", "123");
        BankAccount A0002 = new BankAccount("A0002", "123");
        customers.add(A0000);
        customers.add(A0001);
        customers.add(A0002);
        System.out.println("---------------------");
        System.out.println("Введите ваш личный ID");
        System.out.println("---------------------");
        String ID = sc.nextLine();
        ID = ID.replace(ID.charAt(0), 'A');
        int i = 0;
        while (i < customers.size()) {
            if (customers.get(i).customerID.equals(ID)) {
                System.out.println("---------------------");
                System.out.println("Введите пароль");
                System.out.println("---------------------");
                String password = sc.nextLine();
                if(customers.get(i).customerPassword.equals(password))
                    customers.get(i).menu();
                else
                    System.out.println("Пароль введен неверно");
                System.exit(0);
            }
            i++;
        }
        System.out.println("Пользователь с таким ID не зарегистрирован");
    }
}
