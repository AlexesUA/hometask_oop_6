package ua.edu.cbs.lms.hometask_oop_5.task5;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.addedAnimal("Васька", 45, false);

        System.out.println(animal);
        System.out.println(animal.hashCode());

        Animal newAnimal = animal;

        System.out.println(animal.equals(newAnimal));



    }
}
