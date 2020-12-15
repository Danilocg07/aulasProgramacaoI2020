import javax.swing.*;

public class Aula02 {
    public static void main (String args[]){
        char sexo = 'M';
        byte idade = 89;
        short codigo = 256;
        float nota = 9.4f;
        int alunos = 100, classes = 10;
        long habitantes = 9050100;
        double dolar = 2.62;
        boolean alternativa = false;
        int soma, a = 0, b = 0;



        System.out.println("sexo: "+sexo+"\n idade: "+idade+ "\n codigo: "+codigo);
        System.out.println("nota: "+nota+"\n alunos: "+alunos+ "\n habitantes: "+habitantes);
        System.out.println("dolar: "+dolar+"\n alternativa: "+alternativa);

        /** Autor: Danilo Carlos
         *
         */
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo Valor:"));
        /**
         *  Float.parseFloat();
         *  Double.parseDouble();
         *  Integer.parseInt();
         */


        soma = a+b;
        JOptionPane.showMessageDialog(null,"Soma: "+soma);
    }
}
