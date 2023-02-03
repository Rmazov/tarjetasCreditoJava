import java.time.LocalDate;

public class Dorada extends TarjetaCredito{

    private String tipoTarjeta;
    public Dorada(String emisor, long cupo, String numeroTarjeta, int cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
        this.tipoTarjeta = "Dorada";
    }

    public String getDatosClasica(){
        return "El nombre del emisor "+ this.getEmisor() +" cupo "+ this.getCupo()+" numero tarjeta "+ this.getNumeroTarjeta() +" tipo tarjeta "+ this.tipoTarjeta;
    }
}
