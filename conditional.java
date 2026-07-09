public class conditional {
    public static void main(String[] args) {
            int c = 5;

            //selection statments
            //normal if 
            if (c == 5) {
                System.out.println("c is 5");
            }
            else {
            System.out.println("c is les than 5");
            }
            // for the sinlge statment we can ignore the middle brackets
            
            
            //Nested if
            /*int i = 7;
            if (i > 5) {
                if(i < 10){
                if(7 == i){

                }

                }
                else {

                }
            
            }    
            else{

            }
            
        }*/


        // if-else-if ladder conditional  
            int age = 50;
        
            if (age > 80) {
                System.out.println("you are very old");
            }
            else if (age > 60) {
                System.out.println("you are old");
            }
            else if (age > 40) {
                System.out.println("you are becoming old");
            }
            else if (age > 20) {
                System.out.println("you are young");
            }
            else {
                System.out.println("you are a child");
            }


            //Switch condition
            int m = 3;

            switch(m) {
                case 1:
                    System.out.println("m is 1");
                    break;
                case 2:
                    System.out.println("m is 2");
                    break;
                case 3:
                    System.out.println("m i s 3");
                    break;
                default:
                    System.out.println("m is greater than 3")

            } 
        }        
}   