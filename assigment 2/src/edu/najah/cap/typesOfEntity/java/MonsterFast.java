package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.Movable;

public class MonsterFast implements Movable {
    public MonsterFast() { }

    @Override
    public void move() {
        System.out.println("moved successfully from MonsterFast.");
    }
    @Override
    public String toString() {
        return "MonsterFast object\n";
    }
}
