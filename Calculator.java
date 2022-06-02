import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nextOperation = 1;
        int a = 0, b = 0;
        float alpha = 0, beta = 0, gamma = 0;	

        while(nextOperation ==1){
            System.out.println("Choose your operation");
            System.out.println("(1) - Sum");
            System.out.println("(2) - Subtraction");
            System.out.println("(3) - Division");
            System.out.println("(4) - Multiplication");
            System.out.println("(5) - Bhaskara");
            System.out.println("(6) - Exit");
            
            int operation = scan.nextInt();

            if(operation == 5){
                System.out.println("Enter the coefficients of the function");
                System.out.println("a:");
                alpha = scan.nextInt();
                System.out.println("b:");
                beta = scan.nextInt();
                System.out.println("c:");
                gamma = scan.nextInt();
            }
            else if((operation == 1) || (operation == 2) || (operation == 3) || (operation == 4)){
                System.out.println("Enter the first number");
                a = scan.nextInt();
                System.out.println("Enter the second number");
                b = scan.nextInt();
            }
            else if(operation == 6){
                break;
            }

            switch(operation){
                case 1:
                    System.out.println("The sum of " + a + " and " + b + " is " + Sum.add(a, b));
                    break;
                case 2:
                    System.out.println("The subtraction of " + a + " and " + b + " is " + Subtraction.subtract(a, b));
                    break;
                case 3:
                    System.out.println("The division of " + a + " and " + b + " is " + Division.divide(a, b));
                    break;
                case 4:
                    System.out.println("The multiplication of " + a + " and " + b + " is " + Multiplication.multiply(a, b));
                    break;
                case 5:
                    float[] roots = Bhaskara.roots(alpha, beta, gamma);
                    System.out.println("The roots of equation " + alpha + "x^2 + " + beta + "x + " + gamma + " are: " + roots[0] + " and " + roots[1]);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("Do you want to continue? (1 - yes, 0 - no)");
            nextOperation = scan.nextInt();
        }
    }
}