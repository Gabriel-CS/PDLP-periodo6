package org.example.entities;

public class ControlePS5 {

    private SensorPS5 sensorParaConectar;

    public void Conectar(SensorPS5 sensor){
        this.sensorParaConectar = sensor;
        sensorParaConectar.conectarPS5();
    }
}
