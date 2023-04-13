import javax.swing.*;
import java.util.ArrayList;

public class Cantina {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(JOptionPane.showInputDialog("Ingresse o nome do cliente: "));
        Massa massa = new Massa(JOptionPane.showInputDialog("Ingresse o nome da massa: "),Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor da massa: ")));

        ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();

        int opcao;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha os ingredientes: \n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));
        do{
            switch (opcao) {
                case 1:
                    ingredientes.add(new Ingredientes("Bacon"));
                    break;
                case 2:
                    ingredientes.add(new Ingredientes("Mussarela"));
                    break;
                case 3:
                    ingredientes.add(new Ingredientes("Tomate"));
                    break;
                case 4:
                    ingredientes.add(new Ingredientes("Queijo"));
                    break;
                default:
                    break;
            }
        }while (opcao != 5);

        Pedido pedido = new Pedido(cliente, massa, ingredientes);
        JOptionPane.showMessageDialog(null, "Pedido feito para " + cliente.getNome() + "\n" + massa.getTipoDeMassa() +"\nValor R$ " + pedido.calcularValor(), "Cantina",JOptionPane.INFORMATION_MESSAGE);
    }
}
