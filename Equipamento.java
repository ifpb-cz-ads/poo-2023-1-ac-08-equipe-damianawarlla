package atividade8;

import java.util.UUID;

public class Equipamento{

    
    private String tipoMemoria;
    private int qtdMemoria;
    public String ip = gerarIp();
    

    public void definirTipoMemoria(String memoriaTipo){

        tipoMemoria = memoriaTipo;

    }

    public void definirQtdMemoria(int memoriaQtd){
       
        qtdMemoria = memoriaQtd;

    }

    private String gerarIp(){
        return UUID.randomUUID().toString();
    }

    public void mostrarQtdMemoria(){
        System.out.println(qtdMemoria);
    }

    public void mostrarTipoMemoria(){
        System.out.println(tipoMemoria);
    }


}