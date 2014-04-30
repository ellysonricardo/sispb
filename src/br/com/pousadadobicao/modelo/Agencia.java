package br.com.pousadadobicao.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agencia  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAgencia;
    private String nome;
    private String telefone;
    private String email;
}
	