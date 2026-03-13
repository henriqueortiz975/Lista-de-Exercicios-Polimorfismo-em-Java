/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9_personagens_de_jogo;

public class Ladino extends Personagem {

    private int agilidade;
    private boolean invisivel;
    private String armaLeve;

    public Ladino(String nome, int nivel, int vida, int agilidade, boolean invisivel, String armaLeve){
        super(nome, nivel, vida);
        this.agilidade = agilidade;
        this.invisivel = invisivel;
        this.armaLeve = armaLeve;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public boolean isInvisivel() {
        return invisivel;
    }

    public void setInvisivel(boolean invisivel) {
        this.invisivel = invisivel;
    }

    public String getArmaLeve() {
        return armaLeve;
    }

    public void setArmaLeve(String armaLeve) {
        this.armaLeve = armaLeve;
    }

    @Override
    public void atacar() {
        System.out.println("O ladino ataca pelas sombras");
    }
}
