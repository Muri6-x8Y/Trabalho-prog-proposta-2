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
        
        // Jogo espacial de Marcianos
        
        Marciano m1 = new Marciano("Bender");
        Marciano m2 = new Marciano("Elon");
        Marciano m3 = new Marciano("Musk"); // ignora o aviso q deu aqui, esse marciano nunca foi chamado mas ele tem seu papel

        m1.atacar(); // Covarde (menos de 4 marcianos)

        Marciano m4 = new Marciano("Faker");

        m1.atacar(); // Corajoso (4 marcianos)

        System.out.println("Total de marcianos: " + Marciano.getQuantidade());
        // Remover um marciano do jogo
        m4.destruir();
        System.out.println("Total de marcianos: " + Marciano.getQuantidade());

        m2.atacar(); // Deve voltar a ser covarde pq só restarem 3
    }
}

