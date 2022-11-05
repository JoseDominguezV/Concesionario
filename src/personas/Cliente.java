package personas;

import personas.tipos.TipoCliente;
import personas.tipos.TipoDocumento;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;
    public Cliente(String nombre, int edad, TipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
