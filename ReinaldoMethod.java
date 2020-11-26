
import java.util.Scanner;


public class ReinaldoMethod {

    public static void main(String[] args) {
    reinaldoMethod();   
    }
    public static void reinaldoMethod(){
        /**
         *@author Reinaldo2020360
         *basic sum
         */
            
        Scanner myKB = new Scanner (System.in);
     
        System.out.println  ("Welcome to my simple calculator, lets divide some numbers \n"
                            +"Type the first number: ");

        Double number1 = myKB.nextDouble();

        System.out.println("Type the second number: ");

        Double number2 = myKB.nextDouble();
        
        double n3 = (number1 / number2);
    
        
        System.out.println("your result is :" +n3 );
        
      
       
        }
    }

