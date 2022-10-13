package com.alex.list;

public class Person {

    private final String gender;
    private final String firstName;
    private final String lastName;
    private House house;
    private Factory factory;

    public Person(String gender,String firstName, String lastName){
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void liveIn(House house)
    {
        this.house = house;
        house.addPerson(this);
    }

    public void workIn(Factory factory)
    {
        this.factory = factory;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Factory getFactory() {
        return factory;
    }

    public House getHouse() {
        return house;
    }
}
