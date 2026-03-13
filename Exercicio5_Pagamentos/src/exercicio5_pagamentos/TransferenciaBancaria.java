package exercicio5_pagamentos;

public class TransferenciaBancaria extends Pagamento {

    private String bancoOrigem;
    private String bancoDestino;
    private String contaDestino;

    public TransferenciaBancaria(double valor, String data, String descricao,
                                 String bancoOrigem, String bancoDestino, String contaDestino) {
        super(valor, data, descricao);
        this.bancoOrigem = bancoOrigem;
        this.bancoDestino = bancoDestino;
        this.contaDestino = contaDestino;
    }

    public String getBancoOrigem() {
        return bancoOrigem;
    }

    public void setBancoOrigem(String bancoOrigem) {
        this.bancoOrigem = bancoOrigem;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado por transferencia bancaria");
    }
}
