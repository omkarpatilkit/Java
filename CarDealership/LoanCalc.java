package CarDealership;

import java.lang.Math.*;

import java.util.Scanner;

abstract public class LoanCalc {
    
    
    
    public static void loanDetails(float d) {
        float diff ;
        int timeMonths;
       
        diff = d;
        Scanner sc = new Scanner( System.in );
        
        int i;
        System.out.println("Please choose time period");
        System.out.println("1. 12 months\n2. 24 months\n3. 36 months");
        
        i = sc.nextInt();
        
        switch (i) {
            case 1 -> timeMonths = 12;
            case 2 -> timeMonths = 24;
            case 3 -> timeMonths = 36;
            default -> throw new IllegalStateException( "Unexpected value: " + i );
        }
        
        float a ;
        a = diff / (float ) timeMonths;
        a = Math.round( a );
    
        System.out.println("EMI is "+ a + " for time " + timeMonths
        + " months");
        
        
    
    }
}
