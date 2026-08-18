public class Mago {
    
    String nombremago;
    String habilidadespecialmago;
    int vidamago;

    String jugadorvidasubida;
    int cantidadvidasubida;
    

    public Lanzarfuego (String nombremago, String habilidadespecialmago, int vidamago){
        this.nombremago = nombremago;
        this.habilidadespecialmago = habilidadespecialmago;
        this.vidamago = vidamago;
    }

    public RecuperarVidaJugador (String jugadorvidasubida, int cantidadvidasubida){
        this.jugadorvidasubida = jugadorvidasubida;
        this.cantidadvidasubida = cantidadvidasubida;
    }
}