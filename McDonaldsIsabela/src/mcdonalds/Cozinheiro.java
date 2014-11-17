package mcdonalds;

public class Cozinheiro {
    
    private int Turno_Trab;
    private String Nasc;
    private String Cpf;
    private String Nome;

    public double Salario_Cozinheiro (double Salario_Cozinheiro) {
        if (Turno_Trab != 1)
        Salario_Cozinheiro = 1.700 ;
        else 
            Salario_Cozinheiro = 1.300 ;
            
        return Salario_Cozinheiro;
}
    
    public int getTurno_Trab() {
        return Turno_Trab;
    }

    public void setTurno_Trab(int Turno_Trab) {
        this.Turno_Trab = Turno_Trab;
    }

    public String getData_Nasc() {
        return Nasc;
    }

    public void setNasc(String Nasc) {
        this.Nasc = Nasc;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
