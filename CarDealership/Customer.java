package CarDealership;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Customer {
    private  String name ;
    private  float cash ;
    Scanner sc = new Scanner( System.in );
    
    
    public Customer( String name, float cash ) {
        this.name = name;
        this.cash = cash;
    }
    
   
    public void wantToBuy(Vehical v1, Employee emp){
        AtomicBoolean financeReq = new AtomicBoolean( false );
        int i ;
        if (v1.price > this.getCash()){
            System.out.println("Do you want loan?");
            System.out.println("1. Required \n2. Not required");
            i = sc.nextInt();
            switch ( i ) {
                case 1 -> financeReq.set( true );
                case 2 -> {
                    financeReq.set( false );
                    System.out.println( "Please bring more cash" );
                }
            }
        }
        
        emp.handleCust( this ,v1 , financeReq.get() );
    }
    
    public String getName() {
        return name;
    }
    
    public void setName( String name ) {
        this.name = name;
    }
    
    public float getCash() {
        return cash;
    }
    
    public void setCash( float cash ) {
        this.cash = cash;
    }
}
