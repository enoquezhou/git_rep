import javax.swing.JOptionPane;
public class SwitchCase {
    static public void main(String outroNome[]){
            String conceito;
            conceito = JOptionPane.showInputDialog("Qual foi o seu concceito?");
            switch (conceito){
            case "A":
                JOptionPane.showMessageDialog(null, "Parabéns");
                //JOptionPane.showMessageDialog(null, "Excelente\nParabéns");
                //break;
            case "B":
                JOptionPane.showMessageDialog(null, "Excelente");
                //JOptionPane.showMessageDialog(null, "Muito bom");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case "R":
                JOptionPane.showMessageDialog(null, "Vamos tentar novamente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conceito inválido");
                break;
        }
    }
}
