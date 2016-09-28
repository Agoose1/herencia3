package practica4;

public class Empleado {

    private float salario;
    private int horasTrabajadas;

    public float getSalario() {return salario;}

    public void setSalario(float salario) {this.salario = salario;}

    public int getHorasTrabajadas() {return horasTrabajadas;}

    public void setHorasTrabajadas(int horasTrabajadas) {this.horasTrabajadas = horasTrabajadas;}

    public float calcularSalario() {float total = getSalario() * horasTrabajadas;
        return (float) total;}
}
