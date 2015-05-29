import static org.fest.assertions.Assertions.*;

import models.BandinhaAnuncios;
import org.junit.*;
import static play.test.Helpers.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class BandinhaAnunciosTest {

    BandinhaAnuncios clasificado;

    @Before
    public void setUp() throws Exception {
        clasificado = new BandinhaAnuncios();
    }


    @Test
    public void deveAdicionarAnuncios() throws Exception {
        String titulo, descri��o, cidade, bairro;
        titulo = "banda de jazz"; descri��o= "quero encontrar m�sicos para formar uma banda de jazz";
        cidade = "jo�o pessoa"; bairro = "manaira";
        boolean  objetivo = true;

        List<String> instrumentos = new ArrayList<String>();
        List<String> estilosQGosta = new ArrayList<String>();
        List<String> estilosQNaoGosta = new ArrayList<String>();
        List<String> formaDeContato = new ArrayList<String>();

        instrumentos.add("flauta");instrumentos.add("trombone");instrumentos.add("trompete");
        estilosQGosta.add("jazz"); instrumentos.add("rock");instrumentos.add("pop");
        estilosQNaoGosta.add("funk"); estilosQNaoGosta.add("rap"); estilosQNaoGosta.add("tecnoMelody");
        formaDeContato.add("franciscopinto@gmail.com");formaDeContato.add("facebook.com/francisco23");
        clasificado.adicionaAnuncio(titulo, descri��o, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);

        assertThat(classificado.getAnuncios().contains("titulo"));

    }


    @After
    public void tearDown() throws Exception {
    }

}
