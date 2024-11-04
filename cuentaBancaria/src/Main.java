import modelo.Banco;
import modelo.Cliente;
import modelo.CuentaBancaria;
import modelo.CuentaCorriente;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.crearCuentas();
        banco.crearClientes();
        System.out.println(banco.getClientes().get("123-4"));
        banco.simularTransaccion(0,1, 1000);
        System.out.println(banco.getCuentas().get(0).getSaldoCuenta());

        //Scanner scanner = new Scanner(System.in);

       /* CuentaCorriente cuenta1 = new CuentaCorriente(50000);
        CuentaCorriente cuenta2 = new CuentaCorriente(20000);
        CuentaCorriente cuenta3 = new CuentaCorriente(20000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        Cliente cliente1 = new Cliente("Homero", "Simpson", cuenta1);
        System.out.println(cliente1);

        Map<Integer, CuentaBancaria> cuentas = new HashMap<>();
        cuentas.put(cuenta1.getNumeroCuenta(),cuenta1);
        cuentas.put(cuenta2.getNumeroCuenta(),cuenta2);
        System.out.println(cuentas);

        Map<String,Cliente> clientes = new HashMap<>();
        clientes.put(cliente1.getRut(), cliente1);
        System.out.println(clientes);*/


    }
}