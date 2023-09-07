import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
    //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem-vindo(a) ao sistema de conta bancária!\n");
        
        //Recebendo dados do Cliente:

        //Nome do Cliente (String):
        System.out.println("Por favor, informe o seu nome!");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();

        //Número da Agência (String)
        System.out.println("\nPor favor, digite o número da sua Agência!");
        System.out.print("Agência: ");
        String numeroAgencia = scanner.next();

        //Número da Conta  (int)
        System.out.println("\nPor favor, digite o número da sua Conta!");
        System.out.print("Conta: ");
        int numeroConta = scanner.nextInt();
        
        //Saldo (double)
        System.out.println("\nPor favor, digite o seu saldo!");
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        //Exibindo informações coletadas:
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua Agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");
    }
}
