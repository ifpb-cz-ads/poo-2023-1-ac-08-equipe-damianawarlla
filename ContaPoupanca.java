public class ContaPoupanca extends Conta{
   
    public ContaPoupanca(int numero,String nome_titular){
 
         super(numero,nome_titular);
 
    }
 
     public void rejustar(double percentual){
         double saldoAtual = this.getSaldo();
         double reajuste = saldoAtual * percentual;
         this.depositar(reajuste);
     }
 }