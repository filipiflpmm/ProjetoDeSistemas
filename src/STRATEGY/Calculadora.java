package STRATEGY;

// 3. Contexto que utiliza a estratégia (Calculadora)
/*
Classe Calculadora (Contexto):
A classe Calculadora utiliza uma instância de Operacao para realizar o cálculo. 
A operação concreta a ser realizada é definida em tempo de execução usando o método mudar(). 
A calculadora pode alternar entre as estratégias sem modificar seu código interno, seguindo o padrão Strategy.
*/

class Calculadora {
    
    private Operacao operacao; // Refere-se à estratégia de operação

    // Método para definir a estratégia de operação
    public void mudar(Operacao operacao) {
        
        this.operacao = operacao;
    }

    // Método para calcular o resultado usando a estratégia atual
    public double executar(double num1, double num2) {

        return operacao.executar(num1, num2);
    }
}
