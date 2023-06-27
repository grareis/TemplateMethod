package TemplateMethod;
// Subclasse para pagamento com PayPal
public class ProcessadorPagamentoPayPal extends ProcessadorPagamento {

    @Override
    protected void validarDados() {
        // Lógica para validar os dados do PayPal
        System.out.println("Validando dados do PayPal...");
    }

    @Override
    protected void calcularTotal() {
        // Lógica para calcular o valor total do pagamento com PayPal
        System.out.println("Calculando total para pagamento com PayPal...");
    }

    @Override
    protected void realizarPagamento() {
        // Lógica para processar o pagamento com PayPal
        System.out.println("Realizando pagamento com PayPal...");
    }
}