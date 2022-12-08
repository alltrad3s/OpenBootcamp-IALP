// Ejercicio Parte 2
public class Main {
  public static void main(String[] args) {
    // Llamamos a la función y le pasamos como argumentos tres números
    int resultado = sumaDeNumeros(1, 2, 3);

    // Imprimimos el resultado
    System.out.println(resultado); // Imprime 6
  }

  // La función toma tres parámetros, que son números
  // Los parámetros se suman entre sí y se devuelve el resultado
  public static int sumaDeNumeros(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }
}

// Ejercicio Parte 2
public class Main {
  public static void main(String[] args) {
    // Creamos un objeto de la clase Coche
    Coche miCoche = new Coche();

    // Añadimos una puerta al coche
    miCoche.añadirPuerta();

    // Mostramos el número de puertas que tiene el coche
    System.out.println("El coche tiene " + miCoche.getNumeroDePuertas() + " puertas."); // Imprime "El coche tiene 1 puertas."
  }
}

class Coche {
  // La clase Coche tiene una variable numérica que almacena el número de puertas que tiene
  private int numeroDePuertas = 0;

  // La función añadirPuerta incrementa en uno el número de puertas que tiene el coche
  public void añadirPuerta() {
    numeroDePuertas++;
  }

  // La función getNumeroDePuertas devuelve el número de puertas que tiene el coche
  public int getNumeroDePuertas() {
    return numeroDePuertas;
  }
}
