package br.unicap.eg.quizz.dados;

import br.unicap.eg.quizz.modelo.entidades.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario implements IRepositorioUsuario {

    public static final String NOME_DO_ARQUIVO = "save";

    private static RepositorioUsuario instance;

    private RepositorioUsuario() {
    }

    public static RepositorioUsuario getInstance() {
        if (instance == null) {
            instance = new RepositorioUsuario();
        }
        return instance;
    }

    @Override
    public List<Usuario> carregarUsuarios() {
        File arquivo = new File(NOME_DO_ARQUIVO);
        if (arquivo.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(NOME_DO_ARQUIVO);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (List<Usuario>) objectInputStream.readObject();
            } catch (Exception ignored) {
            }
        }

        return new ArrayList<>();
    }

    @Override
    public void salvarUsuarios(List<Usuario> usuarios) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(NOME_DO_ARQUIVO);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(usuarios);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception ignored) {
        }
    }
}
