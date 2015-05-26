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
     * Retorna a �nica inst�ncia do reposit�rio de anuncios
     */
    public static AnuncioRepository getInstance(){
        if(instance == null){
            instance = new AnuncioRepository();
        }
        return instance;
    }
}
