import java.time.LocalDate;

public class Platinum extends TarjetaCredito{

    private String tipoTarjeta;
    public Platinum(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoTarjeta = "Platino";
    }

    public String getDatosClasica(){
        return "El nombre del emisor "+ this.getEmisor() +" cupo "+ this.getCupo()+" numero tarjeta "+ this.getNumeroTarjeta() +" tipo tarjeta "+ this.tipoTarjeta;
    }
}
