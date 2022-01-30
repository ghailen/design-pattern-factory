package com.ghailene;

import com.ghailene.exemple1.Computer;
import com.ghailene.exemple1.ComputerFactory;
import com.ghailene.exemple2.Cercle;
import com.ghailene.exemple2.Forme;
import com.ghailene.exemple2.FormeFactory;

public class Main {

    public static void main(String[] args) {

        /** exemple 1 **/
        Computer pc = ComputerFactory.getComputer("pc");
        System.out.println("Ma configuration PC:" + pc);

        Computer gamer = ComputerFactory.getComputer("gamer");
        System.out.println("Ma configuration gamer:" + gamer);

        Computer serveur = ComputerFactory.getComputer("serveur");
        System.out.println("Ma configuration serveur:" + serveur);

        Computer imaginaire = ComputerFactory.getComputer("imaginaire");
        System.out.println("Ma configuration imaginaire:" + imaginaire);

        /** exemple 2 **/

        Forme cercle = FormeFactory.getForme("cercle");
        cercle.dessiner();

        Forme rectangle = FormeFactory.getForme("rectangle");
        rectangle.dessiner();

        Forme carre = FormeFactory.getForme("carre");
        carre.dessiner();

    }
}
