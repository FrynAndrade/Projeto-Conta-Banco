import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da agencia!");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque");

    }
}