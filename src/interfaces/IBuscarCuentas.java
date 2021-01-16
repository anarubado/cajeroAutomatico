package interfaces;

import modelos.Cuenta;
import modelos.enums.TipoCuenta;

import java.util.List;

public interface IBuscarCuentas {

    List<Cuenta> buscarCuentaPorAlias(List <Cuenta> cuentas, String alias);
    List<Cuenta> buscarcuentapornumcuenta (List <Cuenta> cuentas, int numCuenta);
    List<Cuenta> buscarcuentaportipodecuenta(List <Cuenta> cuentas, TipoCuenta tipoCuenta);
    String retornarcuenta (List<Cuenta> cuenta);
}
