package exercicio10_sistema_de_produtos;

public class Livro extends Produto {

    private String autor;
    private int paginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String categoria,
                 String autor, int paginas, boolean capaDura) {
        super(nome, preco, categoria);
        this.autor = autor;
        this.paginas = paginas;
        this.capaDura = capaDura;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.90; 
    }
}
