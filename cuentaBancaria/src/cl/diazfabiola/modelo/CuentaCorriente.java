package cl.diazfabiola.modelo;

import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {

    private final int costoMantenciónFijo = 10;

    public CuentaCorriente() {
        super();
    }

    public CuentaCorriente(int saldoCuenta) {
        super(saldoCuenta);
    }

    @Override
    public void actualizarSaldoMensual() {
        Date hoy = new Date();
        if (hoy.getDate() == 1) {
            super.setSaldoCuenta(super.getSaldoCuenta()-costoMantenciónFijo);
        }
    }
/*
    @Override
    public void transferir(int cantidad, String numeroCuenta) {
        super.transferir((int)(cantidad*1.05));
    }*/

    @Override
    public void transferir(int cantidad, String numeroCuenta) {
        super.transferir((int)(cantidad*1.05), numeroCuenta);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "costoMantenciónFijo=" + costoMantenciónFijo +
                "} " + super.toString();
    }
}
