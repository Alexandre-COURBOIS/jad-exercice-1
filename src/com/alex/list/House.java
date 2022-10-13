package com.alex.list;

import java.util.ArrayList;

public class House extends Building {
    private ArrayList<Person> personArrayList;
    public House(String name) {
        super(name);
        this.personArrayList = new ArrayList<>();
    }


    public void addPerson(Person person) {
        //Vérifie pour éviter de boucler
        if (!this.personArrayList.contains(person)) {
            this.personArrayList.add(person);
            person.liveIn(this);
        }
    }
}
