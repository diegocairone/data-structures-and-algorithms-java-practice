package com.cairone.facesandabstract;

public class MyFooClass extends MyAbstractClass implements MyInterface {

    @Override
    public String saludar(String nombre) {
        return "Hola " + nombre;
    }
}
