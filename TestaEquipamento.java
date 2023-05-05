package atividade8;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamentoGenerico = new Equipamento();
        equipamentoGenerico.definirQtdMemoria( 8);
        equipamentoGenerico.definirTipoMemoria("RAM");
        

        Computador novoComputador = new Computador();
        novoComputador.definirTipoMemoria("SSD");
        novoComputador.definirQtdMemoria(256);
        novoComputador.definirMouse("Logitech G403");
        novoComputador.definirTeclado("Logitech K403");

        // mostrando as informações dos objetos

        equipamentoGenerico.mostrarTipoMemoria();
        equipamentoGenerico.mostrarQtdMemoria();
        System.out.println(equipamentoGenerico.ip);

        System.out.println("-----------------------");

        novoComputador.mostrarTipoMemoria();
        novoComputador.mostrarQtdMemoria();
        System.out.println(novoComputador.ip);
        System.out.println(novoComputador.modeloMouse);
        System.out.println(novoComputador.modeloTeclado);



    }
}
