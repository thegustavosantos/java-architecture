package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class promocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){

        Cargo cargoAtual = funcionario.getCargo();

        if (Cargo.GERENTE == funcionario.getCargo()){
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if(metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario nao bateu a meta");
        }

    }

}
