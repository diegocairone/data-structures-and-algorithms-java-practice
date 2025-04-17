package com.cairone.random;

public class Cloning implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cloning myClone1 = new Cloning();
        myClone1.setJustANum(12);

        Cloning myClone2 = (Cloning) myClone1.clone();

        myClone1.setJustANum(20);

        System.out.println(myClone2.getJustANum());

    }

    private Integer justANum;

    public Integer getJustANum() {
        return justANum;
    }

    public void setJustANum(Integer justANum) {
        this.justANum = justANum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
