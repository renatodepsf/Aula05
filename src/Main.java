import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Olá! Que tipo de conta deseja cadastrar?\n\t1 - Conta corrente\n\t2 - Conta Poupança");
        int tipo = sc.nextInt();
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        conta.abrirConta(nome, tipo);
        System.out.println("Digite um valor para depósito:");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        conta.verSaldo();
        conta.pegarMensal();
        conta.verSaldo();

    }
}