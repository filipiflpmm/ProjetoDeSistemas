package SOLID;

// 2. Open/Closed Principle (OCP) - As operações estão abertas para extensão e fechadas para modificação
// Implementações concretas para cada operação

class Subtracao implements Operacao {
    
    public double executar(double num1, double num2) {
        return num1 - num2;
    }
}
