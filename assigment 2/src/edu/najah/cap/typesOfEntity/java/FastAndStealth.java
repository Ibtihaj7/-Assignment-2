package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.MakeNoise;
import edu.najah.cap.interfaces.java.Movable;

public class FastAndStealth implements Movable, MakeNoise {
    public FastAndStealth(){ }
    @Override
    public void makeNoise() {
        System.out.println("makeNoise function from fastAndStealth.");
    }

    @Override
    public void move() {
        System.out.println("move function from fastAndStealth.");
    }

    @Override
    public String toString() {
        return "FastAndStealth object\n";
    }

}
