package exercicio2._veiculos;

public class Exercicio2_Veiculos {

    public static void main(String[] args) {
        Veiculo objcarro = new Carro("Toyota", "Corolla", 2022, 4, "Gasolina", true);
        Veiculo objmoto = new Moto("Honda", "CB500", 2021, 500, "Esportiva", true);
        Veiculo objbici = new Bicicleta("Caloi", "Elite", 2023, 21, "Disco", false);
        Veiculo objaviao = new Aviao("Boeing", "737", 2018, 2, 180, "LATAM");
        Veiculo objbarco = new Barco("Yamaha", "WaveRunner", 2020, "Lancha", 6, true);

        objcarro.mover();
        objmoto.mover();
        objbici.mover();
        objaviao.mover();
        objbarco.mover();
    }
    
}
