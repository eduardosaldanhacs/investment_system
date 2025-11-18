public class Investimento {

    private String nome;
    private int tipo;
    private double valorAplicado;
    private double valorAtual;
    private double rentabilidade;

    public Investimento(String nome, int tipo, double valorAplicado, double valorAtual, double rentabilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.valorAplicado = valorAplicado;
        this.valorAtual = valorAtual;
        this.rentabilidade = rentabilidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override
    public String toString() {
        return nome + " | Tipo: " + tipo + " | Aplicado: " + valorAplicado + " | Atual: " + valorAtual;
    }
}
