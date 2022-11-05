package personas.tipos;

public enum TipoDocumento {
    CEDULA("Cedula", "CC."),
    TARJETA_IDENTIDAD("Tarjeta Identidad", "TI."),
    CEDULA_EXTRANjERIA("Cedula Extranjeria", "CE."),
    PASAPORTE("Pasaporte", "PS.");

    public String nombreLargo;
    public String nombreCorto;

    TipoDocumento(String nombreLargo, String nombreCorto) {
        this.nombreLargo = nombreLargo;
        this.nombreCorto = nombreCorto;
    }
}
