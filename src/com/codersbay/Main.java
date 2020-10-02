package com.codersbay;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PersonManagement myOrg = new PersonManagement();

        Address adr = new Address(4400, "Lilienhofweg", "Steyr", "4");
        Person per = new Person("Georg", "Schweinschwaller", LocalDate.of(1986, 9, 3), adr, "Male");

        Address adr1 = new Address(4400, "Hofergraben", "Steyr", "16", "3A");
        Person per1 = new Person("Michael", "Arbeithuber", LocalDate.of(1990, 4, 4), adr1, "Male");

        Address adr2 = new Address(4400, "Reithofergasse", "Steyr", "3C", "12");
        Person per2 = new Person("Kristina", "Schweinschwaller", LocalDate.of(1988, 3, 5), adr2, "Female");

        myOrg.addPerson(per);
        myOrg.addPerson(per1);
        myOrg.addPerson(per2);

        System.out.println(myOrg.toString());
        System.out.println();

        myOrg.removePerson(per2);
        System.out.println("------------");
        System.out.println(myOrg.toStringDetail());


    }

}
