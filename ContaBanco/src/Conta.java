public class Conta {
    int numeroConta;
    int numerAgencia;
    float saldo;
    public Conta() {
    }

    public void getNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int setNumeroConta(){
        return numeroConta;
    }

    public void getNumeroAgencia(int numerAgencia){
        this.numerAgencia = numerAgencia;
    }

    public int setNumeroAgencia(){
        return numerAgencia;
    }

    public void  getSaldo(float saldo){
        this.saldo = saldo;
    }

    public  float setSaldo(){
        return  saldo;
    }

}
