package ZooInheretance;

public class Zoo {
    public static void main( String[] args ) {
//        Animal a = new Animal(10, "Monkey" ,3.26f);
//        a.DisplayInfo();  we cannot create object of abstract class
//        a.Eating();   we can only create child from it
//        a.Sleep();  child can access methods init
        
        Bird b = new Bird( 2, "Blue Bird", 1.3f );
        b.Fly();
        b.DisplayInfo();
        
        Fish f = new Fish( 1, "Shark", 6.8f );
        f.Swim();
        f.DisplayInfo();
        
        
    }
}
