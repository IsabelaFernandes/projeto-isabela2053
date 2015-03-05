/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marcelopessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author marcelosiedler
 */
public class MarceloPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa = new Pessoa();
        
       
        //Tratamento de erros inesperados ...
        while(pessoa.getCodigo()==null)
        {
            try
            {
                //aqui é o que estou executando
                pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite Código:")));

            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "É NÚMERO O CÓDIGO");
            }
        }
        
       pessoa.setNome(JOptionPane.showInputDialog("Digite Nome"));
       pessoa.setSexo(JOptionPane.showInputDialog("Digite sexo"));
        
        //AGORA EXIBIR NA TELA
        
        JOptionPane.showMessageDialog(null, pessoa.getCodigo() + "\n" + 
                                            pessoa.getNome() + "\n" + 
                                            pessoa.getSexo());
        
        
    }
    
}
