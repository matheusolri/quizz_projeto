package br.unicap.eg.quizz.dados;

import br.unicap.eg.quizz.modelo.entidades.Usuario;

import java.util.List;

public interface IRepositorioUsuario {
    List<Usuario> carregarUsuarios();

    void salvarUsuarios(List<Usuario> usuarios);
}