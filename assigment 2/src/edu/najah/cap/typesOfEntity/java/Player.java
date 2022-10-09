package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.MakeRender;
import edu.najah.cap.interfaces.java.Movable;

public class Player implements Movable, MakeRender {
    public Player() { }

    @Override
    public void move() {
        System.out.println("move successfully from Player.");
    }

    @Override
    public void render() {
        System.out.println("render successfully from Player.");
    }
    @Override
    public String toString() {
        return "Player object\n";
    }
}
