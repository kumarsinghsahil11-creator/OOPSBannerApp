import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

        double fee;
        double discountPercent;
        double discount;
        double finalFee;

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the student fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the university discount percent: ");
        discountPercent = input.nextDouble();

        // Calculate discount
        discount = (fee * discountPercent) / 100;

        // Calculate final fee
        finalFee = fee - discount;

        // Print output
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}