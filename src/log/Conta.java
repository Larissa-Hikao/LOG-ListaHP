package log;

public class Conta {
    double saldo;
    double porcentagem;
    double porcentual;
    
//----------------metodos---------------------
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getSaldo(double saldo){
        return "Seu saldo é R$" + this.saldo;
    }
    public void deposita(double saldo){
        this.saldo+=saldo;
    }
    public void saca(double saldo){
        this.saldo-=saldo;
    }
    public void atualizarConta(double porcentagem){
        this.porcentagem = (this.saldo*porcentagem)/100;
        porcentual = porcentagem;
        this.saldo+=this.porcentagem;
    }
}
