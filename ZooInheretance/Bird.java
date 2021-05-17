package ZooInheretance;

public class Bird extends Animal{


    Bird(int Age, String Name, float Weight) {
        super(Age, Name, Weight);
    }

    public void Fly(){
        System.out.println("This animal is flying.");
    }
}
