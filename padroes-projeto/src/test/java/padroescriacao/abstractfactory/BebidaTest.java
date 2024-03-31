package padroescriacao.abstractfactory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BebidaTest {

    @Test
    void cappuccinoDescricaoTest() {
        FabricaIngredientes fabrica = new FabricaCappuccino();
        Bebida bebida = new Cappuccino(fabrica);
        assertTrue(bebida.getDescription().contains("Café"));
        assertTrue(bebida.getDescription().contains("Leite"));
    }

    @Test
    void mochaDescricaoTest() {
        FabricaIngredientes fabrica = new FabricaMocha();
        Bebida bebida = new Mocha(fabrica);
        assertTrue(bebida.getDescription().contains("Café"));
        assertTrue(bebida.getDescription().contains("Chocolate"));
    }
}




