package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.PositionType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
    Job name = new Job();
    Job employer = new Job();
    assertNotEquals(name, employer);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //int testId = job1.getId();
        String testName = job1.getName();
        Employer testEmployer = job1.getEmployer();
        Location testLocation = job1.getLocation();
        PositionType testPositionType = job1.getPositionType();
        CoreCompetency testCoreCompetency = job1.getCoreCompetency();

        assertEquals("Product tester", testName);
        assertEquals("ACME", testEmployer.getValue());
        assertEquals("Desert", testLocation.getValue());
        assertEquals("Quality control", testPositionType.getValue());
        assertEquals("Persistence", testCoreCompetency.getValue());

        //assertTrue(testId instanceof Job);
        assertTrue(testName instanceof String);
        assertTrue(testEmployer instanceof Employer);
        assertTrue(testLocation instanceof Location);
        assertTrue(testPositionType instanceof PositionType);
        assertTrue(testCoreCompetency instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {

      Job jobA = new Job ("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

      Job jobB = new Job ("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobA == jobB);
    }



}
