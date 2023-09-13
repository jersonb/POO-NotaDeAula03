package Questao02;

public class Diretor extends Funcionario{

    private int acoes;
    public Diretor(String nome, float salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "acoes=" + acoes +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
