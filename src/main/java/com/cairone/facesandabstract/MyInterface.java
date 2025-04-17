package com.cairone.facesandabstract;

public interface MyInterface {

    String saludar(String nombre);

    default String greet(String nombre) {
        return "Greeting you " + nombre;
    }
}
