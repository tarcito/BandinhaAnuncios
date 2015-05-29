package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Tarcito on 25/05/2015.
 */
@Entity
public class Anuncio implements Comparable<Anuncio> {

    @Id
    @GeneratedValue
    private long id;

    private String titulo, descricao, cidade, bairro;
    boolean objetivo = false; //true: procura uma banda;  false: tocar ocasionalmente
    private List<String> instrumentos;
    private List<String> estilosQGosta;
    private List<String> estilosQNaoGosta;
    private List<String> formaDeContato;


    public Anuncio(){
    }

    public Anuncio(String titulo, String descricao, String cidade, String bairro, List<String> instrumentos, List<String> estilosQGosta, List<String> estilosQNaoGosta,boolean objetivo, List<String> formaDeContato) throws Exception {
        setTitulo(titulo);
        setDescricao(descricao);
        setCidade(cidade);
        setBairro(bairro);
        setEstilosQGosta(estilosQGosta);
        setEstilosQNaoGosta(estilosQNaoGosta);
        setObjetivo(objetivo);
        setFormaDeContato(formaDeContato);
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if(titulo==null){
            throw new Exception("Titulo nulo!");
        }
      if (titulo.isEmpty()){
          throw new Exception("Titulo vazio!");
      }

        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        if(descricao == null){
            throw new Exception("Descricao nula!");
        }
        if (descricao.isEmpty()){
            throw new Exception("Descricao vazia!");
        }
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade)throws Exception{
        if(cidade == null){
            throw new Exception("Cidade nula!");
        }
        if (cidade.isEmpty()){
            throw new Exception("Cidade vazia!");
        }
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)throws Exception {
        if(bairro == null){
            throw new Exception("Bairro nulo!");
        }
        if (bairro.isEmpty()){
            throw new Exception("Bairro vazio!");
        }
        this.bairro = bairro;
    }

    public String getObjetivo() {
        if(objetivo){
            return "Formar Uma Banda";
        }
        return "Tocar Ocasionalmente";
    }

    public void setObjetivo(boolean objetivo){
        this.objetivo = objetivo;
    }

    public List<String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<String> instrumentos) throws Exception {
        if(instrumentos == null){
            throw new Exception("Lista dos instrumentos nula!");
        }
        if(instrumentos.isEmpty()){
            throw new Exception("Lista dos instrumentos vazia!");
        }
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

    public void setFormaDeContato(List<String> formaDeContato) throws Exception {
        if(formaDeContato.isEmpty()){
            throw new Exception("Lista das formas de contato vazia!");
        }

        this.formaDeContato = formaDeContato;
    }

    @Override
    public int compareTo(Anuncio outroAnuncio) {
    //Todo compareTo para segunda estoria de usuario
        return 0;
    }
}
