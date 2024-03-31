package padroescriacao.abstractfactory;

public abstract class Bebida {
    protected Ingrediente principal;
    protected Ingrediente complementar;

    public Bebida(FabricaIngredientes fabrica) {
        this.principal = fabrica.criarIngredientePrincipal();
        this.complementar = fabrica.criarIngredienteComplementar();
    }

    public abstract String getDescription();
}
