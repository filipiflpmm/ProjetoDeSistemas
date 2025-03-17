package STRATEGY;

import java.util.Scanner;

/*
Benefícios do padrão Strategy:
Flexibilidade: O código da calculadora pode mudar o comportamento das operações 
sem precisar modificar a classe Calculadora. Apenas a estratégia é alterada.
Extensibilidade: Novas operações podem ser facilmente adicionadas criando uma nova 
implementação da interface OperacaoStrategy e configurando a calculadora para usar essa nova estratégia.
Isolamento das responsabilidades: Cada operação é isolada em uma classe separada, o que torna o código mais limpo e fácil de entender.

Como funciona:
O programa solicita ao usuário escolher uma operação entre somar, subtrair, multiplicar ou dividir.
Com base na escolha, a classe Main seleciona a estratégia apropriada e a injeção de dependência da estratégia é feita na calculadora.
A calculadora executa o cálculo usando a estratégia definida e exibe o resultado.
Esse exemplo segue o padrão Strategy, permitindo uma solução flexível e fácil de estender.

O padrão de projeto Strategy é um padrão comportamental que permite a troca de algoritmos (ou comportamentos) em tempo de execução. 
Esse padrão é útil quando você tem várias formas de realizar uma operação e deseja 
escolher qual delas usar sem modificar o código cliente (como o código da calculadora).

No contexto da sua calculadora, podemos aplicar o padrão Strategy para isolar as diferentes operações 
(como soma, subtração, multiplicação e divisão) em estratégias separadas, permitindo 
que a classe Calculadora altere o comportamento das operações de forma flexível.

Classe Main:
Interage com o usuário, lê os dados de entrada e configura a estratégia da calculadora com base na operação escolhida. 
A classe Main então realiza o cálculo e exibe o resultado.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(); // Instanciando a calculadora

        // Exibindo o menu de opções
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Digite o número da operação desejada: ");
        
        // Lendo a operação
        int operacao = scanner.nextInt();
        
        // Lendo os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Selecionando a operação apropriada e configurando a estratégia na calculadora
        switch (operacao) {
            case 1:
                calculadora.mudar(new Soma());
                break;
            case 2:
                calculadora.mudar(new Subtracao());
                break;
            case 3:
                calculadora.mudar(new Multiplicacao());
                break;
            case 4:
                calculadora.mudar(new Divisao());
                break;
            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }

        // Realizando o cálculo e mostrando o resultado
        double resultado = calculadora.executar(num1, num2);
        System.out.println("Resultado: " + resultado);
        
        // Fechando o scanner
        scanner.close();
    }
}

