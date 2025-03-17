package SOLID;
import java.util.Scanner;

/*
Para implementar o código seguindo os princípios do padrão de projeto S.O.L.I.D., precisamos aplicar as boas práticas de design de software
que tornam o código mais modular, flexível e fácil de manter. O S.O.L.I.D. é um acrônimo que se refere aos seguintes princípios:

S - Single Responsibility Principle (Princípio da Responsabilidade Única)
O - Open/Closed Principle (Princípio do Aberto/Fechado)
L - Liskov Substitution Principle (Princípio da Substituição de Liskov)
I - Interface Segregation Principle (Princípio da Segregação de Interface)
D - Dependency Inversion Principle (Princípio da Inversão de Dependência)
Agora, vamos refatorar o código para seguir esses princípios.
*/

// 5. Dependency Inversion Principle (DIP) - A Calculadora depende de abstrações (interfaces), não de implementações concretas
// O controle de dependência é feito pela injeção de dependência da operação na classe Calculadora

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(); // Instanciando a calculadora

        // Exibindo o menu de opções
        System.out.println("Escolha uma operação a seguir:");
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

        // Selecionando a operação apropriada e injetando na calculadora
        switch (operacao) {
            case 1:
                calculadora.definir(new Soma());
                break;
            case 2:
                calculadora.definir(new Subtracao());
                break;
            case 3:
                calculadora.definir(new Multiplicacao());
                break;
            case 4:
                calculadora.definir(new Divisao());
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