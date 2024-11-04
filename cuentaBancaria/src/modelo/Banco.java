package modelo;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    Map<String,Cliente> clientes = new HashMap<>();
    Map<String, CuentaBancaria> cuentas = new HashMap<>();

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public Map<String, CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Map<String, CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void crearClientes(){
        Cliente cliente1 = new Cliente("Homero Simpson", "123-4", (CuentaCorriente) cuentas.get("000000"));
        Cliente cliente2 = new Cliente("March Simpson", "123-5", (CuentaCorriente) cuentas.get("000001"));
        Cliente cliente3 = new Cliente("Moe Szyslak", "123-6", (CuentaCorriente) cuentas.get("000002"), (CuentaAhorro) cuentas.get("000003"));
        clientes.put(cliente1.getRut(), cliente1);
        clientes.put(cliente2.getRut(), cliente2);
        clientes.put(cliente3.getRut(), cliente3);
    }

    public void crearCuentas(){
        CuentaBancaria cuentaC1 = new CuentaCorriente(50000);
        CuentaBancaria cuentaC2 = new CuentaCorriente(20000);
        CuentaBancaria cuentaC3 = new CuentaCorriente(40000);
        CuentaBancaria cuentaA3 = new CuentaAhorro(10000);
        cuentas.put(cuentaC1.getNumeroCuenta(), cuentaC1);
        cuentas.put(cuentaC2.getNumeroCuenta(),cuentaC2);
        cuentas.put(cuentaC3.getNumeroCuenta(),cuentaC3);
        cuentas.put(cuentaA3.getNumeroCuenta(),cuentaA3);
    }

    public void simularTransaccion(String rutOrigen, String rutDestino, int cantidad){

        clientes.get(rutOrigen).getCuentaCorriente().transferir(cantidad);
        clientes.get(rutDestino).getCuentaCorriente().depositar(cantidad);

      /*  mostrarDatosClientes("123-4");
        System.out.println("\n");
        mostrarDatosClientes("123-5");*/

    }

    public void simularSacarDineroCuentaAhorro(String rutOrigen, int cantidad){
        clientes.get(rutOrigen).getCuentaAhorro().transferir(cantidad);
        clientes.get(rutOrigen).getCuentaCorriente().depositar(cantidad);
    }

    public void mostrarDatosClientes(){

        for (Map.Entry<String, Cliente> c : clientes.entrySet()) {
            System.out.println("RUT CLIENTE: " + c.getKey() + "\n" +
                    "NOMBRE CLIENTE: " + c.getValue().getNombre()+ "\n" +
                    "N° CUENTA CORRIENTE: "+ c.getValue().getCuentaCorriente().getNumeroCuenta());
            c.getValue().getCuentaCorriente().historialDeTrnsacciones();
            if(c.getValue().getCuentaAhorro()!=null){
                System.out.println("=============================");
                System.out.println( "\nN° CUENTA AHORRO: "+ c.getValue().getCuentaAhorro().getNumeroCuenta());
                c.getValue().getCuentaAhorro().historialDeTrnsacciones();
            }
            System.out.println("\n\n");
        }

    }

    public void mostrarDatosClientes(String rutCliente){

        Cliente cliente = clientes.get(rutCliente);
        System.out.println("RUT CLIENTE: " + cliente.getRut() + "\n" +
                "NOMBRE CLIENTE: " + cliente.getNombre()+ "\n" +
                "N° CUENTA CORRIENTE: "+ cliente.getCuentaCorriente().getNumeroCuenta()+ "\n");
        cliente.getCuentaCorriente().historialDeTrnsacciones();
        if(cliente.getCuentaAhorro()!=null){
            System.out.println("=============================");
            System.out.println( "\nN° CUENTA AHORRO: "+ cliente.getCuentaAhorro().getNumeroCuenta());
            cliente.getCuentaAhorro().historialDeTrnsacciones();
        }

    }

}
