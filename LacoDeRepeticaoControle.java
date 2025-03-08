import javax.swing.JOptionPane;

public class LacoDeRepeticaoControle {
    public static void main(String[] args) {
        float num, media, soma;
        int cont = 0;
        soma = 0f;
        
        for(cont = 0; cont < 3; cont++) {
            num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o número: "));
            soma = num + soma;
        }
        media = (soma / cont);
        JOptionPane.showMessageDialog(null, "A média é: " + media, null, cont);
        //media = (soma / contador);
    }
}
