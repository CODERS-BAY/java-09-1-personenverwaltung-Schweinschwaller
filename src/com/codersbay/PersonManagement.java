package com.codersbay;

import java.util.ArrayList;

public class PersonManagement {

    private ArrayList<Person> persons;

    public PersonManagement() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person per) {
        this.persons.add(per);
    }

    @Override
    public String toString() {
        String help = "";
        for (int i = 0; i < this.persons.size(); i++) {
            help += "\n" + this.persons.get(i).getFirstName() + " " + this.persons.get(i).getLastName();
        }
        return help;
    }

    public String toStringDetail() {
        String help = "";
        for (int i = 0; i < this.persons.size(); i++) {
            help += "\n" + this.persons.get(i).getFirstName() + " " + this.persons.get(i).getLastName() + "\n" + this.persons.get(i).getDateOfBirth().toString() + "\n" + this.persons.get(i).getGender() + "\n" + this.persons.get(i).getAddress().toString() + "\n";
        }
        return help;
    }

    public void removePerson(String firstName, String lastName) {
        int idx = 0;
        for (int i = 0; i < this.persons.size(); i++) {
            if (this.persons.get(i).getFirstName().contains(firstName) && this.persons.get(i).getLastName().contains(lastName)) {
                this.persons.remove(this.persons.get(i));
                break;
            }
        }


    }

    public void removePerson(Person per) {
        this.persons.remove(per);
    }

}
