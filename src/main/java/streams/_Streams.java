package streams;


import imperative.Gender;

import java.util.List;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("James Bond", 24, Gender.MALE),
                new Person("Harrison Ford", 64, Gender.MALE),
                new Person("Margot Robbie", 34, Gender.FEMALE),
                new Person("Miss C", 29, Gender.FEMALE),
                new Person("John Lennon", 47, Gender.MALE),
                new Person("Syd Barrett", 66, Gender.MALE),
                new Person("Norah Jones", 35, Gender.FEMALE),
                new Person("Diane Keaton", 42, Gender.FEMALE),
                new Person("Dean Keaton", 33, Gender.NONE)
        );

        people.stream().map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream().map(person -> person.name)
                .mapToInt(name -> name.length()) // (String::length)
                .forEach(System.out::println);


        System.out.println("\n all female ?");
        boolean allFemale = people.stream()
                .allMatch(person -> (person.gender).equals(Gender.FEMALE));
        System.out.println(allFemale);

        System.out.println("\n contains female ?");
        boolean containsFemale = people.stream()
                .anyMatch(person -> (person.gender).equals(Gender.FEMALE));
        System.out.println(containsFemale);
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
