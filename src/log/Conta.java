package log;

public class Conta {
    protected double saldo;
    protected double porcentagem;
    protected double porcentual;
    
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
    public void atualiza(double porcentagem){
        this.porcentagem = (this.saldo*porcentagem)/100;
        porcentual = porcentagem;
        this.saldo+=this.porcentagem;
    }
}
