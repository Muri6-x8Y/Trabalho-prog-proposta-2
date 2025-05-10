package com.mycompany.maquinacoxinha;

public class Main {
    public static void main(String[] args) {
        // Criando uma máquina de coxinhas com estoque inicial de 10
        MaquinaCoxinha maquina = new MaquinaCoxinha(10);
        
        // Exibindo o estoque inicial
        System.out.println("Estoque inicial: " + maquina.getEstoque());
        
        // Abastecendo a máquina com 5 coxinhas
        maquina.abastecerEstoque(5);
        
        // Vendendo uma coxinha
        maquina.venderCoxinha();
        
        // Vendendo 3 coxinhas
        maquina.venderCoxinha(3);
        
        // Tentando vender 15 coxinhas (deve gerar erro)
        maquina.venderCoxinha(15);
        
        // Tentando vender 0 coxinhas (deve gerar erro)
        maquina.venderCoxinha(0);
        
        // Zerando a máquina
        maquina.zerarMaquina();
        
        // Exibindo o estoque final (deve ser 0)
        System.out.println("Estoque final: " + maquina.getEstoque());
    }
}
