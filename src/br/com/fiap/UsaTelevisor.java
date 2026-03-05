package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {
        // teste mocado (mock)
        // declaracao e instanciacao do objeto da classe Televisor
        Televisor televisor = new Televisor();
        televisor.volume = 7;
        televisor.canal = 37;
        televisor.aumentarVolume();
        televisor.diminuirVolume();
        televisor.trocarCanal(28);
        System.out.println("Volume: " + televisor.volume + " \nCanal: " + televisor.canal);
    }
}
