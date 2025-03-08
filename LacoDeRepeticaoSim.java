import javax.swing.JOptionPane;

public class LacoDeRepeticaoSim {
    public static void main(String[] args) {
        String resposta = "Sim";

        while(resposta.equals("Sim")) {
            resposta = JOptionPane.showInputDialog("Deseja continuar?");
        }
    }
}
