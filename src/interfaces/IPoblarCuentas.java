package interfaces;

import modelos.Usuario;
import modelos.Cuenta;

import java.util.List;

public interface IPoblarCuentas {

    List<Usuario> poblarUsuarios();

    List<Cuenta> poblarCuentas();
}
