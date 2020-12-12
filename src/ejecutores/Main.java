package ejecutores;

import interfaces.IPoblarCuentas;
import interfaces.Impementaciones.IPoblarCuentasImpl;

public class Main {
    public static void main(String[] args) {
        IPoblarCuentas poblarcuentas = new IPoblarCuentasImpl();

       System.out.println(poblarcuentas.poblarUsuarios());
    }
}
