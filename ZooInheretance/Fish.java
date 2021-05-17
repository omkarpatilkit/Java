package ZooInheretance;

public class Fish extends Animal {
    Fish (int Age , String Name , float Weight){
        super(Age, Name , Weight);
    }

    public void Swim (){
        System.out.println("this animal is swimming");
    }
}
