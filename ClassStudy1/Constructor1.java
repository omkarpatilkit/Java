package ClassStudy1;

import java.util.Scanner;

public class Constructor1 {
    int age;
    String Name;
    int income;
    String Company;

    Scanner sc = new Scanner(System.in);

    Constructor1(String a, int b){
        this.Name= a;
        this.age = b;

    }

    public void Details(){
        System.out.println("Hello my name is "+ Name + " I am" + age + "years old");

    }

    public static void NotShow(){
        System.out.println("Hello there");
    }

   public void setincome(){
       System.out.println("Give income info: ");
       income =  sc.nextInt();
       sc.nextLine(); // add this after every numerical input
//       income = Integer.parseInt(sc.nextLine());  we can usee this also
//       Parsing like this will be more effective
   }

    public void setCompany() {
        System.out.println("Give compan info: ");
        Company = sc.nextLine();
    }

    public int getIncome(){
        return income;
    }

    public String getCompany(){
        return Company;
    }
}

