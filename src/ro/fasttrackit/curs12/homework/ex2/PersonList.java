package ro.fasttrackit.curs12.homework.ex2;

import java.util.*;

public class PersonList {

    private final List<Person> personList;

    public PersonList(Collection<Person> personList){
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

    public List<Person> getOlder(){
        List<Person> result = new ArrayList<>();
        for(Person person : personList){
            if(person.getAge()>18){
                result.add(person);
            }
        }
        return result;
    }
    public Map<String, String> mapHairToName(){
        Map<String, String> result = new HashMap<>();
        for(Person person : personList){
            result.put(person.getHairColour(), person.getName());
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

    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +
                '}';
    }
}
