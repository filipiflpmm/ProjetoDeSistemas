package STRATEGY;

// 2. Implementações concretas das operações (estratégias)
/*
Classes de Estratégia Concreta:
Cada operação (Somar, Subtrair, Multiplicar, Dividir) implementa a interface 
Operacao e define o comportamento específico de cada operação.
*/

class Soma implements Operacao {
    
    public double executar(double num1, double num2) {
        return num1 + num2;
    }
}