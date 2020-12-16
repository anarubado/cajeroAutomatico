package interfaces.Impementaciones;

import modelos.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class IBuscarCuentasImpl implements interfaces.IBuscarCuentas {


    @Override
    public List<Cuenta> buscarCuentaPorAlias(List<Cuenta> cuentas, String alias) {
        List<Cuenta> buscarCuentaPorAlias = new ArrayList<>();

        for (Cuenta cuenta:cuentas) {
            if (cuenta.getAlias() == alias) {
                buscarCuentaPorAlias.add (cuenta);
            }

        }
        return buscarCuentaPorAlias;
    }

    @Override
    public List<Cuenta> buscarcuentapornumcuenta(List<Cuenta> cuentas, int numCuenta) {
        List<Cuenta> buscarCuentaPorNumCuenta = new ArrayList<>();

        for (Cuenta cuenta:cuentas) {
            if (cuenta.getNumCuenta() == numCuenta) {
                buscarCuentaPorNumCuenta.add (cuenta);
            }

        }
        return buscarCuentaPorNumCuenta;
    }

    @Override
    public List<Cuenta> buscarcuentaporsaldo(List<Cuenta> cuentas, int saldo) {
        return null;
    }

    @Override
    public String retornarcuenta(List<Cuenta> cuenta) {
        return null;
    }
}
