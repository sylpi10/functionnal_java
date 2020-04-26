package imperative;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("James Bond", 24, Gender.MALE),
                new Person("Harrison Ford", 64, Gender.MALE),
                new Person("Margot Robbie", 34, Gender.FEMALE),
                new Person("Miss C", 29, Gender.FEMALE),
                new Person("John Lennon", 47, Gender.MALE),
                new Person("Syd Barrett", 66, Gender.MALE),
                new Person("Norah Jones", 35, Gender.FEMALE),
                new Person("Diane Keaton", 42, Gender.FEMALE)
        );

        List<Person> females = new ArrayList<>();
        List<Person> males = new ArrayList<>();

//        for (Person pers : people) {
//            if (pers.gender.equals(Gender.FEMALE)){
//                females.add(pers);
//            }
//        }
//        for (Person fem : females){
//            System.out.println(fem);
//        }

        System.out.println("\n females:");
        people.stream().filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n males:");
        people.stream().filter(person -> person.gender.equals(Gender.MALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n age > 50:");
        people.stream().filter(person -> person.age > 50)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n sorted");

        people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }



    static class Person {

        private final String name;
        private final int age;
        private final Gender gender;

        Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person : " +
                    "name:'" + name + '\'' +
                    ", gender:" + gender +
                    ", age:" + age;
        }

    }




}
