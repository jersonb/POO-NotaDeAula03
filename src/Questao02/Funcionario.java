package Questao02;
/*
* Questão 02
    Elabore um programa que tenha uma classe chamada Funcionario com os seguintes atributos: nome e salario
    e crie duas subclasses: Gerente e Diretor, que herdam da classe Funcionário.
    Na classe Gerente, adicione um atributo adicional chamado departamento (String).
    Nesta classe, o gerente possui um método para calcular®onus de 10% do salário.
    Na classe Diretor, adicione um atributo adicional chamado ações (int) que representa a quantidade de ações da empresa que o diretor possul.
    Na classe Main, Interaja para o cadastro e exibição dos dados.
* */
public abstract class Funcionario {
    protected float salario;
    protected String nome;

    protected Funcionario(String nome,float salario) {
        this.salario = salario;
        this.nome = nome;
    }

    public void imprimirDadosFuncionario(IImpressora impressora){

        impressora.imprimir(toString());
    }
}
