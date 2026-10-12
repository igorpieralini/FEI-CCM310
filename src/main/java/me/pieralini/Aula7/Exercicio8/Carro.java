public class Carro {

    private int velocidade;
    private int velocidadeMaxima;

    public Carro() {
        this.velocidade = 0;
        this.velocidadeMaxima = 200;
    }

    public Carro(int velocidade, int velocidadeMaxima) {
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int valor) throws VelocidadeMaximaException {
        int novaVelocidade = velocidade + valor;

        if (novaVelocidade > velocidadeMaxima) {
            throw new VelocidadeMaximaException("Velocidade maxima de " + velocidadeMaxima + " km/h excedida.");
        }

        velocidade = novaVelocidade;
    }

    public void frear(int valor) throws VelocidadeNegativaException {
        int novaVelocidade = velocidade - valor;

        if (novaVelocidade < 0) {
            throw new VelocidadeNegativaException("A velocidade nao pode ser menor que zero.");
        }

        velocidade = novaVelocidade;
    }
}