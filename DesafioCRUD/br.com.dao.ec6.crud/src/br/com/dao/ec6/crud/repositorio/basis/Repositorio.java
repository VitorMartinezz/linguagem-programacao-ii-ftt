/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.ec6.crud.repositorio.basis;
import br.com.comuns.crud.ec6.enums.EntidadesDisponiveis;
import br.com.comuns.ec6.crud.basis.Entidade;

/**
 *Classe mãe para definir metodos de busca em diferentes repositorios
 * @author gabriell
 */
public abstract class Repositorio {

    /**
     * Faz a busca por ID variando do tipo de entidade disponivel
     * @param id
     * @param tipoEntidade
     * */
    public abstract Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade);
    /**
     * Faz a busca pelo codigo variando do tipo de entidade disponivel
     * @param codigo
     * @param tipoEntidade
     * */
    public abstract Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade);
}
