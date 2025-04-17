package com.cairone.random;

public class CloningExtended extends Cloning {

    public static void main(String[] args) {
        CloningExtended myClone = new CloningExtended();
        try {
            myClone.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
