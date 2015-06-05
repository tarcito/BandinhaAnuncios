import static org.fest.assertions.Assertions.*;

import models.BandinhaAnuncios;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class BandinhaAnunciosTest {

    BandinhaAnuncios classificado;

    @Before
    public void setUp() throws Exception {
        classificado = new BandinhaAnuncios();
    }


    @Test
    public void deveAdicionarAnuncios() throws Exception {
        String titulo, descricao, cidade, bairro;
        titulo = "banda de jazz"; descricao= "quero encontrar músicos para formar uma banda de jazz";
        cidade = "joão pessoa"; bairro = "manaira";
        boolean  objetivo = true;

        List<String> instrumentos = new ArrayList<String>();
        List<String> estilosQGosta = new ArrayList<String>();
        List<String> estilosQNaoGosta = new ArrayList<String>();
        List<String> formaDeContato = new ArrayList<String>();

        instrumentos.add("flauta");instrumentos.add("trombone");instrumentos.add("trompete");
        estilosQGosta.add("jazz"); instrumentos.add("rock");instrumentos.add("pop");
        estilosQNaoGosta.add("funk"); estilosQNaoGosta.add("rap"); estilosQNaoGosta.add("tecnoMelody");
        formaDeContato.add("franciscopinto@gmail.com");formaDeContato.add("facebook.com/francisco23");
        classificado.adicionaAnuncio(titulo, descricao, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);

        String anunciosEmStringUnica = classificado.getAnunciosToListOfString().toString();

        assertThat(anunciosEmStringUnica).contains(titulo);
        assertThat(anunciosEmStringUnica).contains(descricao);
        assertThat(anunciosEmStringUnica).contains(cidade);
        assertThat(anunciosEmStringUnica).contains(bairro);
        assertThat(anunciosEmStringUnica).contains(instrumentos.toString());
        assertThat(anunciosEmStringUnica).contains(estilosQGosta.toString());
        assertThat(anunciosEmStringUnica).contains(estilosQNaoGosta.toString());;
        assertThat(anunciosEmStringUnica).contains(formaDeContato.toString());
        assertThat(anunciosEmStringUnica).contains("Formar Uma Banda");
    }


    @After
    public void tearDown() throws Exception {
    }

}
