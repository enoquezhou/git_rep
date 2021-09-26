import javax.swing.JOptionPane;

public class OperadorTernario {
    
    public static void main(String[] args){
        //int a = 2;
        //boolean b = a >3 ;
        //boolean c = !(b == true && a >5);

        //short
        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Qual a sua idade?"));
        boolean podeDirigir;
        podeDirigir = idade >= 18;
        //podeDirigir = idade >= 18 ? true : false;

        //if (idade >=18)
        //    podeDirigir = true;
        //else
        //    podeDirigir = false;

        String resultado;
        resultado = idade >=18 ? "Sim, você pode dirigir" : "Não, ainda não" ;

        //Você pode dirigir
        //Você não pode dirigir
        //System.out.printf("Você %s pode dirigir\n", idade >=18 ?" ": "não");
        //System.out.printf("Você %s pode dirigir\n", idade >=18 ?"": "não");
        resultado = String.format("Você %s pode dirigir\n", idade >=18 ?"": "não");
        //JOptionPane.showMessageDialog(null, String.format("Você %s pode dirigir\n", idade >=18 ?"": "não"));
        JOptionPane.showMessageDialog(null, resultado);

        //mais conteudo
    }
    
}
