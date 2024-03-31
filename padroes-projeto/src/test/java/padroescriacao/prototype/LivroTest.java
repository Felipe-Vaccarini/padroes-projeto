package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Livro livro = new Livro(1, "Dom Quixote", "Miguel de Cervantes", "Ficção", 1605);

        Livro livroClone = livro.clone();
        livroClone.setId(2);
        livroClone.setTitulo("O Senhor dos Anéis");
        livroClone.setAnoPublicacao(1954);

        assertEquals("Livro{id=1, titulo='Dom Quixote', autor='Miguel de Cervantes', genero='Ficção', anoPublicacao=1605}", livro.toString());
        assertEquals("Livro{id=2, titulo='O Senhor dos Anéis', autor='Miguel de Cervantes', genero='Ficção', anoPublicacao=1954}", livroClone.toString());
    }
}
