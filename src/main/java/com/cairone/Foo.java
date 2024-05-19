package com.cairone;

import java.util.ArrayList;
import java.util.LinkedList;

public class Foo {

    public void foo() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        //list.getLast() no exists

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.getLast();
    }
}
