package interfaces;

import modelos.Cuenta;
import modelos.Usuario;

import java.util.List;

public interface IOperaciones {


    List<Cuenta> extraccionDeCuenta(List<Cuenta> cuentas, int numCuenta, int montoExtraccion);

    String extraccionUsuario (List<Usuario> usuario, int dni,String password);

}
