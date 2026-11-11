
package me.pieralini.Aula13.Singleton;

public class Configuracao {

    private static final Configuracao instancia = new Configuracao();

    private String ambiente;

    private Configuracao() {
        ambiente = "Desenvolvimento";
    }

    public static Configuracao getInstancia() {
        return instancia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public static void main(String[] args) {
        Configuracao primeira = Configuracao.getInstancia();
        Configuracao segunda = Configuracao.getInstancia();

        primeira.setAmbiente("Produção");

        System.out.println(segunda.getAmbiente());
        System.out.println(primeira == segunda);
    }
}
