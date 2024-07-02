import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        //Obtendo as informações do usuário
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.next();

        System.out.println("Ditite o saldo: ");
        double saldo = scanner.nextDouble();

        //Exibindo os dados:
        System.out.println("Olá" + nome + "obrigado(a) por criar uma conta em nosso banco!" + "O número da sua conta é: " + conta + "o número da sua agência é: " + agencia + "e o seu saldo de: " + saldo + "já está disponível para saque!");
    }
}
