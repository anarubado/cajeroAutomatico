package interfaces.Impementaciones;

import interfaces.IOperaciones;
import modelos.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class IOperacionesImpl implements IOperaciones {

    public List<Cuenta> extraccionDeCuenta(List<Cuenta> cuentas, int numCuenta, int montoExtraccion) {
        List<Cuenta> extraerDeCuenta = new ArrayList<>();
        for (Cuenta cuenta: cuentas) {
            if (cuenta.getNumCuenta() == numCuenta){
                cuenta.setSaldo(cuenta.getSaldo() - montoExtraccion);{
                    extraerDeCuenta.add(cuenta);
                };
            }
        }
        return extraerDeCuenta;

    }
}
