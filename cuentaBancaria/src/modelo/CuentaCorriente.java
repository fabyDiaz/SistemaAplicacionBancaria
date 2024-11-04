package modelo;

import java.util.List;

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

    }

    @Override
    public void transferir(int cantidad) {
        super.transferir((int)(cantidad*1.05));
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "costoMantenciónFijo=" + costoMantenciónFijo +
                "} " + super.toString();
    }
}
