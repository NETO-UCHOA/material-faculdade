package com.taskify.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.taskify.api.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    @Query("SELECT t FROM tb_tarefas t WHERE t.projeto.idProjeto = :id")
    Optional<List<Tarefa>> findByProjeto(@Param("id") Long idProjeto);

    @Query("SELECT t FROM tb_tarefas t WHERE t.projeto.idProjeto = :id")
    Optional<Page<Tarefa>> findByProjeto(Pageable paginacao, @Param("id") Long idProjeto);

    @Query("SELECT t FROM tb_tarefas t WHERE t.usuario.idUsuario = :id")
    Optional<List<Tarefa>> findByUsuario(@Param("id") Long idUsuario);

    @Query("SELECT t FROM tb_tarefas t WHERE t.usuario.idUsuario = :id")
    Optional<Page<Tarefa>> findByUsuario(Pageable paginacao, @Param("id") Long idUsuario);

    @Query("SELECT t FROM tb_tarefas t WHERE t.projeto.idProjeto = :idProjeto AND  t.usuario.idUsuario = :idUsuario ")
    Optional<List<Tarefa>> findByProjetoAndUsuario(@Param("idProjeto") Long idProjeto,
            @Param("idUsuario") Long idUsuario);

}
