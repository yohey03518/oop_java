public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.makeSound(); // output: Meow Meow

        Animal myDog = new Dog();
        myDog.makeSound(); // output: Woof Woof

        Animal[] myPets = getMyPets();
        for (Animal pet : myPets) {
            pet.breathe();
            pet.makeSound();
        }
    }

    public static Animal[] getMyPets() {
        return new Animal[] { new Dog(), new Cat() };
    }
}
