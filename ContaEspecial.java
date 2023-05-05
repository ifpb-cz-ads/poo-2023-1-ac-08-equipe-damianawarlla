
public class ContaEspecial extends Conta {
    
    public String tipoConta = "conta especial";
   
    public ContaEspecial(int numero, String nome_titular, double limite){
        
        super(numero, nome_titular);
    }

   
    private double limite;

    private double getLimite(){
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

}

