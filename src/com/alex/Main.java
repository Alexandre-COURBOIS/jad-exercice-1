package com.alex;

import com.alex.list.Company;
import com.alex.list.Factory;
import com.alex.list.House;
import com.alex.list.Person;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("NFS");

        Person christa = new Person("Mme.", "Christa", "PAFFGEN");
        Person lou = new Person("M.", "Lou", "REED");
        Person andy = new Person("M.", "Andy", "WHARHOL");

        House chateau = new House("château");
        House appartement = new House("appartement T3");

        Factory factory = new Factory("The factory");

        company.addFactory(factory);

        christa.liveIn(chateau);
        lou.liveIn(appartement);
        christa.workIn(factory);
        andy.workIn(factory);

        System.out.println(christa.getFirstName() + " habite un " +christa.getHouse().getName());
        System.out.println(lou.getFirstName() + " habite un " +lou.getHouse().getName());

        System.out.println();

    }
}