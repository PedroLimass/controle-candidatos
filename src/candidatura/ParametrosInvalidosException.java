package candidatura;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(int parametroUm, int parametroDois) {
        super("O segundo parâmetro (" + parametroDois + ") deve ser maior que o primeiro (" + parametroUm + ").");
    }
}
