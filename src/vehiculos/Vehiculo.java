package vehiculos;

import vehiculos.tipos.TipoMarca;

public class Vehiculo {
    private TipoMarca tipoMarca;
    private int modelo;
    private String placa;
    private String color;
    private int precio;

    public Vehiculo(TipoMarca tipoMarca, int modelo, String placa, String color, int precio) {
        this.tipoMarca = tipoMarca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.precio = precio;
    }
}
