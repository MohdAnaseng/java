import java.math.BigInteger;
import java.util.Scanner;

public class input {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of first number :");
        int firstnum = sc.nextInt();
        System.out.println("enter the value of second number :");
        int secondnum = sc.nextInt();
        int ans = firstnum + secondnum;
        System.out.println("answer is :" + ans);

        System.out.println("BigInteger: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("enter the boolean value :");
        boolean flag = sc.nextBoolean();
        

        System.out.println("enter the short value");
        short shortval = sc.nextShort();
        
        System.out.println("answer is :" + bg);
        System.out.println("answer is :" + shortval);
        System.out.println("answer is :" + flag);

        }
    }