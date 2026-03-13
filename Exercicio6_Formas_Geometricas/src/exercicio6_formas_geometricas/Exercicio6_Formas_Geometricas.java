package exercicio6_formas_geometricas;

public class Exercicio6_Formas_Geometricas {

    public static void main(String[] args) {
        Forma objQ = new Quadrado("Preot", "Quadrado", 4, 4, "Regular", true);
        Forma objR = new Retangulo("Verde", "Retângulo", 5, 5, 3, true);
        Forma objC = new Circulo("Rosa", "Círculo", 3, 3, 6, true);
        Forma objTri = new Triangulo("Amarelo", "Triângulo", 6, 6, 4, "Equilátero");
        Forma objTra = new Trapezio("Azul", "Trapézio", 5, 8, 4, 3);

        System.out.println("Área do quadrado: " + objQ.calcularArea());
        System.out.println("Área do retângulo: " + objR.calcularArea());
        System.out.println("Área do círculo: " + objC.calcularArea());
        System.out.println("Área do triângulo: " + objTri.calcularArea());
        System.out.println("Área do trapézio: " + objTra.calcularArea());
    }
    
}
