package exercicio9_personagens_de_jogo;

public class Exercicio9_Personagens_de_Jogo {

    public static void main(String[] args) {
        Personagem objG = new Guerreiro("Henrique", 10, 120, 30, "Espada", 20);
        Personagem objM = new Mago("Maria", 12, 80, 100, "Fogo", 40);
        Personagem objA = new Arqueiro("joão", 11, 90, 35, "Arco", 50);
        Personagem objL = new Ladino("Murilo", 9, 85, 45, true, "Adaga");
        Personagem objP = new Paladino("Arthur", 13, 130, 60, 35, true);

        objG.atacar();
        objM.atacar();
        objA.atacar();
        objL.atacar();
        objP.atacar();
    }
    
}
