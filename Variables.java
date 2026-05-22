public class Variables {
    public static void main (String[] args) {
    // use all kind of the variables in java for better understing 
    // integers -- byte,shorts,int,long    
    byte b = 5;
    short s = 6;
    int i = 400;
    long l = 10000;

    System.out.println("integers values--" + b + "," + s + "," + i + "," + l );

    // floating values 
    float f = 10.98f;
    double d = 10.9878;

    System.out.println("float values--"+ f +"," + d);

    // character value 
    char c = 'a';

    System.out.println("character value--" +c);

    // binary,octal,hexadecimal converstion

    int x = 0b101;
    int y = 011;
    int z = 0XA;

    System.out.println("converstion value--"+ x + ","+ y + "," + z);

    // negative value in java 

    int n = -100;

    System.out.println("negative number=" + n );
    /*
    for the negative value firstly java convert the value in binary code
    then that binary codes will convert 1's compliment and then in 2's compliment 
    after that all if the first value of the binary code is one then the actual value is negativeg */

    // floating values in java 

    float j = 0.7f;

    System.out.printf("%.20f%n",j);

    // implicit conversion byte to int
        byte ab = 24;
        int  ib ;

        ib = ab ;

        System.out.println(ib);

            
     // character to int conversion
        char ca = 'a';
        int ic ;

        ic = ca ;
    System.out.println(ic);

    // explicit converstion
        int id = 400;
        byte bi ;

        bi = (byte) id;
        
        System.out.println(bi);

    // truncating conversion
    float uf = 15.786f;
    int fi ;

    fi = (int) uf ;
    System.out.println(fi);
        

    // byte convertion 

    byte bb = 67;
    bb = (byte) (bb * 2);

    System.out.println(bb);
    }
}
