package helena;

/**
 * Clase Persona
 * @author Profesor
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Edad de la persona
     */
    private int edad;


    /**
     * Constructor de la clase persona
     * @param nombre | Nombre de la persona
     * @param edad | Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Funcion getter del nombre
     * @return nombre | devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Funcion setter del nombre
     * @param nombre | guarda el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion getter de edad
     * @return edad | devuelve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Funcion setter de edad
     * @param edad | guarda el nuevo nombre
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Funcion imprimirDetalles
     * imprime los atributos de persona empleando un formato adecuado
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}