package com.trustingsocial.assignment;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SimulationTest {
    private static Simulation simulation;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void initialize() { simulation = new Simulation(); }

    @Test
    public void verifyExceptionWithZero() throws InvalidPeopleCountException {
        thrown.expect(InvalidPeopleCountException.class);
        thrown.expectMessage(ExceptionMessages.MESSAGE_INVALID_PEOPLE_COUNT_EXCEPTION);
        simulation.getLastManStanding(0);
    }

    @Test
    public void verifyExceptionWithNegativeIntegerInput() throws InvalidPeopleCountException {
        thrown.expect(InvalidPeopleCountException.class);
        thrown.expectMessage(ExceptionMessages.MESSAGE_INVALID_PEOPLE_COUNT_EXCEPTION);
        simulation.getLastManStanding(-1);
    }

    @Test
    public void verifyIntegerInput1() {
        try {
            Assert.assertEquals(976, simulation.getLastManStanding(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyIntegerInput2() {
        try {
            Assert.assertEquals(0, simulation.getLastManStanding(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyIntegerInput3() {
        try {
            Assert.assertEquals(10, simulation.getLastManStanding(13));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyCharacterInput1() {
        try {
            Assert.assertEquals(2 ,simulation.getLastManStanding('A'));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyCharacterInput2() {
        try {
            Assert.assertEquals(66 ,simulation.getLastManStanding('a'));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
