import javax.swing.JOptionPane; //Métodos - funçao

// convenção camel case: ConvencaoCamelCase
public class IfSimples{
    public static void main (String [] args){
        //cada primitivo tem um classe empacotadora (wrapper) associada
        //byte: Byte
        //short: Short
        //int: Integer
        //long: Long
        //char: Character
        //float: Float
        //double: Double
        //float nota;
        //8.5 double -> usar        float f = 8.5 -> n dá
        //System.out.println("Hello, World");
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog ("Digite uma nota"));
        if (nota>=70){
            JOptionPane.showMessageDialog(null, "Aprovado");  
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado"); 
            }
        }
    }

