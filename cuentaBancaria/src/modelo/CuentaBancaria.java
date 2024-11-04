package modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class CuentaBancaria {

    /*
    Crear una clase abstracta que modele una cuenta bancaria (que tenga los métodos como
depositar y transferir implementados) pero que tenga el método actualizarSaldoMensual
abstracto
○ Esta clase tendrá un saldo de cuenta, un número de cuenta y un historial de transacciones
(representado por una lista de Transacción)
○ Cada vez que se deposita o transfiere dinero, se crea un objeto transaction (tanto en la
cuenta origen como en la cuenta destino) y se actualiza el saldo en cierta cantidad
○ Este historial de transacciones guardará sólo las últimas 20 transacciones realizadas
○ Puede ser útil implementar un método para mostrar la información de la cuenta.
     */

    private static int ultimoNumero = 0;
    private int saldoCuenta;
    private String  numeroCuenta;
    private List<Transaccion> transacciones;

    public CuentaBancaria() {
        this.saldoCuenta = 0;
        this.numeroCuenta = String.format("%06d", ultimoNumero++);
        this.transacciones = new ArrayList<>();
    }
    public CuentaBancaria(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
        this.numeroCuenta = String.format("%06d", ultimoNumero++);
        this.transacciones = new ArrayList<>();
    }

    public static int getUltimoNumero() {
        return ultimoNumero;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void depositar(int cantidad){
        Transaccion transaccion = new Transaccion(cantidad, true);
        this.saldoCuenta += cantidad;
        this.transacciones.add(transaccion);
    }
    public void transferir(int cantidad){
        Transaccion transaccion = new Transaccion(cantidad*-1, false);
        this.saldoCuenta+= cantidad*(-1);
        this.transacciones.add(transaccion);


    }

    public String formatearMoneda(int monto) {
        NumberFormat formatoPesosChilenos = DecimalFormat.getCurrencyInstance(new Locale("es", "CL"));
        // Formatear el número en pesos chilenos
        String montoFormateado = formatoPesosChilenos.format(monto);
        return montoFormateado;
    }

    public void historialDeTrnsacciones(){
        // Mostrar la lista de movimientos bancarios
       // System.out.println("------------------------------------------------");
        System.out.println("SALDO ACTUAL: " + formatearMoneda(saldoCuenta));
        //System.out.println("------------------------------------------------");
        System.out.println("Movimientos Bancarios:");
        System.out.printf("%-20s| %-15s| %-10s\n", "Fecha","Tipo","Monto");
        System.out.println("------------------------------------------------");
        for (Transaccion transaccion : transacciones) {
            transaccion.mostrarTransaccion();
        }
    }
    public abstract void actualizarSaldoMensual();

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldoCuenta=" + saldoCuenta +
                ", numeroCuenta=" + numeroCuenta +
                ", transacciones=" + transacciones +
                '}';
    }
}
