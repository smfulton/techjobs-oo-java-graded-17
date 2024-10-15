package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        this.id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public String toString(){
        if(
            this.getName().equals("") &&
            this.getEmployer().getValue().equals("") &&
            this.getLocation().getValue().equals("") &&
            this.getPositionType().getValue().equals("") &&
            this.getCoreCompetency().getValue().equals("")
        ){
            return "OOPS! This job does not seem to exist.";
        }
        else{
           return lineSeparator()+"ID: "+this.id+lineSeparator()+"Name: "
                    +(this.getName()!=""?this.getName():"Data not available")+
                    lineSeparator()+"Employer: "
                    +(this.getEmployer().getValue()!=""?this.getEmployer():"Data not available")+
                    lineSeparator()+"Location: "
                    +(this.getLocation().getValue()!=""?this.getLocation():"Data not available")+
                    lineSeparator()+"Position Type: "
                    +(this.getPositionType().getValue()!=""?this.getPositionType():"Data not available")+
                    lineSeparator()+"Core Competency: "
                    +(this.getCoreCompetency().getValue()!=""?this.getCoreCompetency():"Data not available")+
                    lineSeparator();
        }
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return this.getId() == job.getId();
    }
    public int hashCode() {
        return Objects.hash(this.id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return this.employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public Location getLocation() {
        return this.location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return this.positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return this.coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
