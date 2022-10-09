package edu.najah.cap.typesOfEntity.java;

import edu.najah.cap.interfaces.java.MakeRender;

public class MonsterStealth implements MakeRender {
    public MonsterStealth(){ }
    @Override
    public void render() {
        System.out.println("render successfully from MonsterStealth");
    }
    @Override
    public String toString() {
        return "MonsterStealth object\n";
    }
}
