package interfaces;

import modelos.Cuenta;

import java.util.List;

public interface IOperaciones {


    List<Cuenta> extraccionDeCuenta(List<Cuenta> cuentas, int numCuenta, int montoExtraccion);

}
