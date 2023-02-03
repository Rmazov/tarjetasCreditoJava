import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {

    Clasica tClasica = new Clasica("visa",5000000,"454545454",455, LocalDate.of(2020, 1, 8) );
        System.out.println("datos tarjeta clasica "+tClasica.getDatosClasica());


    Dorada tDorada = new Dorada("master",10000000,"25252525",555, LocalDate.of(2026, 6, 9) );
        System.out.println("datos tarjeta dorada "+tDorada.getDatosClasica());

        Platinum tPlatinum = new Platinum("amaricanExpress",70000000,"7878787",666, LocalDate.of(2027, 7, 9) );
        System.out.println("datos tarjeta dorada "+tPlatinum.getDatosClasica());

        Black tBlack = new Black("visa",80000000,"989898",777, LocalDate.of(2028, 7, 9) );
        System.out.println("datos tarjeta dorada "+tBlack .getDatosClasica());

    }
}