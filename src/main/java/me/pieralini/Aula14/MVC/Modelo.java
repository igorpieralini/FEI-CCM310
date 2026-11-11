
package me.pieralini.Aula14.MVC;

public class Modelo {

    private int primeiro;
    private int segundo;

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int somar() {
        return primeiro + segundo;
    }
}
