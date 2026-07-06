import java.util.Scanner;
public class input {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in); {
        System.out.println("enter the value of first number :");
        int firstnum = sc.nextInt();
        System.out.println("enter the value of second number :");
        int secondnum = sc.nextInt();
        int ans = firstnum + secondnum;
        System.out.println("answer is :" + ans);
        } 
    }
}
50