package BilleteraVirtual;

public class Cuenta {
    private Usuario usuario;
    private double saldo;
    private String moneda;

    // Constructor, getters y setters

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public void convertirMoneda(String nuevaMoneda, double tasaDeCambio) {
        // Lógica para convertir el saldo a la nueva moneda
    }
}
