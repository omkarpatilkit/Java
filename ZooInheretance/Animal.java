package ZooInheretance;

abstract class Animal {
    int age ;
    String name;
    float weight;


    Animal(int Age, String Name, float Weight){
        age = Age;
        name = Name;
        weight= Weight;
    }

    public void DisplayInfo(){
        System.out.println(name +" animal is "+ age + " year old and weigh about " + weight + " kg");
    }

    public void Sleep(){
        System.out.println(name +" is sleeping.");
    }

    public void Eating(){
        System.out.println(name + " is eating.");
    }

}
