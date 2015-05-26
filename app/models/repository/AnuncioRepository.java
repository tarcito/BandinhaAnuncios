package models.repository;

import models.Anuncio;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class AnuncioRepository extends  GenericRepositoryImpl<Anuncio> {

    private static AnuncioRepository instance;

    private AnuncioRepository() {
        super(Anuncio.class);
    }
    /**
     * Retorna a única instância do repositório de anuncios
     */
    public static AnuncioRepository getInstance(){
        if(instance == null){
            instance = new AnuncioRepository();
        }
        return instance;
    }
}
