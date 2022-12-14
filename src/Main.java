import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Olá! Que tipo de conta deseja cadastrar?\nDigite: CC(conta corrente) ou CP(conta poupança)");
        String tipo = sc.next();
        conta.abrirConta(tipo);

    }
}