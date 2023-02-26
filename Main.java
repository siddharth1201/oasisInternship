package atminterface;

import java.util.*;


public class Main {
    static int balance;

    public static boolean checkPin(int pin){
        int[] pins = {1234,4444,1237,4567,5678,8976,7766,1122,3344,5566,7788};
        for(int i = 0;i<pins.length;i++){
            balance = 5000;
            if(pin == pins[i]){
                
                return true;
            }
        }
        return false;
    }

    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        int acc = sc.nextInt();
        System.out.println("Enter pin:");
        int pin = sc.nextInt();
        boolean correct = checkPin(pin);
        if(correct==true){
            System.out.println("==================================================================================");
            System.out.println("Choose account type:\n 1. Savings Account \n 2. Current Account");
            int accountType = sc.nextInt();
            displayMenu();
        }
        return;
    }

    public static void tHistory(){
        System.out.println("==================================================================================");
        System.out.println("You have no previous transactions.");
        displayMenu();
    }

    public static void withdraw(int amount){
        if(amount<balance){
            balance = balance - amount;
            System.out.println("==================================================================================");
            System.out.println("Rs"+amount+" has been debited from the account");
            displayMenu();
            return;
        }
        System.out.println("Insufficient balance");
        
    }

    public static void deposit(int amount){
        balance = balance + amount;
        System.out.println("==================================================================================");
        System.out.println("Rs"+amount+" has been credited to the account");
        displayMenu();
    }

    public static void transfer(int accNum, int amount){
        balance -= amount;
        System.out.println("==================================================================================");
        System.out.println("Rs"+amount+" has been transferred to account number :"+accNum);
        displayMenu();
    }   


    public static void quit(){
        
        return;
    }

    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nChoose action type:\n\n 1. Transaction History \n\n 2. Withdraw \n\n 3. Deposit \n\n 4. Transfer \n\n 5. Quit\n");
        System.out.print("Enter your choice:");
        int action = sc.nextInt();
        switch(action){
            case 1: tHistory(); 
            break;
            case 2: 
            System.out.print("Enter withdraw Amount:");
            int amount = sc.nextInt();
            withdraw(amount);
            break;
            case 3: 
            System.out.print("Enter deposit Amount:");
            int depAmount =sc.nextInt();
            deposit(depAmount);
            break;
            case 4: 
            System.out.print("Enter account number to which you want to transfer:");
            int accNum = sc.nextInt();
            System.out.print("Enter transfer Amount:");
            int amo = sc.nextInt();
            transfer(accNum, amo);
            break;
            case 5: quit();
            break;
            default: System.out.println("Invalid Input");
        }
        return;
    }

    public static void main(String[] args){
        start();
    }
}
