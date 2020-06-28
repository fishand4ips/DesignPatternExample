package com.alexanderkomegunov.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSub = new Subscriber("Alex Komegunov");
        Observer secondSub = new Subscriber("Vasya Petrov");

        jobSite.addObserver(firstSub);
        jobSite.addObserver(secondSub);

        jobSite.addVacancy("Third Java Position");
    }
}
