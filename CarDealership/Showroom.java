package CarDealership;

public class Showroom {
    public static void main(String[] args){
    Vehical BMW2015 = new Vehical("BMW", 2015 , 40f  );
    Vehical Audi2019 = new Vehical( "Audi", 2019 , 30f );
    Vehical BMW2020 = new Vehical( "BMW" , 2020 ,90f );
    
    Employee e1 = new Employee( "Suresh" );
    Employee e2 = new Employee( "Ramesh" );
    
    Customer c1 = new Customer( "Ambani" , 20f );
    c1.wantToBuy( BMW2020 ,e2  );
    
    
    
    }
}
