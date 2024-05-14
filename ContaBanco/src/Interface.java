import java.util.Scanner;

public class Interface {

    public Interface() {
    }
    Scanner meuScanner = new Scanner(System.in);
    public String getNome(){
        System.out.printf("Digite seu nome: ");
        return meuScanner.nextLine();
    }

    public int getAgencia(){
        System.out.printf("Digite sua agencia: ");
        return meuScanner.nextInt();
    }

    public int getConta(){
        System.out.printf("Digite sua conta: ");
        return meuScanner.nextInt();
    }

    public float getSaldo(){
        System.out.printf("Digite quando deseja depositar para abrir a conta: ");
        return  meuScanner.nextFloat();
    }

    public  void setDadosCliente(String nome, int agencia, int conta, float saldo){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.",nome,agencia,conta,saldo);
    }
}
