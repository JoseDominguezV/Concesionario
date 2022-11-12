import personas.Empleados;
import personas.tipos.TipoDocumento;
import personas.tipos.TipoPermiso;
import vehiculos.Particular;
import vehiculos.Vehiculo;
import vehiculos.tipos.TipoMarca;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Empleados> empleados = new ArrayList<>();
    private static ArrayList<Vehiculo> vehiculo = new ArrayList<>();

    public static void main(String[] args) {
        generarEmpleados();
        menuPrincipal();
    }

    private static void generarEmpleados() {
        Empleados miEmpleadito1 = new Empleados("José", 22, TipoDocumento.CEDULA,
                "1220347852", "3055423632", "Cll 25#42-19");
        miEmpleadito1.setTipoPermiso(TipoPermiso.VENTA);

        Empleados miEmpleadito2 = new Empleados("Karen", 20, TipoDocumento.CEDULA_EXTRANjERIA,
                "1223654789", "3165233241", "Cll 0#13-19");
        miEmpleadito2.setTipoPermiso(TipoPermiso.COMPRA);

        Empleados miEmpleadito3 = new Empleados("Josh", 30, TipoDocumento.PASAPORTE,
                "3005698754", "3152147895", "Crr 55#82-99");
        miEmpleadito3.setTipoPermiso(TipoPermiso.COMPRA_Y_VENTA);

        empleados.add(miEmpleadito1);
        empleados.add(miEmpleadito2);
        empleados.add(miEmpleadito3);
    }

    private static void menuPrincipal() {
        System.out.println("********************************************");
        System.out.println("*************CONCESIONARIO UDEV*************");
        System.out.println("********************************************");

        String mensaje = "Elija una opción: \n"
                + "1. Venta de vehiculo \n"
                + "2. Ingreso de vehiculo \n"
                + "3. Salir";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        switch (opcion) {
            case 1:
                ventaVehiculo();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }

    private static void ventaVehiculo() {
        if (vehiculo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No hay vehiculos en lista",
                    "VEHICULOS NO DISPONIBLES", JOptionPane.ERROR_MESSAGE);
            menuPrincipal();
        } else {

        }
    }

    private static void ingresoVehiculo() {
        TipoMarca marca;
        int modelo;
        String placa;
        String color;
        int precio;

        if (preguntaTipoVehiculo()) {
            //Particular particular = new Particular();
        } else {

        }
    }

    private static boolean preguntaTipoVehiculo() {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Qué tipo de vehiculo desea? \n"
                        + "1. Particular \n"
                        + "2. Publico"
        ));
        return tipo == 1;
    }

    private static TipoMarca elegirMarcaVehiculo() {
        TipoMarca miMarquita = null;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar marca: \n"
                + "1. KIA \n"
                + "2. CHEVROLET \n"
                + "3. RENAULT \n"
                + "4. TOYOTA \n"
                + "5. NISSAN"
        ));
        switch (opcion) {
            case 1:
                miMarquita = TipoMarca.KIA;
                break;
            case 2:
                miMarquita = TipoMarca.CHEVROLET;
                break;
            case 3:
                miMarquita = TipoMarca.RENAULT;
                break;
            case 4:
                miMarquita = TipoMarca.TOYOTA;
                break;
            case 5:
                miMarquita = TipoMarca.NISSAN;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida",
                        "Error", JOptionPane.ERROR_MESSAGE);
                elegirMarcaVehiculo();
        }
        return miMarquita;
    }
}
