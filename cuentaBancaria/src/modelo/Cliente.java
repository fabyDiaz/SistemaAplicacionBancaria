package modelo;

public class Cliente {

    //Cree una clase Cliente, la cual guardará el nombre, rut, cuenta corriente y cuenta de ahorro (si es
    //que tiene).
    private String nombre;
    private String rut;
    private CuentaCorriente cuentaCorriente;
    private CuentaAhorro cuentaAhorro;

    public Cliente() {
    }

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public Cliente(String nombre, String rut, CuentaCorriente cuentaCorriente) {
        this.nombre = nombre;
        this.rut = rut;
        this.cuentaCorriente = cuentaCorriente;
    }
    public Cliente(String nombre, String rut, CuentaCorriente cuentaCorriente, CuentaAhorro cuentaAhorro) {
        this.nombre = nombre;
        this.rut = rut;
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaAhorro = cuentaAhorro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public CuentaAhorro getCuentaAhorro() {
        return cuentaAhorro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
        this.cuentaAhorro = cuentaAhorro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", cuentaCorriente=" + cuentaCorriente +
                ", cuentaAhorro=" + cuentaAhorro +
                '}';
    }
}
