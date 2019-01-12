package com.trustingsocial.assignment;

public class Runner {
    public static void main(String args[]) throws InvalidPeopleCountException, NumberFormatException {
        if(args.length != 0){
            Simulation simulation = new Simulation();
            for(String value : args) {
                    int val = Integer.parseInt(value);
                System.out.println(simulation.getLastManStanding(val) +
                        " stays alive.");
            }
        } else {
            throw new NumberFormatException(ExceptionMessages.MESSAGE_CUSTOM_NUMBER_FORMAT_EXCEPTION);
        }
    }
}
