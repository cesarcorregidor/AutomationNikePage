package es.com.nike.StepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import es.com.nike.Steps.PaginaPrincipalStep;
import es.com.nike.Steps.PaginaProductoStep;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ProductoStepDefinition {
    @Steps
    PaginaProductoStep paginaProducto;

    @Steps
    PaginaPrincipalStep paginaPrincipal;

    @Cuando("^El seleccione las Nike Air Force$")
    public void elSeleccioneLasNikeAirForce() {
        paginaPrincipal.seleccionarProducto();

    }
    @Entonces("^El visualizara la descripci├│n del producto$")
    public void elVisualizaraLaDescripci├│nDelProducto() throws IOException {
        paginaProducto.validarProducto();

    }
}
