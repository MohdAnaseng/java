public class Operator {
    public static void main (String[] args)
    {

    // operator in java
    // arithmetic operator-- +, -, *, /, %, +=, -=, /=, %=, ++, --

    int a = 5 ;
    int b = 10 ;

    int d = a + b;
    int e = a - b;
    int f = a * b;
    int g = a / b;

    
    System.out.println("values--" +d+","+e+","+f+","+g);
     
    int h = a + 2;

    //h = h + 2;
    h +=2; // h = h + 2;
    h -=2; // h = h - 2;
    h /=3; // h = h / 3;
    h %=5; // h = h % 5;
    System.out.println(h);

    }
}