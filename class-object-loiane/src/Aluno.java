import java.util.Arrays;
import java.util.Objects;

public class Aluno{

    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso){
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }


    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        //s+= super.getEndereco();
        return s;
    }
    public void imprimirEtiquetaEndereço(){
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*@Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Aluno other = (Aluno) o;
        if(curso.equals(other.getCurso())){
            return true;
        } return false;
    }

}
