package com.cairone.multidefaults;

public class Someone implements Human, Alien {

    @Override
    public void talk() {
        Human.super.talk();

    }

}
