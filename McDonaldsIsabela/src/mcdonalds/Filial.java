package mcdonalds;
import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String Cidade;
    private Gerente Gerente;
    private double Preco_Medio ;
    private List<Cozinheiro> cozinheiros;
    private int Quantidade_Vendida ;
    private List<Caixa> caixa;       

    public Double faturamento (double faturamento){
        faturamento = Preco_Medio * Quantidade_Vendida;
        return faturamento;
        
    }
    
  public Filial(){
      caixa = new ArrayList <Caixa>();
      cozinheiros = new ArrayList <Cozinheiro>();
      Quantidade_Vendida = 0;
      Preco_Medio = 0;
  }  

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public Gerente getGerente() {
        return Gerente;
    }

    public void setGerente(Gerente Gerente) {
        this.Gerente = Gerente;
    }

    public double getPreco_Medio() {
        return Preco_Medio;
    }

    public void setPreco_Medio(double Preco_Medio) {
        this.Preco_Medio = Preco_Medio;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(List<Cozinheiro> cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

    public int getQuantidade_Vendida() {
        return Quantidade_Vendida;
    }

    public void setQuantidade_Vendida(int Quantidade_Vendida) {
        this.Quantidade_Vendida = Quantidade_Vendida;
    }

    public List<Caixa> getCaixa() {
        return caixa;
    }

    public void setCaixa(List<Caixa> caixa) {
        this.caixa = caixa;
    }
}