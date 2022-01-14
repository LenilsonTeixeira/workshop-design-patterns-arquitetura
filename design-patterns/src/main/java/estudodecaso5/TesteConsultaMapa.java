package estudodecaso5;

public class TesteConsultaMapa {

    public static void main(String[] args) {
        Mapa mapLink = new MapLink();
        System.out.println(mapLink.obterEndereco("13183-000"));

        Mapa googleMaps = new GoogleMaps();
        System.out.println(googleMaps.obterEndereco("38307-000"));

    }
}
