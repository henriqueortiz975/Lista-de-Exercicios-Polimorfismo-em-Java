package exercicio12_sistema_de_notificaçoes;

public class Notificacao {

    private String destinatario;
    private String mensagem;
    private String dataEnvio;

    public Notificacao(String destinatario, String mensagem, String dataEnvio) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void enviar() {
        System.out.println("Enviando notificação");
    }
}
