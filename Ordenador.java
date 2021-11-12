public class Ordenador{
    // Marca del ordenador 
    private String marca;
    // Numero de horas que ha estado arrancado el ordenador
    private int numeroHorasArrancado;
    // Indicar si el ordenador está encendido o no
    private boolean ordenadorEncendido;
    
    public Ordenador(String indicarMarca, boolean ordenadorEnFuncionamiento){
        marca = indicarMarca;
        ordenadorEncendido = ordenadorEnFuncionamiento;
        numeroHorasArrancado = 0;
    }
    
    public void setMarca(String seleccionarMarca){
        marca = seleccionarMarca;
    }
    
    /**
     * Aumentar el numero de horas que lleva arrancado el ordenador con un operacion
     */
    public int aumentarHorasArrancado(int horasDiariasArrancado) {
        numeroHorasArrancado = numeroHorasArrancado + horasDiariasArrancado;
        return numeroHorasArrancado;
    }
    
    /**
     * Metodo para arrancar el ordenador 
     */
    public void pulsarBoton() {
        if (ordenadorEncendido == true){
            ordenadorEncendido = false;
        }
        else{
            ordenadorEncendido = true;
        }
    }
    
    /**
     * Imprimir por pantalla todos los datos del ordenador
     */
    public void imprimirDatos(){
        System.out.println(" Marca: " + marca);
        System.out.println(" Horas arrancado: " + numeroHorasArrancado);
        System.out.println(" Arrancado: " + ordenadorEncendido);
    }
    
    /**
     * Devolver en String todos los datos del ordenador
     */
    public String datosOrdenador() {
        String aDevolver =" Marca: " + marca + " . " + " Horas arrancado: " + numeroHorasArrancado + " . " + "Arrancado: " + ordenadorEncendido + " . ";
        return aDevolver; 
    }
}