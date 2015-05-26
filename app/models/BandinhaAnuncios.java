package models;

import models.repository.AnuncioRepository;
import play.db.jpa.Transactional;

import java.util.List;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class BandinhaAnuncios {

    private AnuncioRepository repositorioAnuncios = AnuncioRepository.getInstance();

   public BandinhaAnuncios(){

   }

    @Transactional
    public void adicionaAnuncio(String titulo, String descricao, String cidade, String bairro, List<String> instrumentos, List<String> estilosQGosta, List<String> estilosQNaoGosta, String objetivo, List<String> formaDeContato) throws Exception {
        Anuncio novoAnuncio = new Anuncio(titulo, descricao, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);

    }
}
