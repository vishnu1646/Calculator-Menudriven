import java.util.Scanner;

public class Calculator {
    public static int add(int num1,int num2){
        int sum = num1+num2;
    return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number /n 1.- Addition 2.Subtraction 3-Multiplication");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter two Number : ");
                Scanner sc1 = new Scanner(System.in);
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Sum is "+add(sc1.nextInt(),sc2.nextInt()));
        }
    }
}
