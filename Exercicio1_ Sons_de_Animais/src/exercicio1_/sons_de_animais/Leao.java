/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_.sons_de_animais;

public class Leao extends Animal {

    private String origem;
    private String corJuba;
    private boolean alfa;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCorJuba() {
        return corJuba;
    }

    public void setCorJuba(String corJuba) {
        this.corJuba = corJuba;
    }

    public boolean isAlfa() {
        return alfa;
    }

    public void setAlfa(boolean alfa) {
        this.alfa = alfa;
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão ruge: ROARRR!");
    }
}
