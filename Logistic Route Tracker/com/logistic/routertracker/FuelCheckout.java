package com.logistic.routertracker;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}