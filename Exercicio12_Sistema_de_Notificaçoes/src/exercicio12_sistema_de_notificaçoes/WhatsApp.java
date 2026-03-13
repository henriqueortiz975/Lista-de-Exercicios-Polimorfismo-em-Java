package exercicio12_sistema_de_notificaçoes;

public class WhatsApp extends Notificacao {

    private String numeroTelefone;
    private boolean confirmacaoLeitura;
    private boolean midia;

    public WhatsApp(String destinatario, String mensagem, String dataEnvio,
                    String numeroTelefone, boolean confirmacaoLeitura, boolean midia) {
        super(destinatario, mensagem, dataEnvio);
        this.numeroTelefone = numeroTelefone;
        this.confirmacaoLeitura = confirmacaoLeitura;
        this.midia = midia;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean isConfirmacaoLeitura() {
        return confirmacaoLeitura;
    }

    public void setConfirmacaoLeitura(boolean confirmacaoLeitura) {
        this.confirmacaoLeitura = confirmacaoLeitura;
    }

    public boolean isMidia() {
        return midia;
    }

    public void setMidia(boolean midia) {
        this.midia = midia;
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada pelo WhatsApp para " + getDestinatario());
    }
}
