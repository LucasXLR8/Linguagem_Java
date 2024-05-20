/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senai.atividade3.Model;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private int capacidadeTanque;
    private int velocidadeMax;
    private int consumoMedio;

    public Veiculo(String placa, String cor, int numeroPassageiros, int capacidadeTanque, int velocidadeMax, int consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(int consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
    
}
