package br.edu.ifpb.daweb.gabriela.projetodaweb.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class  Disciplina{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private int cod;
		private String nome;
		private String prof;
		public Disciplina(int cod, String nome, String prof) {
			super();
			this.cod = cod;
			this.nome = nome;
			this.prof = prof;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}	
		
		public int getCod() {
			return cod; 
		}
		public void setCod(int cod) {
			this.cod = cod;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getProf() {
			return prof;
		}
		public void setProf(String prof) {
			this.prof = prof;
		}
		
		@Override
	    public String toString() {
	        return "Código: " + cod + " | Disciplina: " + nome;
	    }

	}


