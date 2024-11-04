package modelo;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    Map<String,Cliente> clientes = new HashMap<>();
    Map<Integer, CuentaBancaria> cuentas = new HashMap<>();

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public Map<Integer, CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Map<Integer, CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void crearClientes(){
        Cliente cliente1 = new Cliente("Homero Simpson", "123-4", (CuentaCorriente) cuentas.get(0));
        Cliente cliente2 = new Cliente("March Simpson", "123-5", (CuentaCorriente) cuentas.get(1));
        Cliente cliente3 = new Cliente("Mow Szyslak", "123-6", (CuentaCorriente) cuentas.get(2));
        clientes.put(cliente1.getRut(), cliente1);
        clientes.put(cliente2.getRut(), cliente2);
        clientes.put(cliente3.getRut(), cliente3);
    }

    public void crearCuentas(){
        CuentaBancaria cuenta1 = new CuentaCorriente(50000);
        CuentaBancaria cuenta2 = new CuentaCorriente(20000);
        CuentaBancaria cuenta3 = new CuentaCorriente(40000);
        cuentas.put(cuenta1.getNumeroCuenta(), cuenta1);
        cuentas.put(cuenta2.getNumeroCuenta(),cuenta2);
        cuentas.put(cuenta3.getNumeroCuenta(),cuenta3);
    }

    public void simularTransaccion(int cuentaOrigen, int cuentaDestino, int cantidad){

        cuentas.get(cuentaOrigen).transferir(cantidad);
        cuentas.get(cuentaDestino).depositar(cantidad);

        cuentas.get(cuentaOrigen).historialDeTrnsacciones();
        System.out.println("\n");
        cuentas.get(cuentaDestino).historialDeTrnsacciones();


    }

    public void realizarTransferencia(int cuentaOrigen, int cuentaDestino, int cantidad){

    }





}
