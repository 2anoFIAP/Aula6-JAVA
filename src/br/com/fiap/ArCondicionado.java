package br.com.fiap;

public class ArCondicionado {
    // atributos
    public float temperatura;
    public String modo;
    // metodos
    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }
    public void trocarModo(String novoModo){
        modo = novoModo;
    }
}
