package practica4;

public class Ejemplo {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado();
        Empleado emp2 = new Contador();
        Empleado emp3 = new Gerente();
        
        float salarioBase=100;
        
        emp.setSalario(salarioBase);emp.setHorasTrabajadas(40);
        emp2.setSalario(salarioBase);emp2.setHorasTrabajadas(40);
        emp3.setSalario(salarioBase);emp3.setHorasTrabajadas(40);
                
        System.out.println("salario de Empleado: "+emp.calcularSalario());
        System.out.println("salario de Contador: "+emp2.calcularSalario());
        System.out.println("salario de Gerente: "+emp3.calcularSalario());
        
    }
}

