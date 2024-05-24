import Exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm < 0 || parametroDois < 0) {
            throw new ParametrosInvalidosException("O parâmetro precisa ser um número positivo!");
        }

        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro precisa ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for(int contador = 0; contador < contagem; contador++) {
            System.out.println("Imprimindo o número " + contador + ".");
        }

        System.out.println();
        System.out.println("Contagem finalizada.");
    }
}