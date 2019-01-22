package com.trustingsocial.assignment;

import java.util.ArrayDeque;

public class Simulation {

   public int getLastManStanding(int n) throws InvalidPeopleCountException {
        ArrayDeque<Integer> personIndex = new ArrayDeque<>();
        if (n >= 1) {
            for (int i = 0; i < n; i++) {
                personIndex.add(i);
            }
            return solve(personIndex);
        } else {
            throw new InvalidPeopleCountException(ExceptionMessages.MESSAGE_INVALID_PEOPLE_COUNT_EXCEPTION);
        }
    }

    private int solve(ArrayDeque<Integer> personIndex) {
        int size = personIndex.size();

        if(size == 1) {
            return personIndex.getFirst();
        } else {
            int num = 1;
            int guyWithTheSword, guyWhoWasKilled;
            do {
                guyWithTheSword = personIndex.pollFirst();
                personIndex.addLast(guyWithTheSword);
                guyWhoWasKilled = personIndex.poll();

                System.out.println("Person " + guyWithTheSword + " killed " + guyWhoWasKilled);
                num++;
            } while (num <= (size/2));
            return solve(personIndex);
        }
    }
}