package Padrao.Iterator;

import java.util.Iterator;

public class RelatorioEstoque {

    public static Integer contarProdutosDisponiveis(Estoque estoque) {

        int quantidade = 0;

        for (Produto produto : estoque) {

            if (produto.isDisponivel()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalProdutos(Estoque estoque) {

        int quantidade = 0;

        for (Iterator p = estoque.iterator(); p.hasNext(); ) {

            quantidade++;

            p.next();
        }

        return quantidade;
    }
}