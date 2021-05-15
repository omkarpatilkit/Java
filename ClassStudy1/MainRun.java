package ClassStudy1;

public class MainRun {
    public static void main(String[] args){
        Constructor1 Human = new Constructor1("Omkar", 23);
        Human.Details();
        Constructor1.NotShow();
//Human.NotShow();  this is not possible as method is static and not applicable on objects
        Human.setincome();

        Human.setCompany();

        System.out.println( Human.Name +" income is: " + Human.getIncome() + " while working in "+ Human.getCompany());
    }
}
