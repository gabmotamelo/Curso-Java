package ExemploAnimal;

public class Papagaio extends Ave{

    public Papagaio(){}

    @Override
    public String emitirSom() {
        return "Papapapa papagaio";
    }

    @Override
    public String voar() {
        return "Voa sim!";
    }
}
