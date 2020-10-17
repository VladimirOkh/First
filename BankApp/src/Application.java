import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");;
        System.out.println("Введите имя");
        System.out.println("---------------------");;
        String name = sc.nextLine();
        System.out.println("---------------------");;
        System.out.println("Введите ID");
        System.out.println("---------------------");;
        String id = sc.nextLine();
        BankAccount account = new BankAccount(name,id);
        account.menu();
    }
}
