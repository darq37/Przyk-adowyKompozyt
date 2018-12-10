package com.umcs;

public class Main {

    public static void main(String[] args) {
        Developer d1 = new Developer("Domink", "Tester", 1);
        Developer d2 = new Developer("Katarzyna", "FullStack", 2);
        CompanyDirectory devs = new CompanyDirectory();
        devs.add(d1);
        devs.add(d2);

        Menager m1 = new Menager("Michał", "Menager generalny", 3);
        Menager m2 = new Menager("Krzysiek", "Menager", 3);

        CompanyDirectory menagerowie = new CompanyDirectory();
        menagerowie.add(m1);
        menagerowie.add(m2);

        CompanyDirectory pracownicy = new CompanyDirectory();
        pracownicy.add(menagerowie);
        pracownicy.add(devs);
        pracownicy.showDetails();


    }
}
