package Ex1Agenda;

public class TesteAgenda {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.setNome("Trabalho");

        Contato contato = new Contato();
        contato.setNome("Chico");
        contato.setTelefone("11 88888-8888");
        contato.setEmail("123@gmail.com");

        Contato contato2 = new Contato();
        contato2.setNome("Mike");
        contato2.setTelefone("11 11222-4342");
        contato2.setEmail("silvi@gmail.com");

        Contato contato3 = new Contato();
        contato3.setNome("Joao");
        contato3.setTelefone("22 46244-6743");
        contato3.setEmail("maito@gmail.com");

        Contato[] contatos = new Contato[3];
        contatos[0] = contato;
        contatos[1] = contato2;
        contatos[2] = contato3;

        agenda.setContatos(contatos);

        System.out.println(agenda.getNome());

        if (agenda != null && agenda.getContatos() != null) {
            for (Contato cont : agenda.getContatos()) {
                System.out.println(cont.getNome());
                System.out.println(cont.getTelefone());
                System.out.println(cont.getEmail());
            }
        }
    }
}
