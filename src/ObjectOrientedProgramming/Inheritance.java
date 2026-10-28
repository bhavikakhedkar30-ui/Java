package ObjectOrientedProgramming;


class Animal {

    String name = "Animal";
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void bark() {
        System.out.println("Dog eats treats");
    }
}
class Cat extends Animal {
    String name = "Cat";
    void eat() {
        System.out.println("cat eats wet food");
    }
}

class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}

