public class Empleado {

    private String nombre;
    private String domicilio;
    private int edad;
    private String puesto;
    //Constructor
    public Empleado (String nombre, String domicilio, int edad, String puesto) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;                   
        this.puesto = puesto;    }

    public String getNombre () { return nombre;  }

    public String getDomicilio () { return domicilio;  }
    
    public String getPuesto () { return puesto;  }

    public int getEdad () { return edad;   }

} //Cierre de la clase

