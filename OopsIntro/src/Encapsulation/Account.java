package Encapsulation;

import java.util.Scanner;

public class Account {
    private double Balance = 99;

    public double getBalance(){
        System.out.println("if user inputs 0 return balance");
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();

        if(inp == 0){
            return Balance;
        }
        else{
            return -1;
        }

    }

    public double setBalance(int newBalance) {

        if (newBalance >= 0) {
            System.out.print("your balance is ");
            Balance = Balance + newBalance;
        } else {
            System.out.println("error");
        }
        return Balance;
    }
}
