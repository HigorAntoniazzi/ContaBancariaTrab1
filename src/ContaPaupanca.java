public class ContaPaupanca extends ContaBancariaTrabalho{

    private Integer diasRendimento;


    public void CalcularNovoSaldo(Float txrendimento){
       float rendimentoConta = saldo * txrendimento * diasRendimento / 365;


       saldo += txrendimento;



    }







}
