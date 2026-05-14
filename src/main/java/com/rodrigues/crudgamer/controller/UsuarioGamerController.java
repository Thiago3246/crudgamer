package com.rodrigues.crudgamer.controller;

import com.rodrigues.crudgamer.model.UsuarioGamer;
import com.rodrigues.crudgamer.service.UsuarioGamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor

public class UsuarioGamerController {

    private final UsuarioGamerService service;

    @PostMapping
    public UsuarioGamer salvar(@RequestBody UsuarioGamer usuario) {
        return service.salvar(usuario);
    }

    @GetMapping
    public List<UsuarioGamer> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public UsuarioGamer buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public UsuarioGamer atualizar(@PathVariable Long id, @RequestBody UsuarioGamer usuario) {
        return service.atualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}