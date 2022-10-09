package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.MakeRender;
import edu.najah.cap.interfaces.java.Movable;

public class PlayerMover implements Movable {
    public PlayerMover() { }

    @Override
    public void move() {
        System.out.println("move successfully from PlayerMover.");
    }

    @Override
    public String toString() {
        return "PlayerMover object\n";
    }
}
