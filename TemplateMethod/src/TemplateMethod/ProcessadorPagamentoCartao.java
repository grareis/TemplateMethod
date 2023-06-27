package TemplateMethod;
// Subclasse para pagamento com cartão de crédito
public class ProcessadorPagamentoCartao extends ProcessadorPagamento {

    @Override
    protected void validarDados() {
        // Lógica para validar os dados do cartão de crédito
        System.out.println("Validando dados do cartão de crédito...");
    }

    @Override
    protected void calcularTotal() {
        // Lógica para calcular o valor total do pagamento com cartão de crédito
        System.out.println("Calculando total para pagamento com cartão de crédito...");
    }

    @Override
    protected void realizarPagamento() {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Realizando pagamento com cartão de crédito...");
    }
}