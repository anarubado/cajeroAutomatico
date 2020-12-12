package modelos;

public class Cuenta {
    private String tipoDeCuenta;
    private double saldo;
    private int numCuenta;
    private String alias;

    public Cuenta(String tipoDeCuenta, double saldo, int numCuenta, String alias) {
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.alias = alias;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipoDeCuenta='" + tipoDeCuenta + '\'' +
                ", saldo=" + saldo +
                ", numCuenta=" + numCuenta +
                ", alias='" + alias + '\'' +
                '}';
    }
}
