import cl.diazfabiola.modelo.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.crearCuentas();
        banco.crearClientes();
       // System.out.println(banco.getClientes().get("123-4"));
        banco.simularTransaccion("123-4","123-5", 1000);
        banco.simularSacarDineroCuentaAhorro("123-6",2000);
        banco.mostrarDatosClientes();

    }
}