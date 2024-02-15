package Classes;

public class ContaCorrente {
    
    private int Codigo;
    private int NumeroConta;
    private int Agencia;
    private float Saldo;
    private String Correntista;
    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }
    public int getNumeroConta() {
        return NumeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.NumeroConta = numeroConta;
    }
    public int getAgencia() {
        return Agencia;
    }
    public void setAgencia(int agencia) {
        this.Agencia = agencia;
    }
    public float getSaldo() {
        return Saldo;
    }
    public void setSaldo(float saldo) {
        this.Saldo = saldo;
    }
    public String getCorrentista() {
        return Correntista;
    }
    public void setCorrentista(String correntista) {
        this.Correntista = correntista;
    }

    public ContaCorrente(int codigo, int numeroConta, int agencia, float saldo, String correntista) {
        this.Codigo = codigo;
        this.NumeroConta = numeroConta;
        this.Agencia = agencia;
        this.Saldo = saldo;
        this.Correntista = correntista;
    }

    public float sacar(float valorSacar){
        this.Saldo = this.Saldo - valorSacar;
        return this.Saldo;
    }

    public float depositar(float valorDepositar){
        this.Saldo = this.Saldo + valorDepositar;
        return this.Saldo;
    }
}
