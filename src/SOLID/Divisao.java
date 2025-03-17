package SOLID;

// 2. Open/Closed Principle (OCP) - As operações estão abertas para extensão e fechadas para modificação
// Implementações concretas para cada operação

class Divisao implements Operacao {
    
    public double executar(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de erro
        }
        return num1 / num2;
    }
}
