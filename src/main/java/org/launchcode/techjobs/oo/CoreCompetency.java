package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    private static int nextId = 1;

    public CoreCompetency() {
        super(nextId);
        nextId++;
    }

    public CoreCompetency(String value) {
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
        CoreCompetency coreCompetency = (CoreCompetency) obj;
        return this.getId() == coreCompetency.getId();
    }
    public int hashCode(){
        return Objects.hash(this.getId());
    }
}
