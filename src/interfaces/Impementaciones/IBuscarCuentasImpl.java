package interfaces.Impementaciones;

import modelos.Cuenta;
import modelos.enums.TipoCuenta;

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
    public List<Cuenta> buscarcuentaportipodecuenta(List <Cuenta> cuentas, TipoCuenta tipoCuenta) {
        List<Cuenta> buscarcuentaportipodecuenta = new ArrayList<>();

        for (Cuenta cuenta:cuentas) {
            if (cuenta.getTipoCuenta().equals(tipoCuenta)) {
                buscarcuentaportipodecuenta.add (cuenta);
            }

        }
        return buscarcuentaportipodecuenta;
    }

    @Override
    public String retornarcuenta(List<Cuenta> cuenta) {
        return null;
    }
}
