package padroescriacao.abstractfactory;

public class Cappuccino extends Bebida {

    public Cappuccino(FabricaIngredientes fabrica) {
        super(fabrica);
    }

    @Override
    public String getDescription() {
        return "Cappuccino: " + principal.getNome() + " com " + complementar.getNome();
    }
}
