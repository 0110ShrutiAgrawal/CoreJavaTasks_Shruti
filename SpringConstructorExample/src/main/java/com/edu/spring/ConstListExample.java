package com.edu.spring;

import java.util.ArrayList;
import java.util.List;

public class ConstListExample {
    private String fullname;
    private List<String> ls;

    ConstListExample(String name, ArrayList<String> m) {
        fullname = name;
        ls = m;
    }

    public void display() {
        System.out.println(ls);
    }
}
