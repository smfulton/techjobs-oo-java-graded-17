package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    private static int nextId = 1;

    public Employer() {
        super(nextId);
        nextId++;
    }

    public Employer(String value) {
        super(nextId,value);
        nextId++;
    }

    // Custom toString, equals, and hashCode methods:

    public String toString(){
        return this.getValue();
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employer employer = (Employer) obj;
        return this.getId() == employer.getId();
    }
    public int hashCode(){
        return Objects.hash(this.getId());
    }
}
