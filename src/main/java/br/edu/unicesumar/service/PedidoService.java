package br.edu.unicesumar.service;
import br.edu.unicesumar.dao.PedidoDAO;
import br.edu.unicesumar.model.Pedido;

public class PedidoService {

    private PedidoDAO pedidoDAO;

    public PedidoService(){
        pedidoDAO = new PedidoDAO();
    }

    public void savePedido(Pedido pedido){
       
    }
    
}