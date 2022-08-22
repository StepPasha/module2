package ru.gb.stepanov.hm1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    private List<T> box = new ArrayList <>();

      public Box(){
      }
    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box aBox) {
        if(getWeight() == aBox.getWeight())
            return true;
        return false;
    }
    public void move(Box <T>aBox){
        aBox.box.addAll(box);
        box.clear();
    }
    public void addFruit(T fruit){
            box.add(fruit);
        }
    }


