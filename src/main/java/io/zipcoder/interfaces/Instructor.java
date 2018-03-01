package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor() {
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner learner : learners) {
            double numberOfHoursPerStudent = numberOfHours / learners.length;
            teach(learner, numberOfHoursPerStudent);
        }
    }

}
