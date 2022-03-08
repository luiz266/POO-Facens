
package Aula1;

public class Aluno {
    private String ra;
    private String nome;
    private String cursos;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
    
    //=============
    public String Imprimir(){
        return"Nome:" +getNome() +"\n RA:" + getRa() +"\n Curso:" + getCursos();
    
    }
         
}
