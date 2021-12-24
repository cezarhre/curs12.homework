package ro.fasttrackit.curs12.homework.ex2;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonList personList = new PersonList(List.of(
                new Person("George",20,"black"),
                new Person("Ionel",35,"blond"),
                new Person("Cristi",17,"brown"),
                new Person("Vali",25,"grey")
        ));

        System.out.println(personList);
        System.out.println(personList.mapNameToAge());
        System.out.println(personList.getOlder());
        System.out.println(personList.mapHairToName());
        System.out.println(personList.mapAgeToPerson());

    }
}
