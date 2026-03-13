package exercicio1_.sons_de_animais;

public class Exercicio1_Sons_de_Animais {

    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", 5, 20, "Labrador", true, "Grande");
        Animal a2 = new Gato("Luna", 3, 4, "Branco", true, 7);
        Animal a3 = new Vaca("vaquinha", 6, 500, "Holandesa", 20, true);
        Animal a4 = new Cavalo("Pé de Pano", 7, 400, "Árabe", 60, true);
        Animal a5 = new Leao("rei leão", 8, 190, "Savana", true, 90);

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
        a5.emitirSom();
    }
    
}
