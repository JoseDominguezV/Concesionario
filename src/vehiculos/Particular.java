package vehiculos;

import vehiculos.tipos.TipoMarca;

public class Particular extends Vehiculo{

    public Particular(TipoMarca tipoMarca, int modelo, String placa, String color, int precio) {
        super(tipoMarca, modelo, placa, color, precio);
    }
}
