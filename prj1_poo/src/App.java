

import transporte.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        
        //cria um objeto 1: objeto, instância, classe
        Carro carro = new Carro("ABC1234", 1231287312);
        
        System.out.printf("Velocidade atual é: %d", carro.getVelocidadeAtual());
        
        //atribuir caracteristicas atraves dos atributos
        /*carro.setPlaca("ABC1234"); 
        carro.setNumChassi(123125212);*/

        //ACELERANDO...
        for(int i = 0; i < 10; i++) {
            carro.acelerar();
        }
        
        
        System.out.printf("\nNúmero da placa é %s, número do chassi é %d\n", carro.getPlaca(), carro.getNumChassi());
        System.out.printf("Velocidade atual SEM SOBRECARGA é: %d", carro.getVelocidadeAtual());

        carro.acelerar(40);

        System.out.printf("\nVelocidade atual COM SOBRECARGA é: %d", carro.getVelocidadeAtual());
    }
}
