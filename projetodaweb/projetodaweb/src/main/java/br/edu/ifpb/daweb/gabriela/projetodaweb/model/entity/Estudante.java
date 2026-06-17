package br.edu.ifpb.daweb.gabriela.projetodaweb.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class  Estudante{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String nome;
		private String mat;
		public Estudante(String nome, String mat) {
			super();
			this.nome = nome;
			this.mat = mat;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}	

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMat() {
			return mat;
		}
		public void setMat(String mat) {
			this.mat = mat;
		}
		@Override
		public String toString() {
			return "Aluno: Nome:" + nome + ", Matrícula:" + mat;
		}

	}

