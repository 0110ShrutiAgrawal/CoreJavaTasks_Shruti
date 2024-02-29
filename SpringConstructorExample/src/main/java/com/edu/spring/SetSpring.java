package com.edu.spring;

import java.util.Set;

public class SetSpring {
    private String fullName;
    private Set<?> set;

    public SetSpring(String fullName, Set<?> set) {
        this.fullName = fullName;
        this.set = set;
    }

    public void display() {
        System.out.println(set);
    }
}
