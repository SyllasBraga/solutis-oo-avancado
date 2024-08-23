package classes;

import abstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB{

    protected Elefante(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    @Override
    public String comer() {
        return "Comendo " + getQuantidadeComida() + " toneladas de comida.";
    }

    @Override
    public String dormir() {
        return "Dormindo por " + getQuantidadeHorasDormir() + " dias.";
    }

    @Override
    public String moverse() {
        return "Movendo-se por " + getQuantidadeCaminho() + " kms.";
    }
}
