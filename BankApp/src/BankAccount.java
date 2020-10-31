import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    double balance;
    double previousTransaction;
    String customerPassword;
    String customerID;

    BankAccount(String cID, String cPass) {
        this.customerPassword = cPass;
        this.customerID = cID;
    }

    public void deposit(double amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(double amount) {
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

    public void menu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Здравствуйте!");
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
                    System.out.println("A. Проверить баланс");
                    System.out.println("B. Положить деньги");
                    System.out.println("C. Снять деньги");
                    System.out.println("D. Узнать предыдущую транзакцию");
                    System.out.println("E. Выйти");
                    break;
                case 'B':
                    try {
                        System.out.println("---------------------");
                        System.out.println("Введите сумму для зачисления");
                        System.out.println("---------------------");
                        int amount = sc.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        System.out.println("A. Проверить баланс");
                        System.out.println("B. Положить деньги");
                        System.out.println("C. Снять деньги");
                        System.out.println("D. Узнать предыдущую транзакцию");
                        System.out.println("E. Выйти");
                        break;
                    } catch (Exception e) {
                        System.out.println("Попробуйте еще раз");
                        menu();
                    }
                case 'C':
                    if (balance > 0) {
                        System.out.println("---------------------");
                        System.out.println("Введите сумму для снятия");
                        System.out.println("---------------------");
                        try {
                            int amount2 = sc.nextInt();
                            if (amount2 > balance) {
                                System.out.println("Недостаточно средств на балансе! Вы не можете снять больше чем: " + balance);
                                break;
                            }
                            withdraw(amount2);
                            System.out.println("\n");
                            System.out.println("A. Проверить баланс");
                            System.out.println("B. Положить деньги");
                            System.out.println("C. Снять деньги");
                            System.out.println("D. Узнать предыдущую транзакцию");
                            System.out.println("E. Выйти");
                            break;
                        } catch (Exception e) {
                            System.out.println("Попробуйте еще раз");
                            menu();
                        }
                    } else {
                        System.out.println("Недостаточно средств на балансе!");
                        break;
                    }
                case 'D':
                    System.out.println("---------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------");
                    System.out.println('\n');
                    System.out.println("A. Проверить баланс");
                    System.out.println("B. Положить деньги");
                    System.out.println("C. Снять деньги");
                    System.out.println("D. Узнать предыдущую транзакцию");
                    System.out.println("E. Выйти");
                    break;
                case 'E':
                    System.out.println("*******************************");
                    break;
                default:
                    System.out.println("Неверная опция. Пожалуйста попробуйте еще раз.");
                    break;
            }
        } while (option != 'E');
        System.out.println("Всего доброго!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount account = (BankAccount) o;
        return Objects.equals(customerPassword, account.customerPassword) &&
                Objects.equals(customerID, account.customerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerPassword, customerID);
    }
}
