package exercicio12_sistema_de_notificaçoes;

public class Push extends Notificacao {

    private String aplicativo;
    private boolean som;
    private boolean vibracao;

    public Push(String destinatario, String mensagem, String dataEnvio,
                String aplicativo, boolean som, boolean vibracao) {
        super(destinatario, mensagem, dataEnvio);
        this.aplicativo = aplicativo;
        this.som = som;
        this.vibracao = vibracao;
    }

    public String getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isVibracao() {
        return vibracao;
    }

    public void setVibracao(boolean vibracao) {
        this.vibracao = vibracao;
    }

    @Override
    public void enviar() {
        System.out.println("Notificação push enviada para " + getDestinatario());
    }
}
