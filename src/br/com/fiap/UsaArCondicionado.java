package br.com.fiap;

public class UsaArCondicionado {
    public static void main(String[] args) {
        // teste mocado (mock)
        // declaracao e instanciacao do objeto da classe ArCondicionado
        ArCondicionado arcondicionado = new ArCondicionado();
        arcondicionado.temperatura = 39f;
        arcondicionado.modo = "cold";
        arcondicionado.aumentarTemperatura();
        arcondicionado.diminuirTemperatura();
        arcondicionado.trocarModo("wind");
        System.out.println("Temperatura: " + arcondicionado.temperatura + " \nModo: " + arcondicionado.modo);
    }
}
