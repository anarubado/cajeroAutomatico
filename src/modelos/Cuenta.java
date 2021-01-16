package modelos;

import modelos.enums.TipoCuenta;

public class Cuenta {
    private TipoCuenta tipoCuenta;
    private double saldo;
    private int numCuenta;
    private String alias;

    public Cuenta(TipoCuenta tipoCuenta, double saldo, int numCuenta, String alias) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.alias = alias;
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

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipoCuenta=" + tipoCuenta.name() +
                ", saldo=" + saldo +
                ", numCuenta=" + numCuenta +
                ", alias='" + alias + '\'' +
                '}';
    }
}
