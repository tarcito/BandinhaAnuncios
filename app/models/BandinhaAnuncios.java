package models;

import models.repository.AnuncioRepository;
import play.db.jpa.Transactional;

import java.util.*;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class BandinhaAnuncios {

    private AnuncioRepository repositorioAnuncios = AnuncioRepository.getInstance();

   public BandinhaAnuncios(){

   }

    @Transactional
    public void adicionaAnuncio(String titulo, String descricao, String cidade, String bairro, List<String> instrumentos, List<String> estilosQGosta, List<String> estilosQNaoGosta, boolean objetivo, List<String> formaDeContato) throws Exception {
        Anuncio novoAnuncio = new Anuncio(titulo, descricao, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);
        repositorioAnuncios.persist(novoAnuncio);
        repositorioAnuncios.flush();
    }

    @Transactional
    public List<Anuncio> getAnuncios(){
        return repositorioAnuncios.findAll();
    }

    @Transactional
    public List<String> getAnunciosToString(){
        List<String> listaResposta = new ArrayList<String>();
        List<Anuncio> listaDosAnuncios = getAnuncios();
        Collections.sort(listaDosAnuncios);
        for (Anuncio  anuncio: listaDosAnuncios){
            listaResposta.add(anuncio.toString());
        }
        return  listaResposta;
    }

    @Transactional
    public long getNumerodeAnuncios(){
        return repositorioAnuncios.countAll();
    }
}
