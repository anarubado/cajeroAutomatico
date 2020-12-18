package interfaces.Impementaciones;

import interfaces.IOperaciones;
import modelos.Cuenta;
import modelos.Usuario;

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

    @Override
    public String extraccionUsuario(List<Usuario> usuario, int dni, String password) {
        String mensaje=null;
        for (Usuario usuarioExtraccion:usuario) {
            if (usuarioExtraccion.getPassword().equals(password)&& usuarioExtraccion.getDni()==dni) {

                mensaje = "RETIRE SU DINERO";

                } else {
                    mensaje = "RETIRO DENEGADO. INTENTE NUEVAMENTE";
                }
            }

        return mensaje;
    }
}
