package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    private static int nextId = 1;

    public Location() {
        super(nextId);
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public Location(String value){
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
        Location location = (Location) obj;
        return this.getId() == location.getId();
    }
    public int hashCode(){
        return Objects.hash(this.getId());
    }

}
