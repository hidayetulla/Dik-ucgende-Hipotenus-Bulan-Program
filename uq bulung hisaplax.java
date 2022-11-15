import java.util.Scanner;
public class pratik3{
    public static void main(String[] args) {
       int a , b ;
       double c;

       Scanner input = new Scanner(System.in);

       System.out.print("1. kanari giriniz:");
       a = input.nextInt();

       System.out.print("2.kanari giriniz:");
       b = input.nextInt();

       c = Math.sqrt((a*a)+(b*b));

       System.out.print("hepotenus:" + c);

    }
}