package com.ghailene.exemple1;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "RAM :: " + getRam() + " | HDD ::" + getHdd() + " | CPU ::" + getCpu();
    }
}
