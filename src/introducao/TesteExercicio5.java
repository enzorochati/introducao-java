package introducao;

import javax.swing.*;

public class TesteExercicio5 {
    public static void main(String[] args) {
        int cod, qdte;
        String prod;
        double valor;
        String mensagem;

        cod = Integer.parseInt(JOptionPane.showInputDialog(
                "Seja muito bem vindo a Lanchonte do ManoJeff\n\n" +
                        "Escolha o código do produto:\n " +
                        "1- Cachorro Quente - R$ 10.00\n" +
                        "2- X-Salada - R$ 15.00\n" +
                        "3- X-Bacon - R$ 18.00\n" +
                        "4- Bauru - R$ 12.00\n" +
                        "5- Refrigerante - R$ 8.00\n" +
                        "6- Suco de Laranja - R$ 13.00"
        ));

        while(cod < 0 && cod > 6){
            JOptionPane.showMessageDialog(null, "Escolha incorreta. Tente novamente!");
            cod = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seja muito bem vindo a Lanchonte do ManoJeff\n" +
                            "Escolha o código do produto:\n " +
                            "1- Cachorro Quente - R$ 10.00\n" +
                            "2- X-Salada - R$ 15.00\n" +
                            "3- X-Bacon - R$ 18.00\n" +
                            "4- Bauru - R$ 12.00\n" +
                            "5- Refrigerante - R$ 8.00\n" +
                            "6- Suco de Laranja - R$ 13.00"
            ));
        }

        qdte = Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade: "));

        switch (cod){
            case 1:
                prod = "Cachorro Quente";
                valor = 10.00;
                mensagem = (String.format("Você pediu: %d Cachorro(s) Quente(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                prod = "X-Salada";
                valor = 15.00;
                mensagem = (String.format("Você pediu: %d X Salada(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                prod = "X-Bacon";
                valor = 18.00;
                mensagem = (String.format("Você pediu: %d X Salada(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                prod = "Bauru";
                valor = 12.00;
                mensagem = (String.format("Você pediu: %d Bauru(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                prod = "Refrigerante";
                valor = 8.00;
                mensagem = (String.format("Você pediu: %d Refrigerante(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                prod = "Suco de laranja";
                valor = 13.00;
                mensagem = (String.format("Você pediu: %d Suco(s) de laranja(s).\nO valor total do seu pedido: %.2f", qdte, qdte * valor));
                JOptionPane.showMessageDialog(null, mensagem, "Valor total", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        JOptionPane.showMessageDialog(null, "Obrigado por comprar conosco, volte sempre!", "Obrigado", JOptionPane.INFORMATION_MESSAGE);
    }
}