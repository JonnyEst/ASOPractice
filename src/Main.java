import facade.dto.DatosEntradaFacade;
import facade.dto.DatosSalidaFacade;
import facade.impl.ImplementacionFacade;

public class Main {

    public static void main(String[] args) {

        ImplementacionFacade implementacionFacade = new ImplementacionFacade();
        DatosSalidaFacade datosSalida = implementacionFacade.datosSalida(mapeoEntradaMain());
        System.out.println(datosSalida);

    }

    public static DatosEntradaFacade mapeoEntradaMain(){
        DatosEntradaFacade datosEntrada= new DatosEntradaFacade();
        datosEntrada.setUsuario("Cristian22");
        datosEntrada.setContraseña("0000");

        return datosEntrada;
    }
}
