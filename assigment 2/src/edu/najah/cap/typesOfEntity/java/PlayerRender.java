package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.MakeRender;

public class PlayerRender implements MakeRender {
    public PlayerRender () { }

    @Override
    public void render() {
        System.out.println("render successfully from PlayerRender.");
    }
    @Override
    public String toString() {
        return "PlayerRender object\n";
    }
}
