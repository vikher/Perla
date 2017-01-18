public class Gerente extends Empleado {

    private String Categoria;
    private int Sueldo;

    public Gerente (String nombre, String domicilio, int edad, String puesto) {

        super(nombre, domicilio, edad, puesto);
        Sueldo = 0;
        Categoria = "Unknown";   } 
    public void setSueldo (int Sueldo) { this.Sueldo = Sueldo;}
    public void setCategoria (String Categoria) { this.Categoria = Categoria;   }
    public int getSueldo () { return Sueldo;}
    public String getCategoria () { return Categoria;   }

    public void mostrar() {
        System.out.println ("Gerente de nombre: " + getNombre() + "\n con domicilio " +  getDomicilio() + "\n con puesto " + getPuesto() + "\n con edad " + getEdad() +

         "\n con sueldo: " + getSueldo() + "\n con categoria: " + getCategoria() ); }

} 