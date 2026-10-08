public class Loop {
    public static void main(String[] args) {
        int i = 1 ;
        //while loop
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        
        // do-while loop
        int b = 11;
        do {
            System.out.println(b);
            b++;
        } while(b <= 10);

        // menu item selection --> do while 
        /*
        1.play game 
        2. return saved ame 
        3.exit 
        */
        
        // for loop
        for  (int m = 1; m <= 10; m++) {
            System.out.println(m);
        }
        
        /*
        flow of ccontrol of for 
        1.first assignment statment is executed (variable defination)
        2.then second conditional statmengt is evaluted.(true/false)
        3.if true,control flow will evalute the body of the loop
        4.once loop body is finished, control flow will go back to the for statment , and ithird increment 
        statment will be evaluted
        5. again conditional statment is evaluted
        6.repeat 2 - 5
        */
        
        //nested loop
        for (int k = 1; k<= 5; k++){
            for (int l = 1; l <= k; l++){
                System.out.print("* ");
            }
        System.out.println();   
        }

        //jump statment in java
        // break, continue
        // prime number checker

        int p = 9;

        for (int t = 2; t < p; t++){
            if(p % t == 0) {
                System.out.println("the number is not prime");
                
            }
        }
    }
}
