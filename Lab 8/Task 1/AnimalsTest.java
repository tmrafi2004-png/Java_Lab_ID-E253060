class Animal {
    void sound() {
        System.out.println("Animal: Sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat: Meow, Meow"); 
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog: Bark, Bark");  
    }
}

public class AnimalsTest {
    public static void main(String args[]) {
        Animal animal = new Animal();  
        Cat cat = new Cat();           
        Dog dog = new Dog();           

        animal.sound();  
        cat.sound();     
        dog.sound();     
    }
}