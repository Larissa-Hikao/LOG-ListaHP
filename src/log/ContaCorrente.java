package log;

public class ContaCorrente extends Conta{
    @Override
    public void atualiza(double porcentagem){
        this.porcentagem = (this.saldo*(porcentagem*2))/100;
        porcentual = porcentagem;
        this.saldo+=this.porcentagem;
    }
    @Override
    public void deposita(double saldo){
        this.saldo+=saldo-0.10;
    }
    
}
