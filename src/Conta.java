public class Conta {
    private int numeroConta;
    private int digitoVerif;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    public Conta(int numeroConta, String cpfTitular, String nomeTitular, int digitoVerif) {
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.digitoVerif = digitoVerif;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerif() {
        return digitoVerif;
    }

    public void setDigitoVerif(int digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String exibirInfo(){
        return "Conta: "+ numeroConta+"/"+digitoVerif+" - "+nomeTitular+ " ("+cpfTitular+") R$ "+String.format("%.2f", saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
