/**
 * Created by Tarcito on 24/05/2015.
 */

import static org.fest.assertions.Assertions.*;

import models.Anuncio;
import org.junit.*;


import java.util.ArrayList;
import java.util.List;



public class AnuncioTest {

    Anuncio anuncio;

    String titulo, descrição, cidade, bairro;
    boolean objetivo;
    List<String> instrumentos = new ArrayList<String>();
    List<String> estilosQGosta = new ArrayList<String>();
    List<String> estilosQNaoGosta = new ArrayList<String>();
    List<String> formaDeContato = new ArrayList<String>();

    @Before
    public void setUp() throws Exception {

        anuncio = new Anuncio();
    }
    @Test

    public void devePermitirCriarAnuncio() throws Exception{

        titulo = "banda de jazz"; descrição= "quero encontrar companheiros músicos para formar uma banda de rock";
        cidade = "joão pessoa"; bairro = "manaira"; objetivo = true;
        instrumentos.add("guitarra");instrumentos.add("violão");instrumentos.add("baixo");
        estilosQGosta.add("jazz"); instrumentos.add("rock");instrumentos.add("pop");
        estilosQNaoGosta.add("funk"); estilosQNaoGosta.add("rap"); estilosQNaoGosta.add("tecnoMelody");
        formaDeContato.add("franciscopinto@gmail.com");formaDeContato.add("facebook.com/francisco23");
        try {
            anuncio.setTitulo(titulo);
            anuncio.setDescrição(descrição);
            anuncio.setBairro(bairro);
            anuncio.setCidade(cidade);
            anuncio.setInstrumentos(instrumentos);
            anuncio.setEstilosQGosta(estilosQGosta);
            anuncio.setEstilosQNaoGosta(estilosQNaoGosta);
            anuncio.setObjetivo(objetivo);
            anuncio.setFormaDeContato(formaDeContato);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        assertThat(anuncio.getTitulo()).isEqualTo(titulo);
        assertThat(anuncio.getDescrição()).isEqualTo(descrição);
        assertThat(anuncio.getCidade()).isEqualTo(cidade);
        assertThat(anuncio.getBairro()).isEqualTo(bairro);
        assertThat(anuncio.getInstrumentos()).isEqualTo(instrumentos);
        assertThat(anuncio.getEstilosQGosta()).isEqualTo(estilosQGosta);
        assertThat(anuncio.getEstilosQNaoGosta()).isEqualTo(estilosQNaoGosta);
        assertThat(anuncio.getFormaDeContato()).isEqualTo(formaDeContato);
        assertThat(anuncio.getObjetivo()).isEqualTo("Formar Uma Banda");
    }

    @Test
    public void deveRetornarObjetivoCorreto(){
        anuncio.setObjetivo(true);
        assertThat(anuncio.getObjetivo()).isEqualTo("Formar Uma Banda");;
        anuncio.setObjetivo(false);
        assertThat(anuncio.getObjetivo()).isEqualTo("Tocar Ocasionalmente");;
    }

    @Test
    public void naoDevePemitirTituloVazioOuNulo()throws Exception {
        try {
            anuncio.setTitulo("");
        } catch (Exception e) {
            Assert.assertEquals("Titulo vazio!", e.getMessage());
        }

        try {
            anuncio.setTitulo(null);
        } catch (Exception e) {
            Assert.assertEquals("Titulo nulo!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirDescricaoVaziaOuNula(){
        try {
            anuncio.setDescrição("");
        } catch (Exception e) {
            Assert.assertEquals("Descrição vazia!", e.getMessage());
        }

        try {
            anuncio.setDescrição(null);
        } catch (Exception e) {
            Assert.assertEquals("Descriçao nula!", e.getMessage());
        }

    }

    @Test
    public void naoDevePermitirCidadeVaziaOuNula(){
        try {
            anuncio.setCidade("");
        } catch (Exception e) {
            Assert.assertEquals("Cidade vazia!", e.getMessage());
        }

        try {
            anuncio.setCidade(null);
        } catch (Exception e) {
            Assert.assertEquals("Cidade nula!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirBairroVazioOuNulo(){
        try {
            anuncio.setBairro("");
        } catch (Exception e) {
            Assert.assertEquals("Bairro vazio!", e.getMessage());
        }

        try {
            anuncio.setBairro(null);
        } catch (Exception e) {
            Assert.assertEquals("Bairro nulo!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirInstrumentosVazioOuNulo(){
        try {
            anuncio.setInstrumentos(new ArrayList<String>());
        } catch (Exception e) {
            Assert.assertEquals("Lista dos instrumentos vazia!", e.getMessage());
        }

        try {
            anuncio.setBairro(null);
        } catch (Exception e) {
            Assert.assertEquals("Lista dos instrumentos nula!", e.getMessage());
        }
    }


}
