package interfaces;

import modelos.Cuenta;

import java.util.List;

public interface IBuscarCuentas {

    List<Cuenta> buscarCuentaPorAlias(List <Cuenta> cuentas, String alias);
    List<Cuenta> buscarcuentapornumcuenta (List <Cuenta> cuentas, int numCuenta);
    List<Cuenta> buscarcuentaporsaldo(List <Cuenta> cuentas, int saldo);
    String retornarcuenta (List<Cuenta> cuenta);
}
