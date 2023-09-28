package org.example.entities;

public class AdaptadorPS5ParaXbox extends SensorPS5{

    private SensorPS5 adaptee;

    public AdaptadorPS5ParaXbox(SensorPS5 adaptee) {
        this.adaptee = adaptee;
    }

    public void conectarPS5(){
        adaptee.conectarPS5();
        System.out.println("But Stadia Wins!");
    }
}
