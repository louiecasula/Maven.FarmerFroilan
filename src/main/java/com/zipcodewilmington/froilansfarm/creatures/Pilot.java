package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public class Pilot extends Person {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible) {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
