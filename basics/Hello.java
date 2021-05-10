package basics;

public class Hello {
     public static void main(String[] args){
         int n = 0;
         n = SupportingClass.ForLoop(n);
         // this is for commenting thing
         System.out.println("Hello world");
         for (int i  = 0; i < n ; i++){
             System.out.println(i);
             // this is for git
         }
         printThis();
         SupportingClass.printfromClass();


    }

    public static void printThis(){
         System.out.println("I an a new method");
    }
}
