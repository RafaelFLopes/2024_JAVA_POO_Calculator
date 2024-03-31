import javax.swing.JOptionPane;

public class index{
    public static void main(String[] args) {
        dadosCont();
    }
    static void dadosCont(){
        JOptionPane.showMessageDialog(null, "CALCULADORA");
        String operacoes = JOptionPane.showInputDialog("INFORME A OPERAÇÃO:\nAdição\nSubtração\nMultiplicação\nDivisão");
        Float num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro número da " + operacoes));
        Float num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo número da " + operacoes));

        String texto = contas(operacoes, num1, num2);
        JOptionPane.showMessageDialog(null, texto);
    }
    static String contas(String op, Float n1, Float n2){
        Float result;
        if (op.equals("Adição")) {
            result = n1 + n2;
            return "O Resultado da " + op + " é igual a " + result;
        }
        else if (op.equals("Subtração")){
            result = n1 - n2;
            return "O Resultado da " + op + " é igual a " + result;
        }
        else if (op.equals("Multiplicação")){
            result = n1 * n2;
            return "O Resultado da " + op + " é igual a " + result;
        }
        else if (op.equals("Divisão")) {
            result = n1 / n2;
            return "O Resultado da " + op + " é igual a " + result;
        }
        else {
            return "ERRO:\nEscreva de forma correta";
        }
    }
}