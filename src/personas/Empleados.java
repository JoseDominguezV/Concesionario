package personas;

import personas.tipos.TipoDocumento;
import personas.tipos.TipoPermiso;

public class Empleados extends Persona{
    private TipoPermiso tipoPermiso;
    public Empleados(String nombre, int edad, TipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }

    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
}
