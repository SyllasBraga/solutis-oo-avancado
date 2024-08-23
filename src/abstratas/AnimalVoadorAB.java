package abstratas;

public abstract class AnimalVoadorAB extends AnimalAB{
    
    private int quantidadeAsas;
    private int envergaduraAsa;

    protected AnimalVoadorAB(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    public String voar(){
        return "Voando...";
    }

    public int getQuantidadeAsas() {
      return this.quantidadeAsas;
    }
    public void setQuantidadeAsas(int value) {
      this.quantidadeAsas = value;
    }

    public int getEnvergaduraAsa() {
      return this.envergaduraAsa;
    }
    public void setEnvergaduraAsa(int value) {
      this.envergaduraAsa = value;
    }
}
