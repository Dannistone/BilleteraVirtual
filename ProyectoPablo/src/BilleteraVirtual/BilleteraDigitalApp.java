
package BilleteraVirtual;

import java.util.Scanner;

public class BilleteraDigitalApp {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario1");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ver saldo en una moneda");
            System.out.println("2. Depositar fondos en una moneda");
            System.out.println("3. Retirar fondos en una moneda");
            System.out.println("4. Convertir fondos de una moneda a otra");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la moneda (ej. USD): ");
                    String monedaSaldo = scanner.next();
                    System.out.println("Saldo en " + monedaSaldo + ": " + usuario.getSaldo(monedaSaldo));
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    System.out.print("Ingrese la moneda (ej. USD): ");
                    String monedaDeposito = scanner.next();
                    usuario.depositar(cantidadDeposito, monedaDeposito);
                    System.out.println("Depósito exitoso.");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    System.out.print("Ingrese la moneda (ej. USD): ");
                    String monedaRetiro = scanner.next();
                    usuario.retirar(cantidadRetiro, monedaRetiro);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad a convertir: ");
                    double cantidadConvertir = scanner.nextDouble();
                    System.out.print("Ingrese la moneda de origen (ej. USD): ");
                    String monedaOrigen = scanner.next();
                    System.out.print("Ingrese la moneda de destino (ej. EUR): ");
                    String monedaDestino = scanner.next();
                    System.out.print("Ingrese la tasa de cambio (ej. 1.2): ");
                    double tasaDeCambio = scanner.nextDouble();
                    usuario.convertirMoneda(cantidadConvertir, monedaOrigen, monedaDestino, tasaDeCambio);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

