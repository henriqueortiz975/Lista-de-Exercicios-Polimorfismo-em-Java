package exercicio5_pagamentos;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(double valor, String data, String descricao,
                         String numeroCartao, String nomeTitular, String validade) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com cartão de credito");
    }
}