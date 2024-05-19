package com.cairone.multidefaults;

public interface Human {

    default void talk() {
        System.out.println("Human");
    }
}
