import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente cliente;
    Massa massa;
    List<Ingredientes> lista = new ArrayList<Ingredientes>();

    public double calcularValor() {
        double valorTotal = massa.getValor() + (lista.size() * 2.0);
        return valorTotal;
    }

}
