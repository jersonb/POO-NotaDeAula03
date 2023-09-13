package Questao01;

public final class Carro extends Veiculo{
    private final int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Carro:\nmarca: %s\nmodelo: %s\nano de fabricação: %d\nquantidade de portas:%d",marca, modelo, anoFabricacao, numPortas);
    }
}
