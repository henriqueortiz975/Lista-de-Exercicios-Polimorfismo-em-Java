package exercicio12_sistema_de_notificaçoes;

public class SMS extends Notificacao {

    private String numeroTelefone;
    private String operadora;
    private int limiteCaracteres;

    public SMS(String destinatario, String mensagem, String dataEnvio,
               String numeroTelefone, String operadora, int limiteCaracteres) {
        super(destinatario, mensagem, dataEnvio);
        this.numeroTelefone = numeroTelefone;
        this.operadora = operadora;
        this.limiteCaracteres = limiteCaracteres;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public int getLimiteCaracteres() {
        return limiteCaracteres;
    }

    public void setLimiteCaracteres(int limiteCaracteres) {
        this.limiteCaracteres = limiteCaracteres;
    }

    @Override
    public void enviar() {
        System.out.println("SMS enviado para " + getDestinatario());
    }
}
