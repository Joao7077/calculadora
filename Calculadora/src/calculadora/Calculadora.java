/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inicio = JOptionPane.showInputDialog("Selecione uma operação \n + (soma) \n - (subtração) \n * (multiplicação) \n / (divisão)");
        String numero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int num1 = Integer.parseInt(numero1);
        String numero2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int num2 = Integer.parseInt(numero2);
        double resposta;
        String a = inicio;
        switch(a){
            case "+":
                resposta = num1 + num2;
                JOptionPane.showMessageDialog(null, "Resposta "+resposta, a, 0);
                break;
        
            case "-":
                resposta = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resposta "+resposta, a, 0);
                break;
        
            case "*":
                resposta = num1 * num2;
                JOptionPane.showMessageDialog(null, "Resposta "+resposta, a, 0);
                break;
        
            case "/":
                resposta = num1 / num2;
                JOptionPane.showMessageDialog(null, "Resultado "+resposta, a, 0);
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Operação invalida", a, 0);
                break;
        }
        
    }
    
}
