public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private double saldo;

    // construtor
    public Conta() {
        this.status = false;
        this.saldo = 0.0;
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
            this.saldo = 50.0;
            this.tipo = "CC";
            this.dono = nome;
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
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if (this.status == true && valor >= this.saldo) {
            this.saldo -= valor;
        }
    }
    public void pegarMensal(String tipo) {
        if (tipo == "CC" || tipo == "cc") {
            this.saldo += 12;
        } else if (tipo == "CP" || tipo == "cp") {
            this.saldo += 20;
        } else {
            System.out.println("Digite o tipo de conta correto.");
        }
    }
}
