package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    private static int nextId = 1;

    public PositionType() {
        super(nextId);
        nextId++;
    }

    public PositionType(String value) {
        super(nextId,value);
        nextId++;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public String toString(){
        return this.getValue();
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PositionType positionType = (PositionType) obj;
        return this.getId() == positionType.getId();
    }
    public int hashCode(){
        return Objects.hash(this.getId());
    }
}
