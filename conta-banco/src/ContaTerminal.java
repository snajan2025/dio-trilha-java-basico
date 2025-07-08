import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + String.format(Locale.US,"%.2f", saldo) + " já está disponivel para saque.");
    }
}

    