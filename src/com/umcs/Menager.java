package com.umcs;

public class Menager implements Pracownik {
    private String name;
    private String position;
    private long empId;

    public Menager(String name, String position, long empId) {
        this.name = name;
        this.position = position;
        this.empId = empId;
    }

    @Override
    public void showDetails() {
        System.out.println("name: " + name + ", Pozycja: " + position);
    }
}
