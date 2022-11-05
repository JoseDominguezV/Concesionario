package personas;

import personas.tipos.TipoDocumento;

public class Persona {
    private String nombre;
    private int edad;
    private TipoDocumento tipoDocumento;
    private String documento;
    private String telefono;
    private String direccion;

    public Persona(String nombre, int edad, TipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
