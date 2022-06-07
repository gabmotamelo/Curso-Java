package ExemploAnimal;

public class Teste {
    public static void main(String[] args) {

        Papagaio papagaio = new Papagaio();
        papagaio.setNome("Loro");
        System.out.println(papagaio.getNome());
        System.out.println(papagaio.emitirSom());
        System.out.println(papagaio.voar() + "\n");

        Gato gato = new Gato();
        gato.setNome("Gatito");
        gato.setRaca("Gato Siamês");
        System.out.println(gato.getNome());
        System.out.println(gato.getRaca());
        System.out.println(gato.amamentar());
        System.out.println(gato.emitirSom() + "\n");

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Dog Size");
        cachorro.setRaca("Bulldog");
        cachorro.setTamanho("Grande");
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getTamanho());
        System.out.println(cachorro.amamentar());
        System.out.println(cachorro.emitirSom() + "\n");


    }
}
