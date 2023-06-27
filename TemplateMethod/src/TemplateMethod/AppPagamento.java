package TemplateMethod;
public class AppPagamento {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamentoCartao();
        processadorPagamento.processadorPagamento();

        System.out.println();

        processadorPagamento = new ProcessadorPagamentoPayPal();
        processadorPagamento.processadorPagamento();
    }
}