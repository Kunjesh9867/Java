import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of number is: "+c);
    }
}
