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

    public TipoMarca getTipoMarca() {
        return tipoMarca;
    }

    public void setTipoMarca(TipoMarca tipoMarca) {
        this.tipoMarca = tipoMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
