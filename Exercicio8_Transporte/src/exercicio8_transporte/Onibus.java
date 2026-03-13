/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8_transporte;

public class Onibus extends Transporte {

    private int linhas;
    private boolean arCondicionado;
    private double tarifaBase;

    public Onibus(String nome, int capacidade, String empresa,
                  int linhas, boolean arCondicionado, double tarifaBase) {
        super(nome, capacidade, empresa);
        this.linhas = linhas;
        this.arCondicionado = arCondicionado;
        this.tarifaBase = tarifaBase;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase;
    }
}
