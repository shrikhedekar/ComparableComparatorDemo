package com.comparablecomparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
    String name;
    int age;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
    }
}


class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class PersonWeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}

public class CustomClassSorting {

    public static void main(String [] args) {

        List<Person> personList =  new ArrayList<>();

        personList.add(new Person("Shrirang",38,75));
        personList.add(new Person("Shreeram",33,71));
        personList.add(new Person("Shridhar",41,70));

        System.out.println("Original person list"+personList);

        // Sorting with nature ordering defined using comparable
        Collections.sort(personList);

        System.out.println("Sorted person list"+personList);

        personList.sort(new PersonNameComparator());

        System.out.println("Sorted person list using PersonNameComparator "+personList);

        personList.sort(new PersonWeightComparator());

        System.out.println("Sorted person list using PersonWeightComparator" +personList);


    }

}
