import Questao01.Carro;
import Questao01.Moto;
import Questao01.Veiculo;
import Questao02.Diretor;
import Questao02.Gerente;

import java.util.Arrays;
import java.util.List;

public class Main {

    /*
    Questão 01
    Elabore um programa que tenha uma super classe chamada Veiculo com os seguintes atributos:
    marca (String), modelo (String) e anoFabricacao (int).
    Este sistema deve ter duas subclasses: Carro e Moto, que herdam da classe Veículo.
    Na classe Carro, adicione um atributo adicional chamado numPortas (int)
    Na classe Moto, adicione um atributo adicional chamado cilindradas (int)
    Crie um método imprimirDetalhes nas classes Carro e Moto que exiba todos os atributos do veículo,
    incluindo os atributos herdados da classe Veículo.
    Na classe Main, crie um objeto Carro e um objeto Moto, configure seus atributos e use o método
    imprimirDetalhes para exibir suas informações.

    Questão 02
    Elabore um programa que tenha uma classe chamada Funcionario com os seguintes atributos: nome e salario
    e crie duas subclasses: Gerente e Diretor, que herdam da classe Funcionário.
    Na classe Gerente, adicione um atributo adicional chamado departamento (String).
    Nesta classe, o gerente possui um método para calcular®onus de 10% do salário.
    Na classe Diretor, adicione um atributo adicional chamado ações (int) que
    representa a quantidade de ações da empresa que o diretor possul.
    Na classe Main, Interaja para o cadastro e exibição dos dados.
    * */
    public static void main(String[] args) {

//        Moto moto = new Moto("Honda", "twister", 2023, 250);
//        Carro carro = new Carro("Fiat", "uno", 2007, 2);
//
//        List<Veiculo> veiculos = Arrays.asList(moto, carro);
//
//        veiculos.forEach(Veiculo::imprimirDetalhes);



        var diretor = new Diretor("Fulano", 100.5f, 10);
        diretor.imprimirDadosFuncionario(System.out::println);

        var gerente = new Gerente("Beltrano",100.5f, "compras");
        gerente.imprimirDadosFuncionario(System.out::println);
        gerente.calcularBonus();
        gerente.imprimirDadosFuncionario(System.out::println);


    }
}