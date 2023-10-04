
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        new Conta();
        Conta MinhaConta;
        MinhaConta = new Conta();

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu numero");
        MinhaConta.numero = scanner.nextInt();
        System.out.println("Por favor, digite a agencia bancaria");
        MinhaConta.agencia = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome");
        MinhaConta.nome = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo");
        MinhaConta.saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ MinhaConta.nome +", obrigado por criar uma conta em nosso banco, sua agência é " + MinhaConta.agencia + ", conta " + MinhaConta.numero + " e seu saldo " + MinhaConta.saldo + " já está disponível para saque");
        
    }
}
