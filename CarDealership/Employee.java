package CarDealership;

public class Employee {
    
    String name;
    public Employee( String name ) {
        this.name = name;
    }
    
    public void handleCust( Customer customer , Vehical vehical , boolean finReq){
        System.out.println("I am "+ this.name+" handling " + customer.getName() );
        if (finReq){
           float loanAmount = vehical.price - customer.getCash();
            System.out.println("Loan will be " + loanAmount + " for "
                                       + vehical.brand + vehical.year);
            LoanCalc.loanDetails(loanAmount);
        }
        
        else{
            if ( vehical.price < customer.getCash() ) {
                System.out.println( "Please bring more cash" );
            }

            else {
                System.out.println("Congratulations for the car");
            }
        }
    }
    
    
}
