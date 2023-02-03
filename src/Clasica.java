import java.time.LocalDate;

public class Clasica extends TarjetaCredito{
private String tipoTarjeta;

    public Clasica(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoTarjeta = "Clasica";
    }

    public String getDatosClasica(){
        return "El nombre del emisor "+ this.getEmisor() +" cupo "+ this.getCupo()+" numero tarjeta "+ this.getNumeroTarjeta() +" tipo tarjeta "+ this.tipoTarjeta;
    }
}
