package exercicio5_pagamentos;

public class Dinheiro extends Pagamento {

    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro(double valor, String data, String descricao,
                    double valorRecebido, double troco, String moeda) {
        super(valor, data, descricao);
        this.valorRecebido = valorRecebido;
        this.troco = troco;
        this.moeda = moeda;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado usando dinheiro");
    }
}
