package padroescriacao.abstractfactory;

public interface FabricaIngredientes {
    Ingrediente criarIngredientePrincipal();
    Ingrediente criarIngredienteComplementar();
}