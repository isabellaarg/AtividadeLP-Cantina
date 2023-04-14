import javax.swing.*;
import java.util.ArrayList;

public class Cantina {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.cliente = new Cliente();
        pedido.massa = new Massa();
        String nomeCliente = JOptionPane.showInputDialog("Ingresse o nome do cliente: ");
        pedido.cliente.setNome(nomeCliente);
        String nomeMassa = JOptionPane.showInputDialog("Ingresse o nome da massa: ");
        pedido.massa.setTipoDeMassa(nomeMassa);
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor da massa: "));
        pedido.massa.setValor(valorMassa);

        int opcao;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha os ingredientes: \n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));

        while (opcao != 5){
            switch (opcao) {
                case 1:
                    pedido.lista.add(new Ingredientes("Bacon"));
                    break;
                case 2:
                    pedido.lista.add(new Ingredientes("Mussarela"));
                    break;
                case 3:
                    pedido.lista.add(new Ingredientes("Tomate"));
                    break;
                case 4:
                    pedido.lista.add(new Ingredientes("Queijo"));
                    break;
                default:
                    break;
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha os ingredientes: \n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));


       }

        JOptionPane.showMessageDialog(null, "Pedido feito para " + pedido.cliente.getNome() + "\n" +  pedido.massa.getTipoDeMassa() +"\nValor R$ " + pedido.calcularValor(), "Cantina",JOptionPane.INFORMATION_MESSAGE);
    }
}
