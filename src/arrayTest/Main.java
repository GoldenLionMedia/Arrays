package arrayTest;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double[] prices = new double[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 prices: ");
            prices[0]= in.nextDouble();
            prices[1]= in.nextDouble();
            prices[2]= in.nextDouble();
            prices[3]= in.nextDouble();
            prices[4]= in.nextDouble();
            double total= prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
        System.out.printf("The total is $%5.2f",total);
    }
}
