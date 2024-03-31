package padroescriacao.abstractfactory;

public class FabricaCappuccino implements FabricaIngredientes {
    @Override
    public Ingrediente criarIngredientePrincipal() {
        return new Cafe();
    }

    @Override
    public Ingrediente criarIngredienteComplementar() {
        return new Leite();
    }
}