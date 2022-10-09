package edu.najah.cap.Entity.java;

import edu.najah.cap.interfaces.java.MakeNoise;
import edu.najah.cap.interfaces.java.MakeRender;
import edu.najah.cap.interfaces.java.Movable;

import java.util.ArrayList;
import java.util.List;

public class Entity {

    private List<Object> list ;

    public Entity(){
        list = new ArrayList<>();
    }

    public List<Object> getList() {
        return list;
    }
    public void move(){
        for(Object list1:list){
            if(list1 instanceof Movable)
                ((Movable) list1).move();
        }
    }

    public void render(){
        for(Object list1:list){
            if(list1 instanceof MakeRender)
                ((MakeRender) list1).render();
        }
    }
    public void makeNoise(){
        for(Object list1:list){
            if(list1 instanceof MakeNoise)
                ((MakeNoise) list1).makeNoise();
        }
    }

    @Override
    public String toString() {
        String res = "Entity contain: \n";
        for(Object list1:list)
            res+= list1.toString();
        return res+"\n";
    }
}
