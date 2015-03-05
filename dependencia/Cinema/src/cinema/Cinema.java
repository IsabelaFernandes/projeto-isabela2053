
package Cinema;

import javax.swing.JOptionPane;

public class Cinema {

    public static void main(String[] args) {
        Filme f = new Filme();
        Ator a = new Ator();

        String nome, genero, atores;
        int classificacao, duracao, idade;

        String nome_ator, nacionalidade, oscar, nascimento, totalfilme;
        float cache;
        Integer  filmeultimo;
        Boolean osc = true;

        nome = JOptionPane.showInputDialog("Digite as informações do filme\nNome do Filme:  ");
        classificacao = Integer.parseInt(JOptionPane.showInputDialog("Classificação indicativa: "));
        duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração(em minutos): "));
        genero = JOptionPane.showInputDialog("Gênero: ");
        atores = JOptionPane.showInputDialog("Atores: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        f.atribuirNome(nome);
        f.atribuirClassificacao(classificacao);
        f.atribuirDuracao(duracao);
        f.atribuirGenero(genero);
        f.atribuirAtores(atores);
        f.atribuirIdade(idade);

        JOptionPane.showMessageDialog(null, "Dados do Filme\n\nNome: " + nome + "\nClassificação Indicativa: " 
                + classificacao + " anos\nDuração: "+ duracao + " min\nGênero: " + genero + "\nAtores: " + atores);

        f.clasindicativa(idade, classificacao);
        f.dur(duracao);

        nome_ator = JOptionPane.showInputDialog("Digite as informações do ator\nNome do Ator: ");
        nacionalidade = JOptionPane.showInputDialog("Nacionalidade: ");
        cache = Float.parseFloat(JOptionPane.showInputDialog("Cachê em Reais: "));
        nascimento = JOptionPane.showInputDialog("Data de nascimento: ");
        totalfilme = JOptionPane.showInputDialog("Total de filmes: ");
        filmeultimo = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de filmes do último ano: "));
        oscar = JOptionPane.showInputDialog("Ele já ganhou o oscar? Sim ou Não? ");

        a.atribuirNomeat(nome_ator);
        a.atribuirNacionalidade(nacionalidade);
        a.atribuirDatanasc(nascimento);
        a.atribuirCache(cache);
        a.atribuirTotalfil(totalfilme);
        a.atribuiFilmeultimo(filmeultimo);
        a.atribuirOscar(oscar);

        if (oscar.equalsIgnoreCase("Sim")) {
            osc = true;
        } else {
            osc = false;
        }

        JOptionPane.showMessageDialog(null, "Dados do Ator\n\nNome: " + nome_ator + "\nNacionalidade: "
                + nacionalidade + "\nData de nascimento: " + nascimento + "\nCachê: R$ " + cache + "\nTotal de fil"
                + "mes realizados: " + totalfilme + "\nTotal de filmes do ultimo ano: " + filmeultimo
                + "\nEsse ator já ganhou o oscar?: " + osc);

       
    }
}