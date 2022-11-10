package transporte;


public class Carro {
    private String placa;
    private int numChassi;
    private int velocidadeAtual = 0;

    public Carro(String placa_veiculo, int numero_do_chassi) {
        setPlaca(placa_veiculo);
        this.numChassi = numero_do_chassi;
    }

    public Carro() {
        
    }
    

    //retorno, nome, parametros
    //e implementacao
    public void acelerar() {
        velocidadeAtual++;
    }

    public void acelerar(int limite) {
        for(int i = 0; i < limite; i++) {
            acelerar();
        }
    }

    boolean frear() {
        return true;
 
    }

    //métodos GET/SET
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa_parametro) {
        if(placa_parametro != null && placa_parametro.length() == 7 && placa_parametro.matches("[A-Z]{3}\\d{4}")) 
        {
            this.placa = placa_parametro;
        } else {
            this.placa = "erro";
        }
        
        
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    
    
}
