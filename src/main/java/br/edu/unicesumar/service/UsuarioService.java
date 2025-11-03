package br.edu.unicesumar.service;

import br.edu.unicesumar.dao.UsuarioDAO;  
import br.edu.unicesumar.utils.Utils;
import br.edu.unicesumar.model.Usuario;

public class UsuarioService {
    private UsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void saveUsuario(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            return;
        }
        if (usuario.getCpf() == null || usuario.getCpf().isEmpty()) {
            return;
        }
        if (!Utils.validateCpf(usuario.getCpf())) {
            return;
        }
        usuarioDAO.save(usuario);
    }
}

