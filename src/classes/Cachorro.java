package classes;

import abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    protected Cachorro(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    @Override
    public String comer() {
        return "Comendo " + getQuantidadeComida() + " gramas de comida.";
    }

    @Override
    public String dormir() {
        return "Dormindo por " + getQuantidadeHorasDormir() + " minutos.";
    }

    @Override
    public String moverse() {
        return "Movendo-se por " + getQuantidadeCaminho() + " centímetros.";
    }
}
