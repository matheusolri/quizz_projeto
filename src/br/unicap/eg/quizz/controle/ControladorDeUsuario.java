package br.unicap.eg.quizz.controle;

import br.unicap.eg.quizz.dados.*;
import br.unicap.eg.quizz.modelo.excecoes.*;
import br.unicap.eg.quizz.modelo.entidades.Usuario;
import java.util.List;

public class ControladorDeUsuario {
    private final IRepositorioUsuario repositorioUsuario;
    private final List<Usuario> usuarios;
    private Usuario usuarioAtual = null;

    public ControladorDeUsuario(IRepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
        this.usuarios = repositorioUsuario.carregarUsuarios();
    }

    public Usuario getUsarioAtual(){
        return usuarioAtual;
    }

    public int  getPontuacao(){
        return usuarioAtual.getPontuacao();
    }

    public void adicionarUsuario(Usuario usuario) throws UsuarioJaExiste {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(usuario.getEmail())) {
                throw new UsuarioJaExiste();
            }
        }
        usuarios.add(usuario);
        repositorioUsuario.salvarUsuarios(usuarios);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void sair() {
        usuarioAtual = null;
    }

    public void entrar(String email, String senha) throws FalhaDeAutenticacao {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                usuarioAtual = usuario;
                return;
            }
        }
        throw new FalhaDeAutenticacao();
    }
}
