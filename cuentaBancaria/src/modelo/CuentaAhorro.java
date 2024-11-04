package modelo;

import java.util.List;

public class CuentaAhorro extends CuentaBancaria{

    public CuentaAhorro() {
        super();
    }

    public CuentaAhorro(int saldoCuenta) {
        super(saldoCuenta);
    }

    @Override
    public void actualizarSaldoMensual() {

    }

    @Override
    public void transferir(int cantidad) {
        super.transferir(cantidad);
    }


}
