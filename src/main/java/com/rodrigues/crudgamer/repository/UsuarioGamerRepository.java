package com.rodrigues.crudgamer.repository;

import com.rodrigues.crudgamer.model.UsuarioGamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioGamerRepository extends JpaRepository<UsuarioGamer, Long> {
}