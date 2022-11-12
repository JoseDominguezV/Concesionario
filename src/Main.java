import personas.Empleados;
import personas.tipos.TipoDocumento;
import personas.tipos.TipoPermiso;
import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Empleados> empleados = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculo = new ArrayList<>();

    public static void main(String[] args) {
        generarEmpleados();
        menuPrincipal();
    }

    private static void generarEmpleados(){
        Empleados miEmpleadito1 = new Empleados("José",22, TipoDocumento.CEDULA,
                "1220347852","3055423632","Cll 25#42-19");
        miEmpleadito1.setTipoPermiso(TipoPermiso.VENTA);

        Empleados miEmpleadito2 = new Empleados("Karen",20, TipoDocumento.CEDULA_EXTRANjERIA,
                "1223654789","3165233241","Cll 0#13-19");
        miEmpleadito2.setTipoPermiso(TipoPermiso.COMPRA);

        Empleados miEmpleadito3 = new Empleados("Josh",30, TipoDocumento.PASAPORTE,
                "3005698754","3152147895","Crr 55#82-99");
        miEmpleadito3.setTipoPermiso(TipoPermiso.COMPRA_Y_VENTA);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito3);
    }

    private static void menuPrincipal(){
        System.out.println("********************************************");
        System.out.println("*************CONCESIONARIO UDEV*************");
        System.out.println("********************************************");

        String mensaje = "Elija una opción: \n"
                + "1. Venta de vehiculo \n"
                + "2. Ingreso de vehiculo \n"
                + "3. Salir";
    }
}
