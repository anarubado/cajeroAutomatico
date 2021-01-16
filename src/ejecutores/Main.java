package ejecutores;

import interfaces.IBuscarCuentas;
import interfaces.IOperaciones;
import interfaces.IPoblarCuentas;
import interfaces.Impementaciones.IBuscarCuentasImpl;
import interfaces.Impementaciones.IOperacionesImpl;
import interfaces.Impementaciones.IPoblarCuentasImpl;
import modelos.Cuenta;
import modelos.enums.TipoCuenta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblarCuentas poblarcuentas = new IPoblarCuentasImpl();
        IBuscarCuentas buscarCuentas = new IBuscarCuentasImpl();
        IOperaciones extraccionCuenta = new IOperacionesImpl();

    List<Cuenta> cuentas = poblarcuentas.poblarCuentas();

    System.out.println("TOTALIDAD DE LAS CUENTAS: ");
    System.out.println(poblarcuentas.poblarUsuarios());

    System.out.println("BUSQUEDA ALIAS RAVILA:");
    System.out.println(buscarCuentas.buscarCuentaPorAlias (cuentas, "ravila"));

    System.out.println("CUENTA 1 ACTUAL: ");
    System.out.println(buscarCuentas.buscarcuentapornumcuenta(cuentas,1 ));

    System.out.println("EXTRACCIÓN DE CUENTA 1: ");
    System.out.println(extraccionCuenta.extraccionDeCuenta(cuentas, 1, 500));

    System.out.println("BÚSQUEDA POR TIPO DE CUENTA: CORRIENTE ");
    System.out.println(buscarCuentas.buscarcuentaportipodecuenta(cuentas, TipoCuenta.CORRIENTE));

    }

}
