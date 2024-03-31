package padroescriacao.abstractfactory;

public class FabricaMocha implements FabricaIngredientes {
    @Override
    public Ingrediente criarIngredientePrincipal() {
        return new Cafe();
    }

    @Override
    public Ingrediente criarIngredienteComplementar() {
        return new Chocolate();
    }
}
