package Padrao.Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    void deveContarProdutosDisponiveis() {

        Produto p1 = new Produto("Notebook", true);
        Produto p2 = new Produto("Mouse", false);
        Produto p3 = new Produto("Teclado", true);

        Estoque estoque = new Estoque(p1, p2, p3);

        assertEquals(
                2,
                RelatorioEstoque.contarProdutosDisponiveis(estoque)
        );
    }

    @Test
    void deveContarTotalProdutos() {

        Produto p1 = new Produto("Notebook", true);
        Produto p2 = new Produto("Mouse", false);
        Produto p3 = new Produto("Teclado", true);

        Estoque estoque = new Estoque(p1, p2, p3);

        assertEquals(
                3,
                RelatorioEstoque.contarTotalProdutos(estoque)
        );
    }
}
