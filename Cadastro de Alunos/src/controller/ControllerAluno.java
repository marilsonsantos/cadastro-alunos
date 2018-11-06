package controller;

import java.sql.ResultSet;
import model.AlunoDAO;
import utilitarios.AlunoBean;

public class ControllerAluno {
    
    AlunoDAO adao = new AlunoDAO();
    
    public void controllerCadastro(AlunoBean ab){
    
        adao.cadastraAluno(ab);
        
    }
    
    public AlunoBean controllerExibe(AlunoBean ab){
    
        return adao.exibeAluno(ab);
    
    }
    
    public void controllerAlterar(AlunoBean ab){

        adao.alteraAluno(ab);
    
    }
    
    public void controllerExcluir(AlunoBean ab){
    
        adao.excluiAluno(ab);
    
    }
    
    public ResultSet controllerLista(AlunoBean ab){
    
        return adao.listaAluno(ab);
    
    }
    
}
