package ro.fasttrackit.curs12.homework.ex2;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonList personList = new PersonList(List.of(
                new Person("George",20,"black"),
                new Person("Ionel",30,"blond"),
                new Person("Cristi",17,"brown"),
                new Person("Vali",35,"black")
        ));

        System.out.println(personList.mapNameToAge());
        System.out.println(personList.getOlder(18));
        System.out.println(personList.mapHairToName());
        System.out.println(personList.mapAgeToPerson());

    }
}
