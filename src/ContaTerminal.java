import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try {
            Scanner sc = new Scanner(System.in);
            String scString = "";
            do {
                Conta conta = new Conta();
                System.out.println("Digite a agencia: ");
                conta.setAgencia(sc.next());
                System.out.println("Digite a conta ");
                conta.setNumero(sc.nextInt());
                System.out.println("Por favor, digite o nome da pessoa: ");
                conta.setNomeCliente(sc.next());
                System.out.println("Por favor, informe o saldo: ");
                conta.setSaldo(sc.nextDouble());
                
                System.out.println("Ola " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agencia e " + conta.getAgencia() + ", conta " + conta.getNumero() + ".");
                System.out.println("Seu saldo eh: " + conta.getSaldo());
                
                System.out.println("Digite a letra e para sair");
                scString = sc.next();
            } while (!scString.equals("e"));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
