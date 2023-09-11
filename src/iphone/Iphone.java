package iphone;

import navegador.NevegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.TelefoneCelular;

public class Iphone implements ReprodutorMusical, TelefoneCelular, NevegadorInternet {

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Nova aba selecionada");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando...");
  }

  @Override
  public void atender() {
    System.out.println("Telefone atendido!");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz iniciado");
  }

  @Override
  public void tocar() {
    System.out.println("Tocando Música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausado");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Música Selecionada");
  }

}
