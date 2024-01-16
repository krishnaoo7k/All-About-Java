package Inheritance.multilevel;

class Animal { // example of the super keyword
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Invoking the superclass constructor
        this.breed = breed;
    }

    void makeSound() {
        super.makeSound(); // Invoking the superclass method
        System.out.println("Dog is barking.");
    }
}



