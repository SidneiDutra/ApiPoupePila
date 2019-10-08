package Model;



import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.json.JSONObject;


@Entity
@Table(name="LISTA")
public class Lista {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	//Chave primaria 
	private Integer id;	
	
	// Lista de produto
    @Column(columnDefinition = "TEXT")
    @Convert(converter= JSONObject.class)
    private JSONObject jsonLista;

    //Relacionamento Tabela Cliente
    @ManyToOne
    @JoinColumn(name ="cliente_id", referencedColumnName="id")
    private Cliente cliente;
    
    
    //Getter e Setter da Classe 
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public JSONObject getJsonLista() {
		return jsonLista;
	}

	public void setJsonLista(JSONObject jsonLista) {
		this.jsonLista = jsonLista;
	}
	
	
    
    
    
    
	
}

