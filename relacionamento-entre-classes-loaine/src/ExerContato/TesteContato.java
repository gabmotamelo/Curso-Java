package ExerContato;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Gabriel");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        //relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua dos Bobos");
        end.setCep("0538332");
        end.setCidade("sp");
        end.setEstado("São Paulo");
        end.setNumero("11");
        end.setComplemento("b");

        contato.setEndereco(end);

        //relacionamento tem um telefone
        Telefone tel = new Telefone();
        tel.setTipo("Fixo");
        tel.setDdd("11");
        tel.setNumero("99999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDdd("22");
        tel2.setNumero("98899-9999");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        //contato.setTelefones(tel);
        contato.setTelefones(telefones);

        //Teste saida no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getNomeRua());
        }

        /*if (contato != null && contato.getTelefones() != null){
            System.out.println(contato.getTelefones().getDdd() + contato.getTelefones().getNumero());
        }*/
        if (contato!= null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + t.getNumero());
            }
        }
    }
}
