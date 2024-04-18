package BilleteraVirtual;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private String nombre;
    private Map<String, Double> fondos; // Mapa de moneda -> saldo

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.fondos = new HashMap<>();
        // Inicializar saldo en USD
        this.fondos.put("USD", 0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo(String moneda) {
        return fondos.getOrDefault(moneda, 0.0);
    }

    public void depositar(double cantidad, String moneda) {
        double saldoActual = fondos.getOrDefault(moneda, 0.0);
        fondos.put(moneda, saldoActual + cantidad);
    }

    public void retirar(double cantidad, String moneda) {
        double saldoActual = fondos.getOrDefault(moneda, 0.0);
        if (cantidad > saldoActual) {
            System.out.println("Saldo insuficiente en " + moneda);
        } else {
            fondos.put(moneda, saldoActual - cantidad);
        }
    }

    public void convertirMoneda(double cantidad, String monedaOrigen, String monedaDestino, double tasaDeCambio) {
        double saldoOrigen = fondos.getOrDefault(monedaOrigen, 0.0);
        double saldoDestino = fondos.getOrDefault(monedaDestino, 0.0);

        if (cantidad > saldoOrigen) {
            System.out.println("Saldo insuficiente en " + monedaOrigen);
        } else {
            double cantidadConvertida = cantidad * tasaDeCambio;
            fondos.put(monedaOrigen, saldoOrigen - cantidad);
            fondos.put(monedaDestino, saldoDestino + cantidadConvertida);
            System.out.println(cantidad + " " + monedaOrigen + " convertidos a " + cantidadConvertida + " " + monedaDestino);
        }
    }
}

