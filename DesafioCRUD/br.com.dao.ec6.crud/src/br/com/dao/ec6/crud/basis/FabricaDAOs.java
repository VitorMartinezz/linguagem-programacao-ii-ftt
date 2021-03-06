/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao.ec6.crud.basis;

import br.com.comuns.crud.ec6.enums.EntidadesDisponiveis;
import br.com.comuns.crud.ec6.enums.TipoRepositorio;
import br.com.comuns.crud.ec6.vos.acesso.Usuario;
import br.com.dao.ec6.crud.acesso.UsuarioMySQLDAO;
import br.com.dao.ec6.crud.acesso.UsuarioTextoDAO;

/**
 *Classe com o gerencimento sobre o tipo de repositorio
 * @author gabriell
 */
public class FabricaDAOs {

    /**
     * faz o gerenciamento do tipo de repositorio
     * @param enumEntidade
     * @param repositorio
     * */
    public static DAO Fabrica(EntidadesDisponiveis enumEntidade, TipoRepositorio repositorio) {
        switch (repositorio)
        {
            case TEXTO:
                return montaDAOTexto(enumEntidade);
            case MYSQL:
                return montaDAOMySQL(enumEntidade);
            default:
                return null;
        }
       
    }
    /**
     * retorna o DAO com Txt
     * @param enumEntidade
     * */
    private static DAO montaDAOTexto(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioTextoDAO();
                break;            
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    /**
     * retorna o DAO com MySQL
     * @param enumEntidade
     * */
    private static DAO montaDAOMySQL(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioMySQLDAO();
                break;            
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
}
