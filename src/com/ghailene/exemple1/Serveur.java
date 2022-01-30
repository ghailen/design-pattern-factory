package com.ghailene.exemple1;

public class Serveur extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Serveur(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
