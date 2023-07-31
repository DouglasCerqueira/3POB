import javax.swing.*;

public class JavaLibsPractice {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String insignia = JOptionPane.showInputDialog("Digite um numero");
        String cidade = JOptionPane.showInputDialog("Regiao Pokémon favorita");
        String amigo = JOptionPane.showInputDialog("Nome de um amigo");
        String tipo = JOptionPane.showInputDialog("Tipagem favorita");
        String apelido = JOptionPane.showInputDialog("Qual seu apelido");
        String pokemon = JOptionPane.showInputDialog("Pokemon favorito");

        JOptionPane.showMessageDialog(null,"Ola treinador " + nome + " , a partir de hoje você será um treinador Pokémon do tipo " + tipo +".\n"
                + "Seu objetivo é coletar " + insignia + " insígnias. " + apelido +
                ", Seu parceiro será o " + pokemon + " e você começará em Kalos,\n" +
                "enquanto isso seu amigo " + amigo + " começará em " + cidade, ".",0);
    }
}
