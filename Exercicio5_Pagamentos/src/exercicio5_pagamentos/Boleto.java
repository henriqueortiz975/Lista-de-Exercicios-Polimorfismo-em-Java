package exercicio5_pagamentos;

public class Boleto extends Pagamento {

    private String codigoBarras;
    private String banco;
    private String dataVencimento;

    public Boleto(double valor, String data, String descricao,
                  String codigoBarras, String banco, String dataVencimento) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
        this.banco = banco;
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via boleto bancario");
    }
}
