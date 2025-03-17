package SOLID;

// 3. Liskov Substitution Principle (LSP) - Todas as operações implementam a interface `Operacao`
// 4. Interface Segregation Principle (ISP) - O código está segregado corretamente em interfaces específicas

// Classe Calculadora que usa as operações de forma intercambiável
class Calculadora {
    
    private Operacao operacao;

    // Método para definir qual operação será utilizada
    public void definir(Operacao operacao) {
        this.operacao = operacao;
    }

    // Método para calcular com a operação atual
    public double executar(double num1, double num2) {
        return operacao.executar(num1, num2);
    }
}