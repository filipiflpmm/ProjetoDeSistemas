package STRATEGY;

// 1. Definindo a interface Strategy
/*
Interface Operacao:
Define o contrato para todas as operações que podem ser executadas pela calculadora. 
Todas as operações concretas (somar, subtrair, multiplicar, dividir) implementam essa interface, 
o que garante que cada operação tenha o método calcular.
*/

interface Operacao {
    
    double executar(double num1, double num2);
}