public class Carteira {

    private int idCarteira;
    private Investidor investidor;
    private Investimento[] investimentos;
    private double totalInvestido;
    private double rentabilidadeTotal;

    public Carteira(int idCarteira, Investidor investidor, int capacidadeInvestimentos) {
        this.idCarteira = idCarteira;
        this.investidor = investidor;
        this.investimentos = new Investimento[capacidadeInvestimentos];
        this.totalInvestido = 0;
        this.rentabilidadeTotal = 0;
    }

    public void adicionarInvestimento(Investimento inv) {
        for (int i = 0; i < investimentos.length; i++) {
            if (investimentos[i] == null) {
                investimentos[i] = inv;
                totalInvestido += inv.getValorAplicado();
                rentabilidadeTotal += inv.getRentabilidade();
                break;
            }
        }
    }

    public void listarInvestimentos() {
        System.out.println("\n--- Investimentos da Carteira " + idCarteira + " ---");
        for (Investimento inv : investimentos) {
            if (inv != null) System.out.println(inv);
        }
    }

    // Getters e Setters
    public int getIdCarteira() {
        return idCarteira;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public double getTotalInvestido() {
        return totalInvestido;
    }

    public double getRentabilidadeTotal() {
        return rentabilidadeTotal;
    }
}
