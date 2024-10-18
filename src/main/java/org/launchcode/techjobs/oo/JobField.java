package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private static int nextId = 1;
    private int id;
    private String value;

    public JobField(){
        this.id = nextId;
        nextId++;
    }
    public JobField(String value){
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return this.value;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        JobField jobField = (JobField) obj;
        return this.getId() == jobField.getId();
    }
    public int hashCode(){
        return Objects.hash(this.getId());
    }
}
