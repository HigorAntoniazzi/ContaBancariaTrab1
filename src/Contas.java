public class Contas     extends ContaBancariaTrabalho{

    public static void main(String[] args) {


        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setCliente("Mano Menezes");
        contaEspecial.setSaldo(2500000f);
        contaEspecial.setNum_conta(35);

        ContaPaupanca contapaupanca = new ContaPaupanca();

        contapaupanca.setCliente("Abel Ferreira");
        contapaupanca.setSaldo(6500000f);
        contapaupanca.setNum_conta(10);


        System.out.println(contaEspecial.exibirDados());
        System.out.println(contapaupanca.exibirDados());
    }
}
