package com.logistic.routertracker;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        return (delay > 30) ? delay * 0.5 : 0;
    }
}