package br.edu.unicesumar.service;

import br.edu.unicesumar.dao.ProdutoDAO;
import br.edu.unicesumar.model.Produto;

public class ProdutoService {

    private ProdutoDAO produtoDAO;

    public ProdutoService() {
        produtoDAO = new ProdutoDAO();
    }

    public void saveProduto(Produto produto) {
      
    }
}
