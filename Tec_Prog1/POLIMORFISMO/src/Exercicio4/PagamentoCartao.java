package Exercicio4;


public class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito...");
    }

    public double Cashback(double valorPago) {
        double cashback = valorPago * 0.20;
        System.out.println("Você recebeu R$ " + cashback + " de cashback!");
        return cashback;
    }
}