package abstratas;

public abstract class AnimalMarinhoAB extends AnimalAB{
    
    protected AnimalMarinhoAB(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    public String nadar(){
        return "Nadando...";
    }
}
