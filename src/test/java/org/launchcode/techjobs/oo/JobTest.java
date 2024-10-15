package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;

    @Before
    public void init() {
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId (){
        assertNotEquals(test_job1.getId(),test_job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields (){
        assertEquals("Product tester",test_job1.getName());
        assertEquals("ACME",test_job1.getEmployer().getValue());
        assertEquals("Desert",test_job1.getLocation().getValue());
        assertEquals("Quality control",test_job1.getPositionType().getValue());
        assertEquals("Persistence",test_job1.getCoreCompetency().getValue());
        assertTrue(test_job1.getName() instanceof String);
        assertTrue(test_job1.getEmployer() instanceof Employer);
        assertTrue(test_job1.getLocation() instanceof Location);
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(test_job1.equals(test_job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String sTestJob = test_job1.toString();
        String firstLetter = String.valueOf(sTestJob.toCharArray()[0]);
        String lastLetter = String.valueOf(sTestJob.toCharArray()[sTestJob.length()-1]);
        assertEquals(firstLetter,System.lineSeparator());
        assertEquals(lastLetter,System.lineSeparator());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        assertEquals("\n" +
                "ID: 4\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n",test_job2.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertTrue(test_job2.toString().contains("ID:"));
        assertTrue(test_job2.toString().contains("Name:"));
        assertTrue(test_job2.toString().contains("Employer:"));
        assertTrue(test_job2.toString().contains("Location:"));
        assertTrue(test_job2.toString().contains("Position Type:"));
        assertTrue(test_job2.toString().contains("Core Competency:"));
        assertEquals("Product tester",test_job2.getName());
        assertEquals("",test_job2.getEmployer().getValue());
        assertEquals("Desert",test_job2.getLocation().getValue());
        assertEquals("Quality control",test_job2.getPositionType().getValue());
        assertEquals("Persistence",test_job2.getCoreCompetency().getValue());
    }
}
