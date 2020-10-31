import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<BankAccount> customers = new HashSet<>();
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

        System.out.println("---------------------");
        System.out.println("Введите пароль");
        System.out.println("---------------------");
        String password = sc.nextLine();
        ID = ID.replace(ID.charAt(0), 'A');
        BankAccount tempAcc = new BankAccount(ID,password);
        if(customers.contains(tempAcc)){
            for(BankAccount acc:customers){
                if(acc.equals(tempAcc)){
                    acc.menu();
                }
            }
        }else System.out.println("ID или пароль были введены неверно, пожалуйста попробуйте еще раз");
    }

}
