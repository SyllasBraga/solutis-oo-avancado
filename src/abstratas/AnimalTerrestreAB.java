package abstratas;

public abstract class AnimalTerrestreAB extends AnimalAB{

    private int quantidadePatas;

    protected AnimalTerrestreAB(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
        super(quantidadeCaminho, quantidadeComida, quantidadeHorasDormir);
    }

    public int getQuantidadePatas() {
      return this.quantidadePatas;
    }
    public void setQuantidadePatas(int value) {
      this.quantidadePatas = value;
    }
}
