public class Main {
    
    public static void main(String[] args) {
        
        //Instanciação do objeto NaveEspacial        
        NaveEspacial naveEspacial = new NaveEspacial();

        //Chamada para os métodos setters
        naveEspacial.setNome("Enterprise");
        naveEspacial.setVelocidadeMaxima(10000000);

        //Chamada para os métodos implementados (questão 02)
        System.out.println( naveEspacial.tempoDeViagem(1000) );
        System.out.println( naveEspacial.quadrante(5, 3) );
    
    }
}
