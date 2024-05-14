public class Main {
    public static void main(String[] args) {
        Interface minhaInterface = new Interface();
        Cliente cliente = new Cliente();

        cliente.getNomeCliente(minhaInterface.getNome());
        cliente.minhaConta.getNumeroAgencia(minhaInterface.getAgencia());
        cliente.minhaConta.getNumeroConta(minhaInterface.getConta());
        cliente.minhaConta.getSaldo(minhaInterface.getSaldo());

        minhaInterface.setDadosCliente(cliente.nomeCliente,cliente.minhaConta.numerAgencia,cliente.minhaConta.numeroConta,cliente.minhaConta.saldo);

    }
}
