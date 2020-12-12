package interfaces.Impementaciones;

import interfaces.IPoblarCuentas;
import modelos.Usuario;
import modelos.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class IPoblarCuentasImpl implements IPoblarCuentas {

    @Override
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Cuenta cuenta1 = new Cuenta("cta cte", 10000, 1, "bcappad");
        Usuario usuario1 = new Usuario("Brenda", "Cappadoro", 34141681, "bcappadoro@gmail.com", "1234",cuenta1);

        usuarios.add(usuario1);
        return usuarios;
    }

    @Override
    public List<Cuenta> poblarCuentas() {
        return null;
    }

}
