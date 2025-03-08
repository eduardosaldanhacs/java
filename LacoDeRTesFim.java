//package dados;

import javax.swing.JOptionPane;

public class LacoDeRTesFim {
    public static void main(String[] args) {
        float num, soma = 0f;
        do {
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor ou Zero para sair"));
            soma += num;
            JOptionPane.showMessageDialog(null, "A soma: é " + soma, null, 0);
        } while(num != 0);
    }
}
