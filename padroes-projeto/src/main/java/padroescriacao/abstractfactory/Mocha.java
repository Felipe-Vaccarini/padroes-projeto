package padroescriacao.abstractfactory;
public class Mocha extends Bebida {

    public Mocha(FabricaIngredientes fabrica) {
        super(fabrica);
    }

    @Override
    public String getDescription() {
        return "Mocha: " + principal.getNome() + " com " + complementar.getNome();
    }
}
