package log;

public class ContaCorrente extends Conta{
    @Override
    public void atualizarConta(double porcentagem){
        this.porcentagem = (this.saldo*(porcentagem*2))/100;
        porcentual = porcentagem;
        this.saldo+=this.porcentagem;
    }
    
}
