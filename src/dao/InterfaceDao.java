package dao;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;

public interface InterfaceDao {

    DatosSalida datosOut(DatosEntrada datosEntrada);
}
