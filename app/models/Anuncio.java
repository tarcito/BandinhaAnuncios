package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Tarcito on 25/05/2015.
 */
@Entity
public class Anuncio {

    @Id
    @GeneratedValue
    private long id;

    private String titulo, descrição, cidade, bairro, objetivo;
    private List<String> instrumentos;
    private List<String> estilosQGosta;
    private List<String> estilosQNaoGosta;
    private List<String> formaDeContato;


    private Anuncio(){
    }

    public Anuncio(String titulo, String descricao, String cidade, String bairro, List<String> instrumentos, List<String> estilosQGosta, List<String> estilosQNaoGosta, String objetivo, List<String> formaDeContato){
        setTitulo(titulo);
        setDescrição(descricao);
        setCidade(cidade);
        setBairro(bairro);
        setEstilosQGosta(estilosQGosta);
        setEstilosQNaoGosta(estilosQNaoGosta);
        setObjetivo(objetivo);
        setFormaDeContato(formaDeContato);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public List<String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<String> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public List<String> getEstilosQGosta() {
        return estilosQGosta;
    }

    public void setEstilosQGosta(List<String> estilosQGosta) {
        this.estilosQGosta = estilosQGosta;
    }

    public List<String> getEstilosQNaoGosta() {
        return estilosQNaoGosta;
    }

    public void setEstilosQNaoGosta(List<String> estilosQNaoGosta) {
        this.estilosQNaoGosta = estilosQNaoGosta;
    }

    public List<String> getFormaDeContato() {
        return formaDeContato;
    }

    public void setFormaDeContato(List<String> formaDeContato) {
        this.formaDeContato = formaDeContato;
    }

}
