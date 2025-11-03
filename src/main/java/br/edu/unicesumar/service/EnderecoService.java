package br.edu.unicesumar.service;
import br.edu.unicesumar.dao.EnderecoDAO;
import br.edu.unicesumar.model.Endereco;

public class EnderecoService {

    private EnderecoDAO enderecoDAO;

    public EnderecoService(){
        enderecoDAO = new EnderecoDAO();
    }

    public void saveEndereco(Endereco endereco){
        
    }
    
}