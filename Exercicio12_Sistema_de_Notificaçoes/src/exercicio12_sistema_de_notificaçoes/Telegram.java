package exercicio12_sistema_de_notificaçoes;

public class Telegram extends Notificacao {

    private String usuario;
    private boolean bot;
    private boolean canal;

    public Telegram(String destinatario, String mensagem, String dataEnvio,
                    String usuario, boolean bot, boolean canal) {
        super(destinatario, mensagem, dataEnvio);
        this.usuario = usuario;
        this.bot = bot;
        this.canal = canal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public boolean isCanal() {
        return canal;
    }

    public void setCanal(boolean canal) {
        this.canal = canal;
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada pelo Telegram para " + getDestinatario());
    }
}
