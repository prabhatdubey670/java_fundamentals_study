
// class in java 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int i = 0;
        while (i < 5) {
            System.out.print("Hello, World!\n Yo \n");
            i++;
        }
        ;
        ScanHello();
    }

    public static void ScanHello() {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.print(c);
    }
}