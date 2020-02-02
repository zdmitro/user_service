import java.util.Scanner;

public class ProcessData {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double amount;
        boolean taxable;
        double total;

        System.out.println("Amount: ");
        amount = keyboard.nextDouble();
        System.out.println("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        if (taxable){
            total = amount * 1.05;
        } else {
            total = amount;
        }

        System.out.println("Total: ");
        System.out.println(total);

        keyboard.close();
    }
}
