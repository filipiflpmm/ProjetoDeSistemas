package SOLID;

// 1. Single Responsibility Principle (SRP) - Cada classe deve ter uma única responsabilidade
// Definindo uma interface para as operações da calculadora
// A interface é uma abstração para realizar indireção/polimorfismo das classes.

/*
Aplicação dos princípios S.O.L.I.D.:
Single Responsibility Principle (SRP):

Cada classe tem uma responsabilidade única. As classes Somar, Subtrair, Multiplicar e Dividir são responsáveis apenas por uma operação específica.
A classe Calculadora é responsável apenas por usar uma operação e calcular o resultado.

Open/Closed Principle (OCP):
O sistema está aberto para novas operações (como potenciação ou outras funções), sem a necessidade de modificar o código existente. 
Para adicionar novas operações, basta criar uma nova classe que implementa a interface Operacao.

Liskov Substitution Principle (LSP):
As classes Somar, Subtrair, Multiplicar, Dividir substituem a interface Operacao sem quebrar o comportamento esperado. 
Isso significa que qualquer classe que implemente Operacao pode ser usada de forma intercambiável.

Interface Segregation Principle (ISP):
A interface Operacao é simples e não contém métodos desnecessários. Cada operação (somar, subtrair, etc.) 
implementa o método calcular, que é específico para a operação e atende aos requisitos da calculadora.

Dependency Inversion Principle (DIP):
A classe Calculadora depende da abstração Operacao e não das implementações concretas das operações. 
A dependência das operações é invertida, sendo injetada por meio do método setOperacao.

Benefícios dessa abordagem:
Escalabilidade: Novas operações podem ser adicionadas sem modificar o código existente.
Manutenibilidade: Cada classe tem uma responsabilidade única, o que facilita a manutenção e a compreensão do código.
Flexibilidade: A Calculadora pode facilmente alternar entre diferentes operações, já que depende de uma interface e não de implementações concretas.
Este código segue os princípios S.O.L.I.D., deixando a aplicação mais robusta e modular.
*/

interface Operacao {
    
    double executar(double num1, double num2);
}