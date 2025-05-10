/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maquinacoxinha;

/**
 *  O dia 18 de maio é considerado o “Dia Nacional da Coxinha”, um quitute muito apreciado
 * pelos brasileiros. Pensando nisso, alguns alunos decidiram criar uma máquina automática
 * para vender coxinhas na UENP e pediram sua ajuda para programar a máquina, como
 * segue. Por enquanto, estamos na fase de simulação.
 * Assim, você precisa criar uma classe em Java que simula a máquina de venda de coxinhas.
 * A máquina deve manter o estoque de coxinhas, que inicialmente é zero (só há um tipo de
 * coxinha).
 * Deve haver um método para “abastecer” a máquina. O método deve receber a quantidade a
 * ser abastecida. Restrição: não deve haver abastecimento com valores negativos.
 * Deve haver um método para “vender coxinha”, que não tem parâmetros e decrementa a
 * quantidade de coxinhas em uma unidade. Restrição: não deve ser permitido decrementar a
 * quantidade se ela for zero.
 * Deve haver um método sobrecarregado para “vender coxinha” que recebe a quantidade de
 * coxinhas que o usuário está comprando. Restrição: não deve ser permitido vender mais
 * coxinhas do que a quantidade que tem na máquina.
 * Deve haver um método para “zerar a máquina”, que é chamado no final do dia, quando o
 * administrador desliga a máquina retirando todas as coxinhas que sobraram no final do dia.
 * (Isso deve existir, porém nunca sobram coxinhas, já que são produtos muito apreciados).
 * Crie atributo(s) privado(s) e métodos de acesso e modificação conforme o padrão (get/set).
 * Crie construtor(es) apropriado(s).
 * 
 * 
 * @author Murilo
 */
public class MaquinaCoxinha {
    private int estoque;
    
    // Construtor vazio
    public MaquinaCoxinha(){ 
        this.estoque = 0;
    }
    
    // Construtor com estoque inicial
    public MaquinaCoxinha(int estoque){
        this.estoque = estoque;
    }
    
    // Método Getter de acesso ao estoque
    public int getEstoque(){
        return estoque;
    }

    // Método Setter de acesso ao estoque 
    public void setEstoque(int estoque){
        if(estoque >= 0){
            this.estoque = estoque;
        } else {
            System.out.println("O estoque nao pode ser negativo");
        }
    }
    
    // Método para abastecer o estoque
    public void abastecerEstoque(int quantidade){
        if(quantidade > 0){
            estoque += quantidade;
            System.out.println("O estoque foi abastecido com " + quantidade + " e agora tem " + estoque + " coxinhas");
        } else {
            System.out.println("Erro: Valor invalido, tente valores inteiros positivos");
        }
    }
    
    // Método para vender uma coxinha
    public void venderCoxinha(){
        if(estoque > 0){
            estoque--;
            System.out.println("Uma coxinha foi vendida");
        }else{
            System.out.println("Erro: nao ha coxinhas para serem vendidas");
        }
    }

    // Método sobrecarregado
    public void venderCoxinha(int quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
            System.out.println("Foram vendidas " + quantidade + " coxinhas!!");
        }else{
            System.out.println("Erro: nao ha coxinhas suficientes na maquina ou entao foi solicitada a venda de 0 coxinhas");
        }
    }

    // Método zerar a máquina
    public void zerarMaquina(){
        estoque = 0;
        System.out.println("O horario de operacao acabou entao a maquina foi zerada.");
        System.out.println("Os alunos pegaram todas as coxinhas!!");
    }
}