package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {
        // teste mocado (mock)
        // declaracao e instanciacao do obejto da classe Radio
        Radio radio = new Radio();
        radio.estacao = 89.1f;
        radio.volume = 5;
        radio.trocarEstacao(92.5f);
        radio.aumentarVolume();
        radio.aumentarVolume();
        System.out.println("Volume: " + radio.volume + " \nEstacao: " + radio.estacao);
    }
}
