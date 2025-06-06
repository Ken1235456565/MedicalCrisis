
package Model.Person;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    // 添加人员
    public void addPerson(Person person) {
        if (person != null && !personList.contains(person)) {
            personList.add(person);
        }
    }

    // 删除人员
    public boolean removePerson(String personId) {
        return personList.removeIf(person -> person.getId().equals(personId));
    }

    // 查询人员
    public Person findPersonById(String personId) {
        return personList.stream()
                .filter(person -> person.getId().equals(personId))
                .findFirst()
                .orElse(null);
    }

    // 根据姓名查询人员
    public Person findPersonByName(String name) {
        return personList.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    // 获取所有人员
    public ArrayList<Person> getAllPersons() {
        return new ArrayList<>(personList);
    }

    // Getters and Setters
    public ArrayList<Person> getPersonList() { return personList; }
    public void setPersonList(ArrayList<Person> personList) { this.personList = personList; }
}