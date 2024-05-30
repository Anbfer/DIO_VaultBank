import java.util.Scanner;

public class ConversaComUsuario {

    private Scanner inputTexto = new Scanner(System.in);
    private ContaTerminal conta = new ContaTerminal();

    public void criarConta() {

        System.out.println("Olá, seja bem vindo ao DIO VaultBank, por favor, digite seu nome: ");
        conta.setNomeCliente(inputTexto.next());
        System.out.println("Digite o número da sua conta: ");
        conta.setNumeroConta(inputTexto.nextInt());
        System.out.println("Digite a agência da sua conta: ");
        conta.setAgencia(inputTexto.next());
        System.out.println("Digite o saldo da sua conta: ");
        conta.setSaldo(inputTexto.nextDouble());
        System.out.println("Conta criada com sucesso!");
    }

    public void infoConta() {
        System.out.println("Olá " + conta.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                + conta.getNumeroConta() + ", e seu saldo R$" + conta.getSaldo() + ", já está disponível para saque.");
    }

}
