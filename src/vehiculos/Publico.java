package vehiculos;

import vehiculos.tipos.TipoMarca;
import vehiculos.tipos.TipoPublico;

public class Publico extends Vehiculo {
    private int numeroPlanilla;
    private TipoPublico tipoPublico;

    public Publico(TipoMarca tipoMarca, int modelo, String placa, String color, int precio) {
        super(tipoMarca, modelo, placa, color, precio);
    }

    public int getNumeroPlanilla() {
        return numeroPlanilla;
    }

    public void setNumeroPlanilla(int numeroPlanilla) {
        this.numeroPlanilla = numeroPlanilla;
    }

    public TipoPublico getTipoPublico() {
        return tipoPublico;
    }

    public void setTipoPublico(TipoPublico tipoPublico) {
        this.tipoPublico = tipoPublico;
    }
}
