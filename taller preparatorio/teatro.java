import java.util.Scanner;

public class teatro {
    //Dada una matriz que representa un teatro, donde cada celda contiene
    // un objeto Asiento con atributos número, fila, precio, implementa 
    //un algoritmo para ordenar los asientos dentro de cada fila según 
    //el precio en orden ascendente.

    int numero = 0;
    String fila = " ";
    Double precio = 0.0;
    Scanner sc = new Scanner(System.in);
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getFila() {
        return fila;
    }
    public void setFila(String fila) {
        this.fila = fila;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
        public teatro(){
        this.numero = 0;
        this.fila = " ";
        this.precio = 0.0;
    }
    