/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5_pagamentos;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5_Pagamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito(150.0, "10/03/2026", "Compra online",
                "1234-5678-9999", "João Silva", "12/28");

        Pagamento p2 = new Pix(80.0, "10/03/2026", "Pagamento restaurante",
                "email@pix.com", "Banco do Brasil", "Maria");

        Pagamento p3 = new Dinheiro(50.0, "10/03/2026", "Compra padaria",
                100.0, 50.0, "Real");

        Pagamento p4 = new Boleto(200.0, "10/03/2026", "Conta de internet",
                "12345678901234567890", "Caixa", "20/03/2026");

        Pagamento p5 = new TransferenciaBancaria(500.0, "10/03/2026", "Pagamento fornecedor",
                "Bradesco", "Itaú", "12345-6");

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
        p4.processarPagamento();
        p5.processarPagamento();
    }
    
}
