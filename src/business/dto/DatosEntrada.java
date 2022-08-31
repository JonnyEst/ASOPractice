package business.dto;

public class DatosEntrada {

    private DatosUsuario datosUsuario;

    public DatosEntrada() {
    }

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    @Override
    public String toString() {
        return "DatosEntrada{" +
                "datosUsuario=" + datosUsuario +
                '}';
    }
}
