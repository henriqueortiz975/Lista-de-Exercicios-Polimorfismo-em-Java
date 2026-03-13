package exercicio12_sistema_de_notificaçoes;

public class Email extends Notificacao {

    private String assunto;
    private String remetente;
    private boolean anexo;

    public Email(String destinatario, String mensagem, String dataEnvio,
                 String assunto, String remetente, boolean anexo) {
        super(destinatario, mensagem, dataEnvio);
        this.assunto = assunto;
        this.remetente = remetente;
        this.anexo = anexo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public boolean isAnexo() {
        return anexo;
    }

    public void setAnexo(boolean anexo) {
        this.anexo = anexo;
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado para " + getDestinatario());
    }
}
