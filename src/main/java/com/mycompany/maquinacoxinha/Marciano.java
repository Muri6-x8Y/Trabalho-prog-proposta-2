/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maquinacoxinha;

/**
 *  Suponha um jogo com objetos do tipo Marciano e outras criaturas do espaço. Um marciano
 * é corajoso quando existem mais de três marcianos no jogo. Quando ele está corajoso, ele
 * pode atacar. Se existirem três ou menos, todos ficam covardes. Assim, cada um precisa
 * saber a quantidade de marcianos no jogo. Cada criatura marciana tem nome e quantidade
 * de vidas, que inicialmente são três.
 * Este é um caso que pode ser resolvido utilizando um campo estático (contador). Cada vez
 * que um marciano é criado, o contador é incrementado.
 * 
 * 
 * @author Murilo
 */

public class Marciano {
    private String nome;
    private int vidas;
    private static int quantidade = 0; // cria um contador para todos os marcianos
    
    // Construtor vazio
    public Marciano(){
        this.nome = "SemNome";
        this.vidas = 3;
        quantidade++;
    }
    
    // Construtor Parametrizado 
    public Marciano(String nome){
        this.nome = nome;
        this.vidas = 3;
        quantidade++;
    }
    
    public void destruir(){
        quantidade--;
    }
    
    public boolean estaCorajoso(){
        return quantidade > 3;
    }
    
    public void atacar(){
        if(estaCorajoso()){
            System.out.println(nome + " esta atacando");
        } else {
            System.out.println(nome + " esta com medo e nao pode atacar");
        }
    }
    
    public void receberDano(){
        vidas--;
        System.out.println("O marciano"+ nome +" recebeu dano");
        if(vidas < 1){
            destruir(); // deixa o garbage collector trabalhar...
        }
        
    }
    
    public static int getQuantidade(){
        return quantidade;
    }
    
}
