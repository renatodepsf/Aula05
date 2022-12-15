public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private double saldo;

    // construtor
    public Conta() {
        this.setStatus(false);
        this.setSaldo(0.0);
    }

    // metodos get e set
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    // métodos
    public void abrirConta(String nome, int tipo) {
        if (tipo == 1) {
            this.setSaldo(50.0);
            this.setTipo("CC");
            this.dono = nome;
            this.status = true;
        }
        else if (tipo == 2) {
            this.saldo = 150.0;
            this.tipo = "CP";
            this.dono = nome;
        }
        else {
            System.out.println("ERRO! Tipo de conta não disponível");
        }
    }
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Realize o saque de R$" + this.saldo + " reais para fechar a conta");
        } else {
            System.out.println("Conta fechada!");
        }
    }
    public void depositar(double valor) {
        if (this.status == true) {
            setSaldo(getSaldo() + valor);
        }
        else {
            System.out.println("A conta está fechada!");
        }
    }
    public void sacar(double valor) {
        if (this.status == true && valor >= this.saldo) {
            this.saldo -= valor;
        }
    }
    public void pegarMensal() {
        if (this.tipo == "CC" || this.tipo == "cc") {
            this.saldo += 12;
        } else {
            this.saldo += 20;
        }
    }
    public void verSaldo() {
        System.out.println("Saldo da conta " + getTipo() + ": " + getSaldo());;
    }
}
