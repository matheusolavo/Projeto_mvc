package br.edu.unicesumar.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import br.edu.unicesumar.model.Usuario;
import br.edu.unicesumar.service.UsuarioService;

public class UsuarioController {
    @FXML
    private Label label;

    private UsuarioService usuarioService = new UsuarioService();

    @FXML
    public void saveUsuario() {
        Usuario u = new Usuario();
        u.setNome("João");
        u.setCpf("12312312312");

        usuarioService.saveUsuario(u);
        label.setText("Usuário salvo: " + u.getNome());
    }
}
