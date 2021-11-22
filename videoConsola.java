
public class videoConsola {

    // Cantidad de bateria 
    private int cantidadBateria;
    //Encendido o apagado 
    private boolean encendido;
    // Modelo de la consola
    private String modeloConsola;

    public videoConsola(int porcentajeBateria, String modelo ) {
        cantidadBateria = porcentajeBateria;
        modeloConsola = modelo;
        encendido = true;
    }

    /**
     * Carga la bateria 
     */
    public void cargaBateria() {
        if (cantidadBateria < 100) {
            cantidadBateria = cantidadBateria + 10;
        }
        else {
            System.out.println("Bateria Completa ");
        }
    }
    
    /**
     *cambiar encendido 
     */
    public void cambiarEncendido(boolean nuevoEncendido) {
        if (encendido == true) {
            encendido = false;
        }
        if (encendido == false) {
            encendido = true;
        }
    }
    
    /**
     *cambiar modelo 
     */
    public void cambiarModelo(String nuevoModelo) {
        modeloConsola = nuevoModelo;
    }

    /**
     * Devuelve el modelo de la consola
     */
    public String modeloDeConsola() {
        return modeloConsola;
    }
    
    /**
     * Devuelve la bateria
     */
    public int getBateria() {
        return cantidadBateria;
    }
    /**
     * Devuelve si la consola esta encendida
     */
    public boolean getEncendido() {
        return encendido;
    }
    
    /**
     * Dice la informacion
     */
    public void informacion() {
        System.out.println("El modelo de la consola es " + modeloConsola);
        System.out.println("La cantidad de bateria es " + cantidadBateria);
        if (encendido == true) {
            System.out.println("La consola esta encendida ");
        }
        else{
            System.out.println("Debes encender la consola ");
        }
    }

    /**
     * Devuelve la bateria
     */
    public String getInformacion() {
        String estadisticas = "El modelo de la consola es " + modeloConsola + "La cantidad de bateria es " + cantidadBateria;
        return estadisticas;
    }
} 