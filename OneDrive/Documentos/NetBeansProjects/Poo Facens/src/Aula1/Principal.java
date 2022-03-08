
package Aula1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        
        a.setNome("Nagata");
        a.setRa("12345");
        a.setCursos("ADS");
        
        JOptionPane.showMessageDialog(null, a.Imprimir());
        
        Aluno b = new Aluno();
        
        b.setNome("Luiz");
        b.setRa("56789");
        b.setCursos("jogos");
        
        JOptionPane.showMessageDialog(null, b.Imprimir());
       
    }   
}
