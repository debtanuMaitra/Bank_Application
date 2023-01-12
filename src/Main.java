import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Balance, Password to create account");

        //create user
        String name = sc.next();
        double balance = sc.nextDouble();
        String password = sc.next();
        SBIUser user = new SBIUser(name, balance, password);

        //add some amount
        System.out.println("How much money you want to add?");
        int amt = sc.nextInt();
        String message = user.addMoney(amt);
        System.out.println(message);

        //withdraw some money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money, pass));

        //rate of interest
        System.out.println("Interest on remaining balance after 10 years is " + user.calculateInterest(10));
    }
}