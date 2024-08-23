package abstratas;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

  private int quantidadeCaminho;
  private int quantidadeComida;
  private int quantidadeHorasDormir;
  private String nome;
  private String tipoAnimal;
  private int idade;
  private String habitat;
  private double altura;
  private double peso;

  protected AnimalAB(int quantidadeCaminho, int quantidadeComida, int quantidadeHorasDormir) {
    this.quantidadeCaminho = quantidadeCaminho;
    this.quantidadeComida = quantidadeComida;
    this.quantidadeHorasDormir = quantidadeHorasDormir;
  }

  @Override
  public String comer() {
    return "Comendo " + getQuantidadeComida() + "kg de comida.";
  }

  @Override
  public String dormir() {
    return "Dormindo por " + getQuantidadeHorasDormir() + " horas.";
  }

  @Override
  public String moverse() {
    return "Movendo-se por " + getQuantidadeCaminho() + " metros.";
  }

  public int getQuantidadeCaminho() {
    return this.quantidadeCaminho;
  }

  public void setQuantidadeCaminho(int value) {
    this.quantidadeCaminho = value;
  }

  public int getQuantidadeComida() {
    return this.quantidadeComida;
  }

  public void setQuantidadeComida(int value) {
    this.quantidadeComida = value;
  }

  public int getQuantidadeHorasDormir() {
    return this.quantidadeHorasDormir;
  }

  public void setQuantidadeHorasDormir(int value) {
    this.quantidadeHorasDormir = value;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String value) {
    this.nome = value;
  }

  public String getTipoAnimal() {
    return this.tipoAnimal;
  }

  public void setTipoAnimal(String value) {
    this.tipoAnimal = value;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int value) {
    this.idade = value;
  }

  public String getHabitat() {
    return this.habitat;
  }

  public void setHabitat(String value) {
    this.habitat = value;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double value) {
    this.altura = value;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double value) {
    this.peso = value;
  }
}
