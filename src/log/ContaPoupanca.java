package log;

public class ContaPoupanca extends Conta {
    
    @Override
    public void atualizarConta(double porcentagem){
        this.porcentagem = (this.saldo*(porcentagem*3))/100;
        porcentual = porcentagem;
        this.saldo+=this.porcentagem;
    }
}
