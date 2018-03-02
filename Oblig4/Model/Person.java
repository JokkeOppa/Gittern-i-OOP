package no.hiof.no.joakimga.Oblig4.Model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
