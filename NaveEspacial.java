
public class NaveEspacial {

    //Atributos
    private String nome;
    private double velocidadeMaxima;

    //Construtor vazio
    public NaveEspacial() {

    }

    //Construtor com dois argumentos para configuração dos parâmetros
    public NaveEspacial(String nome, double velocidadeMaxima) {
        
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Métodos setters
    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidade) {

        velocidadeMaxima = velocidade;
    }

    //Declaração e implementação do método que calcula o tempo de viagem
    public double tempoDeViagem(double distancia) {

        return distancia/velocidadeMaxima;
    }

    //Declaração e implementação que retorna em que quadrante da galáxia está a nave com base nas coordenadas
    public int quadrante(double x, double y) {

        if( x > 0 && y > 0 ) 
            return 1;
        else if( x < 0 && y > 0 )
            return 2;
        else if( x < 0 && y < 0 )
            return 3;
        else
            return 4;
    }
}
