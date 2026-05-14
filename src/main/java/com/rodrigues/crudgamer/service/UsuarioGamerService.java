package com.rodrigues.crudgamer.service;

import com.rodrigues.crudgamer.model.UsuarioGamer;
import com.rodrigues.crudgamer.repository.UsuarioGamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor

public class UsuarioGamerService {

    private final UsuarioGamerRepository repository;

    public UsuarioGamer salvar(UsuarioGamer usuario) {
        return repository.save(usuario);
    }

    public List<UsuarioGamer> listar() {
        return repository.findAll();
    }

    public UsuarioGamer buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado(a)"));
    }

    public UsuarioGamer atualizar(Long id, UsuarioGamer usuario) {
        UsuarioGamer usuariogamer = buscarPorId(id);

        usuariogamer.setNickname(usuario.getNickname());
        usuariogamer.setEmail(usuario.getEmail());
        usuariogamer.setJogoFavorito(usuario.getJogoFavorito());
        usuariogamer.setNivel(usuario.getNivel());

        return repository.save(usuario);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}