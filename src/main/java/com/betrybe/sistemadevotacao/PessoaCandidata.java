package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  int numero;
  int votos;
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
