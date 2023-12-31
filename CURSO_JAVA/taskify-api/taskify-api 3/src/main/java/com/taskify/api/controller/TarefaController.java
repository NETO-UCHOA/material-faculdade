package com.taskify.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskify.api.model.Tarefa;
import com.taskify.api.repository.TarefaRepository;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaController {

    @PostMapping
    public ResponseEntity<Tarefa> cadastrarTarefa(@RequestBody Tarefa tarefa) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(tarefaRepository.save(tarefa));
    }

    @GetMapping
    public ResponseEntity<Page<Tarefa>> listarTarefas(Pageable paginacao) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(tarefaRepository.findAll(paginacao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Tarefa>> buscarTarefa(@PathVariable("id") Long idTarefa) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(tarefaRepository.findById(idTarefa));
    }

    @GetMapping("/projeto/{idProjeto}")
    public ResponseEntity<Optional<List<Tarefa>>> buscarTarefasPorProjeto(@PathVariable("idProjeto") Long idProjeto) {
        return ResponseEntity.ok().body(tarefaRepository.findByProjeto(idProjeto));
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<Optional<List<Tarefa>>> buscarTarefasPorUsuario(@PathVariable("idUsuario") Long idUsuario) {
        return ResponseEntity.ok().body(tarefaRepository.findByUsuario(idUsuario));
    }

    @GetMapping("/usuario/{idUsuario}/projeto/{idProjeto}")
    public ResponseEntity<Optional<List<Tarefa>>> buscarTarefasPorUsuarioPorProjeto(@PathVariable("idUsuario") Long idUsuario) {
        return ResponseEntity.ok().body(tarefaRepository.findByUsuario(idUsuario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(
            @PathVariable("id") Long idTarefa,
            @RequestBody Tarefa tarefa) {
        Optional<Tarefa> tarefaExistente = tarefaRepository.findById(idTarefa);

        if (tarefaExistente.isPresent()) {
            tarefaExistente.get().setNome(tarefa.getNome());
            tarefaExistente.get().setDescricao(tarefa.getDescricao());

            return ResponseEntity.status(HttpStatus.OK)
                    .body(tarefaRepository.save(tarefaExistente.get()));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarTarefa(@PathVariable("id") Long idTarefa) {
        tarefaRepository.deleteById(idTarefa);

        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body("Projeto deletado com sucesso!");
    }

    @Autowired
    private TarefaRepository tarefaRepository;

}
