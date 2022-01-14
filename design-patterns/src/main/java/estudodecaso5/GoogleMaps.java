package estudodecaso5;

public class GoogleMaps implements Mapa{

    @Override
    public String obterEndereco(String cep) {
        return "Retornando endereço através do Google Maps. CEP: " + cep;
    }
}
