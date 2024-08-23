package classes;

import abstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB{

    protected Gato(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    @Override
    public String comer() {
        return "Comendo " + getQuantidadeComida() + " peixes.";
    }

    @Override
    public String dormir() {
        return "Dormindo por " + getQuantidadeHorasDormir() + " horas.";
    }

    @Override
    public String moverse() {
        return "Movendo-se por " + getQuantidadeCaminho() + " telhados.";
    }
}
