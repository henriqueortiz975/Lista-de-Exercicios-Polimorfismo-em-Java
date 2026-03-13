package exercicio12_sistema_de_notificaçoes;

public class Exercicio12_Sistema_de_Notificaçoes {

    public static void main(String[] args) {
        Notificacao objE = new Email("Henriqueortiz3090@email.com", "Olá!", "20/03/2026",
                "Aviso", "empresa@email.com", true);

        Notificacao objS = new SMS("Henrique Ibarra", "Sua conta venceu", "20/03/2026",
                "99999-9999", "Vivo", 160);

        Notificacao objP = new Push("Rafael Pires", "Você recebeu uma mensagem", "20/03/2026",
                "AppChat", true, true);

        Notificacao objW = new WhatsApp("Maria Mores", "Oi tudo bem?", "20/03/2026",
                "98888-8888", true, true);

        Notificacao objT = new Telegram("Pedro Botega", "Nova atualização disponível", "20/03/2026",
                "@pedro", false, false);

        objE.enviar();
        objS.enviar();
        objP.enviar();
        objW.enviar();
        objT.enviar();
    }
    
}
