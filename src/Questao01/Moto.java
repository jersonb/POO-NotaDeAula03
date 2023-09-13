package Questao01;

public final class Moto extends Veiculo{
    private final int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Moto:\nmarca: %s\nmodelo: %s\nano de fabricação: %d\nquantidade de cilindradas:%d",marca, modelo, anoFabricacao, cilindradas);
    }
}
