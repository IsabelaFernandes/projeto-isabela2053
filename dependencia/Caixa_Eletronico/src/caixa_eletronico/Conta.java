package caixa_eletronico;

public class Conta {
    String ag, numcont, nomecorr;
    Double saldo;
    Boolean ativo;
    
    void abrir (String agenc, String numero, String nome)
    {
        ag = agenc;
        numcont = numero;
        nomecorr = nome;
        saldo = 0.0d;
        ativo = true;
    }
    
    boolean fechar (){
        
        if (saldo == 0.0){
            ativo = false;
            return true;
        }
        else {
            return false;
        }
        
    }
    
    Boolean depositar (Double valor){
        if (ativo == true){
            saldo = saldo + valor;
            return true;
        }
        else{
            return false;
        }   
    }
    
    Boolean sacar (Double valor){
        if (ativo == true){
            if (saldo >= valor){
                saldo = saldo - valor;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
