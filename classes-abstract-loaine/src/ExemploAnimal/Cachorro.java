package ExemploAnimal;

public class Cachorro extends Mamifero{
    private String tamanho;
    private String raca;

    public Cachorro(){}

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String amamentar() {
        return "Amamenta!";
    }

    @Override
    public String emitirSom() {
        return "Au Au Au";
    }
}
