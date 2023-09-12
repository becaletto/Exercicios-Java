/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author professor
 */
public class UsuarioControl {
    
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public UsuarioControl ()
    {
        Usuario u1 = new Usuario ("Ze", "1234");
        Usuario u2 = new Usuario ("Jao", "1111");
        Usuario u3 = new Usuario ("adm", "0000");
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        listaUsuarios.add(u3);
    }
    
    public boolean verificaLogin(String nomeTela, String senhaTela)
    {
        boolean achou = false;
        for(Usuario u: listaUsuarios){
            if(u.getNome().equals(nomeTela)&&(u.getSenha().equals(senhaTela)))
            {
                achou=true;
            }
        }
        return achou;
    }
}
