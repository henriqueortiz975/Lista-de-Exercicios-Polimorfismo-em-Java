
package exercicio3_instrumentos_musicais;

public class Exercicio3_Instrumentos_Musicais {

    public static void main(String[] args) {
        Instrumento objviolao = new Violao("Violão", "Cordas", "Yamaha", 6, "Cedro", false);
        Instrumento objpiano = new Piano("Piano", "Teclas", "Steinway", 88, "Cauda", false);
        Instrumento objbateria = new Bateria("Bateria", "Percussão", "Pearl", 5, "Madeira", false);
        Instrumento objflauta = new Flauta("Flauta", "Sopro", "Yamaha", "Prata", "Dó", true);
        Instrumento objguitarra = new Guitarra("Guitarra", "Cordas", "Fender", 3, "Fixa", true);

        objviolao.tocar();
        objpiano.tocar();
        objbateria.tocar();
        objflauta.tocar();
        objguitarra.tocar();

    }
    
}
