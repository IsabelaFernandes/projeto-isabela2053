package IsabelaFernandespessoa;

import javax.swing.JOptionPane;
import modelo.Cidade;
import modelo.Pessoa;

public class IsabelaFernandesPessoa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
            //Tratamento de erros inesperados...

        while (p.getCod() == null)
        {
            try {
                // Aqui é o executando.
                p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
            } catch (Exception ex) {
                //ex --> variavel
                // Aqui é o que quero fazer  quando der erro.
                JOptionPane.showMessageDialog(null, "O Código é em números!");
            }
        }
            p.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa: "));
            p.setSexo(JOptionPane.showInputDialog("Digite o sexo da pessoa: "));

            JOptionPane.showMessageDialog(null, "Código: " + p.getCod() + "\n" + "Nome: " + p.getNome() + "\n" + "Sexo: " + p.getSexo());

        
    }
    }
