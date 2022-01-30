package com.ghailene.exemple1;

public class ComputerFactory {


    public static Computer getComputer(String type) {

        switch (type) {
            case "pc":
                return new Pc("8GO", "1 TO SATA", "2.3 Ghz");
            case "gamer":
                return new Pc("32GO", "2 TO SSD", "4.0 Ghz");
            case "serveur":
                return new Pc("128GO", "8 TO SATA", "6.0 Ghz");
            case "imaginaire":
                return new Pc("1To", "100 TO SSD", "24.0 Ghz");
            default:
                throw new IllegalArgumentException("ce type de pc n'existe pas encore");
        }

    }
}
