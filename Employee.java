package programada11.pkg06.pkg2018;

public class Employee {
    
    private String PNome;
    private String SNome;
    private double Sal;
    
    public Employee (String PNome, String SNome, double Sal){
        this.PNome = PNome;
        this.SNome = SNome;
        if(Sal <= 0){
            System.out.println("\nSalario não definido!");
        }else{
            this.Sal = Sal;
        }
        
    }
    
    public double getSalAnual(){
        return this.Sal = this.Sal + (this.Sal*10)/100;
    }
    
    public String getPNome() {
        return PNome;
    }

    public void setPNome(String PNome) {
        this.PNome = PNome;
    }

    public String getSNome() {
        return SNome;
    }

    public void setSNome(String SNome) {
        this.SNome = SNome;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double Sal) {
        this.Sal = Sal;
    }
}
