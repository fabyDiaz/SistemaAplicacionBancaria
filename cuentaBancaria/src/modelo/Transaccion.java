package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaccion {

    private int cantidad;
    private String fechaActual;
    private String numeroCuentaDestino;
    private boolean tipo;

    public Transaccion(int cantidad, boolean tipo, String numeroCuentaDestino) {
        this.cantidad = cantidad;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.fechaActual = formato.format(new Date());
        this.tipo = tipo;
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    public String obtenerTipo(){
        return (tipo == true) ? "abono" : "cargo";
    }

    public void mostrarTransaccion(){
        System.out.printf("%-20s| %-20s| %-15s| %-10s\n",fechaActual, numeroCuentaDestino, obtenerTipo(), cantidad);
    }


}
