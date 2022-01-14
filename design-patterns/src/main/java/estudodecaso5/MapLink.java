package estudodecaso5;

public class MapLink implements Mapa{

    @Override
    public String obterEndereco(String cep) {
        return "Retornando endereço através do MapLink. CEP: " + cep;
    }
}
