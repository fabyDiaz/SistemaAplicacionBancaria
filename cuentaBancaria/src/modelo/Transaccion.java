package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaccion {

    private int cantidad;
    private String fechaActual;
    private boolean tipo;

    public Transaccion(int cantidad, boolean tipo) {
        this.cantidad = cantidad;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.fechaActual = formato.format(new Date());
        this.tipo = tipo;
    }

    public String obtenerTipo(){
        return (tipo == true) ? "abono" : "cargo";
    }

    public void mostrarTransaccion(){
        System.out.printf("%-20s| %-15s| %-10s\n",fechaActual, obtenerTipo(), cantidad);
    }


}
