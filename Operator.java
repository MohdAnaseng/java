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

    // pre increment and post increment/decrement

    int i = 6;
    i++; // i = i + 1; // i =+ 1
    i--; // i = i - 1; // i =+ 1

    System.out.println(i);

    int j = 7;
    j++; // postfix increment
    ++j; // prefix increment

    // j = 9
    int k = j++;// K = j; J = J + 1;
    System.out.println(k+ "," +j);

    int l =  ++j; // L = j + 1;
    System.out.println(j+ "," +l);

    
    // Relationl operator ; == , != , < , > , <= , >=
        int m = 10;
        int n = 5;
    
        boolean o = (m == n);
        boolean p = (m != n);

        System.out.println(o+ "," +p);

        boolean q = (m <= n);
        boolean r = (m >= n);

        System.out.println(q+ "," +r);

        //Bitwise operator;

        int s = 2;
        int x = 3;

        int v = s & x ;
        int u = s | x ;


        System.out.println(v+ "," +u);

    }
}