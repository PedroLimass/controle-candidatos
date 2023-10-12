package candidatura;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(parametroUm, parametroDois);
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + (i - parametroUm + 1));
        }
    }
}
