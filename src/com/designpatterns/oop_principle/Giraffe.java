package com.designpatterns.oop_principle;

/**
 * Created by ryang on 06/06/2017.
 */
public class Giraffe extends Creature {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }


}
