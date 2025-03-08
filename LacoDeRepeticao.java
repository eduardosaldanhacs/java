//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        float num, media, soma;
        int contador = 0;
        soma = 0f;
        
        
        while(contador < 5) {
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número"));
            soma = soma + num;
            contador++;
        }
        media = (soma / contador);
        //JOptionPane.showInputDialog("O resultado é: " + media);
        //JOptionPane.showMessageDialog(null, message:);
    }

}
