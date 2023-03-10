package es.com.nike.StepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import es.com.nike.PageObjects.PaginaPrincipalPageObjects;
import es.com.nike.Steps.PaginaPrincipalStep;
import es.com.nike.Steps.PaginaProductoStep;
import net.thucydides.core.annotations.Steps;

public class CarStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipal;
    @Steps
    PaginaProductoStep paginaProducto;



    @Cuando("^El seleccione las Nike Air Force de talla EUCuarenta$")
    public void elSeleccioneLasNikeAirForceDeTallaEUCuarenta() {
        paginaPrincipal.seleccionarProducto();
        paginaProducto.seleccionTalla();
    }

    @Cuando("^El agregue a la cesta$")
    public void elAgregueALaCesta()  {
        paginaProducto.anadirCesta();
    }

    @Cuando("^El se dirija a productos de la cesta$")
    public void elSeDirijaAProductosDeLaCesta() {
        paginaProducto.irArribaPagina();
        paginaProducto.irCesta();

    }
    @Entonces("^El visualizara la descripci├│n del producto y el precio$")
    public void elVisualizaraLaDescripci├│nDelProductoYElPrecio() {
        /*No fue posible realizar la validaci├│n ya que el navegador cuando se abre automatizado no permite
        agregar algun producto*/
    }

}
