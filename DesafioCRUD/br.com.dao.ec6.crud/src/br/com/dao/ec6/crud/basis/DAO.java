/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.ec6.crud.basis;

import br.com.comuns.ec6.crud.basis.Entidade;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *Classe mãe para conexão com o banco de dados
 * @author gabriell
 * @param <E>
 */
public abstract class DAO <E extends Entidade> {
    
    protected Class<E> entityClass;

    public DAO(Class<E> entityClass){
        this.entityClass = entityClass;
    }

    /**
     * Busca um objeto do banco pelo Id
     * @param id
     * */
    public abstract E seleciona(int id);
    /**
     * Busca um objeto do banco pelo codigo
     * @param codigo
     * */
    public abstract E localiza(String codigo) throws SQLException;
    /**
     * Busca uma tabela com todos os objetos.
     * */
    public abstract ArrayList<E> lista() throws SQLException;
    
    protected E getInstanceOfE()
    {
        try
        {
            return entityClass.newInstance();
        }
        catch (IllegalAccessException | InstantiationException e)
        {
            // Oops, no default constructor
            throw new RuntimeException(e);
        }
    }
}
