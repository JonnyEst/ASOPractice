package business.dto;

import java.util.Date;

public class DatosCuenta {

    private String usuario;
    private Integer numeroCuenta;
    private Date fechaCreacion;

    public DatosCuenta() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "DatosCuenta{" +
                "usuario='" + usuario + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
