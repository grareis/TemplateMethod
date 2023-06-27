package TemplateMethod;
// Classe abstrata ProcessadorPagamento
public abstract class ProcessadorPagamento {

    // Método Template
    public final void processadorPagamento() {
        validarDados();
        calcularTotal();
        realizarPagamento();
        enviarNotificacao();
    }

    protected abstract void validarDados();

    protected abstract void calcularTotal();

    protected abstract void realizarPagamento();

    // Método Hook
    protected void enviarNotificacao() {
        // Lógica para enviar notificação de pagamento
        System.out.println("Enviando notificação de pagamento...");
    }
}