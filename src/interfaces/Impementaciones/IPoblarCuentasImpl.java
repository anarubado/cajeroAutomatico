package interfaces.Impementaciones;

import interfaces.IPoblarCuentas;
import modelos.Usuario;
import modelos.Cuenta;
import modelos.enums.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

public class IPoblarCuentasImpl implements IPoblarCuentas {

    @Override
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        List<Cuenta> cuentas = poblarCuentas();

        Usuario usuario1 = new Usuario("Brenda", "Cappadoro", 34141681, "bcappadoro@gmail.com", "1234",cuentas.get(0));
        Usuario usuario2 = new Usuario("Any", "Ruado", 34141700, "aruado@gmail.com", "2345",cuentas.get(1));
        Usuario usuario3 = new Usuario("Roma", "Avila", 34141800, "ravila@gmail.com", "3456",cuentas.get(2));
        Usuario usuario4 = new Usuario("Clau", "Simonelly", 34141900, "csimonelly@gmail.com", "4567",cuentas.get(3));

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }

    @Override
    public List<Cuenta> poblarCuentas() {
        List<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuenta1 = new Cuenta(TipoCuenta.CORRIENTE, 10000, 1, "bcappad");
        Cuenta cuenta2 = new Cuenta(TipoCuenta.AHORROS, 8000, 11, "aruado");
        Cuenta cuenta3 = new Cuenta(TipoCuenta.AHORROS, 12000, 111, "ravila");
        Cuenta cuenta4 = new Cuenta(TipoCuenta.CORRIENTE, 10000, 1111, "csimonelly");

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);

        return cuentas;
    }

}
