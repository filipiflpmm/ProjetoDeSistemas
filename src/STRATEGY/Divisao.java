package STRATEGY;

// 2. Implementações concretas das operações (estratégias)
/*
Classes de Estratégia Concreta:
Cada operação (Somar, Subtrair, Multiplicar, Dividir) implementa a interface 
Operacao e define o comportamento específico de cada operação.
*/

class Divisao implements Operacao {
    
    public double executar(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de erro
        }
        return num1 / num2;
    }
}