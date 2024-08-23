package classes;

import abstratas.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB{

    protected Leao(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }
    
    @Override
    public String comer() {
        return "Comendo " + getQuantidadeComida() + " kg de carne.";
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
