import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerID;
    String customerName;

    BankAccount(String cName, String cID) {
        customerID = cID;
        customerName = cName;
    }

    public void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Зачислено: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Снято: " + Math.abs(previousTransaction));
        } else System.out.println("Предыдущие транзакции отсутствуют");
    }

    public void Menu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Здравствуйте " + customerName);
        System.out.println("Ваш " + customerID);
        System.out.println("\n");
        System.out.println("A. Проверить баланс");
        System.out.println("B. Положить деньги");
        System.out.println("C. Снять деньги");
        System.out.println("D. Узнать предыдущую транзакцию");
        System.out.println("E. Выйти");

        do {
            System.out.println("=====================================");
            System.out.println("Введите опцию: A,B,C,D или E");
            System.out.println("=====================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("---------------------");
                    System.out.println("Баланс: " + balance);
                    System.out.println("---------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("---------------------");
                    System.out.println("Введите сумму для зачисления");
                    System.out.println("---------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("---------------------");
                    System.out.println("Введите сумму для снятия");
                    System.out.println("---------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("---------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------");
                    System.out.println('\n');
                    break;
            }
        }while (option != 'E');
        System.out.println("Всего доброго!");
    }
}
