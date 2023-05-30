public class ContaBancariaTrabalho {
   public String cliente;

    public Integer num_conta;

    public Float saldo;

    public Float vlrsaque;


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(Integer num_conta) {
        this.num_conta = num_conta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }


public void  sacar (Float saldo){
       this.saldo -= vlrsaque;

       if (vlrsaque > saldo){
           System.out.println("o seu saldo é Insuficiente");
       }else{
           saldo -= vlrsaque;
           System.out.println("saque realizado com sucesso");
       }
}

public void  depositar(Float vlrsaque){

        saldo += vlrsaque;

    System.out.println("saque realixado com sucesso");

}

public Float exibirDados(){

return getSaldo();


}





}
