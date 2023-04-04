package ua.edu.cbs.lms.hometask_oop_5.task5;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    private Animal(String name, int age, boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public static Animal addedAnimal(String name, int age, boolean tail){
        if(age<0){
            System.out.println("Вік не може бути від'ємним.");
            return null;
        }
        else{
            return new Animal(name, age, tail);
        }
    }

    @Override
    public String toString() {
        return "Animal: " + "name='" + name + '\'' + ", age=" + age + ", tail=" + (tail?"Yes":"No");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
