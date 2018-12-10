package com.umcs;

public class Developer implements Pracownik {
    private String name;
    private String position;
    private long empiId;

    public Developer(String name, String position, long empiId) {
        this.name = name;
        this.position = position;
        this.empiId = empiId;
    }



    @Override
    public void showDetails() {
        System.out.println("name: " + name + ", Pozycja: " + position);
    }
}
