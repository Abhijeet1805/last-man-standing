package com.trustingsocial.assignment;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RunnerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void verifyNumberFormatException() throws NumberFormatException {
        thrown.expect(NumberFormatException.class);

        String args[] = {"!@#","abcd","1.099",""};

        try {
            Runner.main(args);
        } catch (InvalidPeopleCountException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyNullStringArray() throws InvalidPeopleCountException {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(ExceptionMessages.MESSAGE_CUSTOM_NUMBER_FORMAT_EXCEPTION);

        String args[] = {};

        Runner.main(args);
    }
}
