package helena;


/**
 * Clase Persona
 * @author Profesor
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;
/**
 * Constructor de la Clase persona
 * @param valorX Recibe el valor un valor y lo establece() para "x"
 * @param valorY Recibe el valor un valor y lo establece() para "y"
 * @param valorRadio Recibe el valor un valor y lo establece() para el "Radio"
 */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }
/**
 * Setter del Atributo x
 * @param valorX valor que se usara para establece el atributo "x"
 */
    public void establecerX(int valorX) {
        x=valorX;
    }
/**
 * Getter del atributo x
 * @return x || devuelve el valor del atributo "x"
 */
    public int obtenerX() {
        return x;
    }
/**
 * Setter del valor y
 * @param valorY valor que se usara para establece el atributo "y"
 */
    public void establecerY(int valorY) {
        y=valorY;
    }
/**
 * Getter del atributo y
 * @return y || devuelve el valor del atributo "y"
 */
    public int obtenerY() {
        return y;
    }
/**
 * Setter del atributo radio
 * @param valorRadio valor que se usara para establece el atributo "radio"
 */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }
/**
 * Getter del atributo radio
 * @return radio || devuelve el valor del atributo "radio"
 */    
    public double obtenerRadio() {
        return radio;
    }
/**
 * Funcion que calcula el Diametro, utiliza el atributo "radio"
 * @return  devuelve el valor resultante del calculo 
 */
    public double obtenerDiametro() {
        return radio * 2;
    }
/**
 * Funcion que calcula la circunferencia, empleando la funcion "obtenerDiametro()"
 * @return devuelve el valor resultante del calculo
 */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
/**
 * Funcion que calcula el area, empleando el atributo "radio"
 * @return devuelve el valor resultante del calculo 
 */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
/**
 * Funcion Sobre cargada de toString()
 * devuelve una cadena de texto con un formato descrito
 * "Cento =[ ${this.x} , ${this.y} ]; Radio = ${this.radio}"
 */    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}