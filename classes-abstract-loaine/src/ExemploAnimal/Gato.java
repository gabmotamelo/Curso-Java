package ExemploAnimal;

public class Gato extends Mamifero{
    private String raca;

    public Gato(){}

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Miauuuu";
    }

    @Override
    public String amamentar() {
        return "Sim,ele amamenta";
    }
}
