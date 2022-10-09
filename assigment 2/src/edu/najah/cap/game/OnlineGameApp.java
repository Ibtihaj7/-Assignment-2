package edu.najah.cap.game;

import edu.najah.cap.Entity.java.Entity;
import edu.najah.cap.typesOfEntity.java.*;

public class OnlineGameApp {
    public static void main(String[] args) {
        Entity entity = new Entity();
        MonsterFast monsterFast = new MonsterFast();
        entity.getList().add( monsterFast );
        entity.getList().add( new PlayerMover() );
        System.out.println(entity.toString() );

        entity.getList().add( new MonsterFast() );
        entity.getList().add( new MonsterStealth() );
        entity.getList().add( new FastAndStealth() );
        entity.getList().add( new PlayerRender() );

        entity.move();
        System.out.println();
        entity.makeNoise();
        System.out.println();
        entity.render();
        System.out.println(entity.toString());

    }
}
