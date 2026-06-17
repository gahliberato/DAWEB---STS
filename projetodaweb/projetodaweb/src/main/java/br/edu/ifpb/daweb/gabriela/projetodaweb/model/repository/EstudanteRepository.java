package br.edu.ifpb.daweb.gabriela.projetodaweb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.daweb.gabriela.projetodaweb.model.entity.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
