package com.codersbay;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonManagement {

    @Test
    public void testConstrutorAddress() {
        Address adr = new Address(4400, "Lilienhofweg", "Steyr", "4");
        ;

        assertEquals(adr.getCity(), "Steyr");
        assertEquals(adr.getStreet(), "Lilienhofweg");
        assertEquals(adr.getHouseNr(), "4");
        assertEquals(adr.getPostCode(), 4400);
    }

    @Test
    public void testAddPerson() {
        PersonManagement myOrg = new PersonManagement();
        assertEquals(myOrg.getNrOfPerson(), 0);

        Address adr = new Address(4400, "Lilienhofweg", "Steyr", "4");
        Person per = new Person("Georg", "Schweinschwaller", LocalDate.of(1986, 9, 3), adr, "Male");
        myOrg.addPerson(per);
        assertEquals(myOrg.getNrOfPerson(), 1);

    }

    @Test
    public void testRemovePerson() {

        PersonManagement myOrg = new PersonManagement();
        Address adr = new Address(4400, "Lilienhofweg", "Steyr", "4");
        Person per = new Person("Georg", "Schweinschwaller", LocalDate.of(1986, 9, 3), adr, "Male");
        myOrg.addPerson(per);
        Address adr1 = new Address(4400, "Hofergraben", "Steyr", "16", "3A");
        Person per1 = new Person("Michael", "Arbeithuber", LocalDate.of(1990, 4, 4), adr1, "Male");
        myOrg.addPerson(per1);
        Address adr2 = new Address(4400, "Reithofergasse", "Steyr", "3C", "12");
        Person per2 = new Person("Kristina", "Schweinschwaller", LocalDate.of(1988, 3, 5), adr2, "Female");
        myOrg.addPerson(per2);
        assertEquals(myOrg.getNrOfPerson(), 3);
        myOrg.removePerson(per1);
        assertEquals(myOrg.getNrOfPerson(), 2);
        myOrg.removePerson("Kristina", "Schweinschwaller");
        assertEquals(myOrg.getNrOfPerson(), 1);
    }

}
