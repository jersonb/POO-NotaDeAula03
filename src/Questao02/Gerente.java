package Questao02;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void calcularBonus() {
        this.salario = (float) (this.salario * 1.1);

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
