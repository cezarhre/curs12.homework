package ro.fasttrackit.curs12.homework.ex2;

import java.util.*;

public class PersonList {

    private final List<Person> personList;

    public PersonList(List<Person> personList){
        this.personList = personList == null
                ? new ArrayList<>()
                : new ArrayList<>(personList);
    }

    public Map<String, Integer> mapNameToAge(){
        Map<String, Integer> result = new HashMap<>();
        for(Person person : personList){
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<Person> getOlder(int givenAge){
        List<Person> result = new ArrayList<>();
        for(Person person : personList){
            if(person.getAge()>givenAge){
                result.add(person);
            }
        }
        return result;
    }

    public Map<String, List<Person>> mapHairToName(){
        Map<String, List<Person>> result = new LinkedHashMap<>();
        for(Person person : personList) {
            List<Person> colourHair = result.get(person.getHairColour());
            if (colourHair == null) {
                colourHair = new ArrayList<>();
                result.put(person.getHairColour(), colourHair);
            }
            colourHair.add(person);
        }
        return result;
    }

    public Map<Integer, List<Person>> mapAgeToPerson(){
        Map<Integer, List<Person>> result = new HashMap<>();
        for(Person person : personList) {
            List<Person> persons = result.get(person.getAge());
            if (persons == null) {
                persons = new ArrayList<>();
                result.put(person.getAge(), persons);
            }
            persons.add(person);
        }
        return result;
    }
}
