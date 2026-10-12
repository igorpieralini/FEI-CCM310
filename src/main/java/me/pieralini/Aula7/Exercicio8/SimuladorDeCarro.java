public class SimuladorDeCarro {

    public static void main(String[] args) {
        Carro carro = new Carro(0, 120);

        try {
            carro.acelerar(80);
            System.out.println("Velocidade atual: " + carro.getVelocidade());

            carro.frear(30);
            System.out.println("Velocidade atual: " + carro.getVelocidade());

            carro.acelerar(100);
            System.out.println("Velocidade atual: " + carro.getVelocidade());
        } catch (VelocidadeMaximaException erro) {
            System.out.println(erro.getMessage());
        } catch (VelocidadeNegativaException erro) {
            System.out.println(erro.getMessage());
        }

        try {
            carro.frear(500);
        } catch (VelocidadeNegativaException erro) {
            System.out.println(erro.getMessage());
        }
    }
}