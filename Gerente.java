package practica4;

public class Gerente extends Empleado implements Salario{

    @Override
    public float calcularSalario() {
        float total=getSalario()*getHorasTrabajadas();
        return (float)(total +(total*0.50));
    }
}
