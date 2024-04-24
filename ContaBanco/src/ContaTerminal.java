import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        conta.setNumero(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o número da agência:");
        conta.setAgencia(sc.nextLine());

        System.out.println("Digite seu nome:");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Digite seu saldo:");
        conta.setSaldo(Double.parseDouble(sc.nextLine()));

        System.out.println(conta);
    }
}