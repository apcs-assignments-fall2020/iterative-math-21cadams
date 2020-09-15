import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(final double x) {
        double guess = 9;
        double guesstwo=0;
        while (guess*guess -x > 0.0000001){
            guesstwo = (guess + x/guess) / 2;
            guess =guesstwo;
        } 
        System.out.println("the square root is "+ guess);
        return guess;
    }

    // Calculates the factorial of a number
    public static double factorial(final int x) {
        double total =x;
        double counter=x-1;
        if(x==0){
            System.out.print(1);
            return(1);
        }
        while (counter!=1){
            total = total*counter;
            counter=counter-1;
        }
        System.out.print(total);
        return total;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        int counter = 1;
        double total=0;
        while (Math.abs(total-2.71828) > 0.0001){
            total= total+ (1/factorial(counter));
            counter++;
        }
        System.out.print("E is " + total);
        return total;
    }
    
    
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number ");
        final int num= scan.nextInt();
        babylonian(num);
        calculateE();
        // YOUR CODE HERE


        

        scan.close();
    }
}
