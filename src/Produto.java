public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private Fabricante fabricante;
    public Produto() {

    }

    public Produto(int codigo, String descricao, double preco, Fabricante fabricante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


}