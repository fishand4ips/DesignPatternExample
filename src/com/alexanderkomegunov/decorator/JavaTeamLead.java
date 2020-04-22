package com.alexanderkomegunov.decorator;

public class JavaTeamLead extends DeveloperDecorator{


    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String jobSenior(){
        return "nothing...\n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + jobSenior();
    }
}
