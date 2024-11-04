package cl.diazfabiola.modelo;

public class CuentaAhorro extends CuentaBancaria{

    private final double penalizacion = 0.05;

    public CuentaAhorro() {
        super();
    }

    public CuentaAhorro(int saldoCuenta) {
        super(saldoCuenta);
    }

    @Override
    public void actualizarSaldoMensual() {
    }

   /* @Override
    public void transferir(int cantidad) {
        super.transferir((int)(cantidad-(cantidad*penalizacion)));
    }*/

    @Override
    public void transferir(int cantidad, String numeroCuenta) {
        super.transferir((int)(cantidad-(cantidad*penalizacion)), numeroCuenta);
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "penalizacion=" + penalizacion +
                "} " + super.toString();
    }
}
