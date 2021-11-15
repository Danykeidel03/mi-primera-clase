
public class videoConsola {

    // Cantidad de bateria 
    private int cantidadBateria;
    //Encendido o apagado 
    private boolean encendido;
    // Modelo de la consola
    private String modeloConsola;

    public videoConsola(int porcentajeBateria, String modelo, boolean encendidoApagado ) {
        cantidadBateria = porcentajeBateria;
        modeloConsola = modelo;
        encendido = encendidoApagado;
    }

    /**
     * Carga la bateria 
     */
    public int cargaBateria() {
        if (cantidadBateria < 100) {
            cantidadBateria = cantidadBateria + 10;
        }
        else {
            System.out.println("Bateria Completa ");
        }
        return cantidadBateria;
    }

    /**
     * Devuelve el modelo de la consola
     */
    public String modeloDeConsola() {
        return modeloConsola;
    }

    /**
     * Dice si la consola esta encendida o no
     */
    public void consolaEncendida() {
        if (encendido == true) {
            System.out.println("La consola esta encendida ");
        }
        else{
            System.out.println("Debes encender la consola ");
        }
    }

  
} 