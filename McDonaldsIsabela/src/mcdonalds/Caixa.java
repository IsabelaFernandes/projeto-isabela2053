package mcdonalds;

public class Caixa {

    private String Nome;
    private String Nasc;
    private String Cpf;
    private String Turno;
    
    public double Salario_Caixa(double Salario_Caixa){
    
        Salario_Caixa = 1.200 ;
        return Salario_Caixa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getData_Nasc() {
        return Nasc;
    }

    public void setData_Nasc(String Data_Nasc) {
        this.Nasc = Data_Nasc;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getHorario() {
        return Turno;
    }

    public void setTurno (String Turno) {
        this.Turno = Turno;
    }
}
