package exercicio7_dispositivos_eletronicos;

public class Exercicio7_Dispositivos_Eletronicos {

    public static void main(String[] args) {
        Dispositivo objTe = new Televisao("Samsung", "QLED", 120, 55, "4K", true);
        Dispositivo objC = new Computador("Dell", "Inspiron", 300, "Intel i7", 16, 512);
        Dispositivo objSmartphone = new Smartphone("Apple", "iPhone", 20, 256, 8, true);
        Dispositivo objTa = new Tablet("Samsung", "Galaxy Tab", 40, 11, 128, true);
        Dispositivo obSmartwatch = new Smartwatch("Apple", "Watch", 10, 2, true, true);

        objTe.ligar();
        objC.ligar();
        objSmartphone.ligar();
        objTa.ligar();
        obSmartwatch.ligar();
    }
    
}
