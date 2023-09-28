package org.example;

import org.example.entities.AdaptadorPS5ParaXbox;
import org.example.entities.ControlePS5;
import org.example.entities.SensorPS5;

public class Main {
    public static void main(String[] args) {

        SensorPS5 adatado = new SensorPS5();
        ControlePS5 alvo = new ControlePS5();

        AdaptadorPS5ParaXbox adaptador = new AdaptadorPS5ParaXbox(adatado);

        alvo.Conectar(adatado);

    }
}