package com.umcs;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Pracownik {
    private List<Pracownik> empList = new ArrayList<Pracownik>();


    @Override
    public void showDetails() {
        for (Pracownik p : empList) {
            p.showDetails();
        }
    }
    public void add(Pracownik p){
        empList.add(p);
    }
    public void remove(Pracownik p){
        empList.remove(p);
    }
}
