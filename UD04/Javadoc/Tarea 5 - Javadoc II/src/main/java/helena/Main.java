package helena;

import java.text.DecimalFormat;

/**
 * Clase Main
 * @author Profesor
 */
public class Main {

    /**
     * Funcion Main
     * Contiene el codigo de la aplicacion
     * @param args parametros recibidos como argumentos de inicio
     */
    public static void main(String[] args) {
        /*
         * Creacion del un objeto Circulo
         */
        Circulo circulo = new Circulo(37,43,2.5);
        /*
         * Creacion de un objeto String concatenado en determinado formato,
         * llamadas a los metodos Getter de la clase Circulo
         */
        String salida =
                "La coordenada X es "+circulo.obtenerX()+
                "\nLa coordenada Y es "+circulo.obtenerY()+
                "\nEl radio es "+circulo.obtenerRadio();
        /*
         * Modificacion de los atributos del objeto, llamado a los metodos Setter de la clase Circulo
         */
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);
        /*
         * Concatanacion al obejto String "salida", llamando a la funcion sobre cargada toString()
         */
        salida+="\n\nLa nueva ubicación y el radio de círculo son\n"+circulo.toString();

        /*
         * Creacion del objeto "dosDigitos" de la clase DecimalFormat 
         */
        DecimalFormat dosDigitos = new DecimalFormat("0.00");

        /*
         * Concatanacion al obejto String "salida"
         * el valor retornado de la funcion obtenerDiametro() del objeto circulo, con el formato del objeto dosDigitos
         * el valor retornado de la funcion obtenerCircunferencia() del objeto circulo, con el formato del objeto dosDigitos
         * el valor retornado de la funcion obtenerArea() del objeto circulo, con el formato del objeto dosDigitos
         */
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerArea());

        /*
         * Imprime el valor de "salida" por el terminal
         */
        System.out.println(salida);

        /*
         * devuelve 0, que indica que el programa se ejecuto
         */
        System.exit(0);
    }
}

