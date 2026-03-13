package exercicio5_pagamentos;

public class Pix extends Pagamento {

    private String chavePix;
    private String banco;
    private String titular;

    public Pix(double valor, String data, String descricao,
               String chavePix, String banco, String titular) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
        this.banco = banco;
        this.titular = titular;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via Pix");
    }
}
