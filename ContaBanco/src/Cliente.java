public class Cliente {
    String nomeCliente;

    public Cliente() {
    }
    Conta minhaConta = new Conta();

    public void getNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String setNomeCliente() {
        return nomeCliente;
    }

}
