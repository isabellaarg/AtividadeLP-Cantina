import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private Massa massa;
    private ArrayList<Ingredientes> ingredientes;

    public Pedido(Cliente cliente, Massa massa, ArrayList<Ingredientes> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }
    public double calcularValor() {
        double valorTotal = massa.getValor() + (ingredientes.size() * 2.0);
        return valorTotal;
    }
}
