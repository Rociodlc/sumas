import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        System.out.println("ingrese el primer numero ");
        num1=sc.nextInt();

        System.out.print("ingrese el segundo numero");
        num2=sc.nextInt();

        System.out.println("el resultado es:" +(num1+num2));
    }
}
