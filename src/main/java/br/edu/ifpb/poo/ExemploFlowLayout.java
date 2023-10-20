package br.edu.ifpb.poo;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    // Não vamos usar herança (estender JFrame) como mostrei em aula.
    // Com isso, estaríamos estendendo o JFrame apenas para usar seus métodos
    // e teríamos uma classe que teria todos os métodos públicos de JFrame,
    // quando precisamos apenas de alguns. Usar composição, nesse caso, é a
    // melhor prática.
    private final JFrame janela;

    public ExemploFlowLayout() {
        janela = new JFrame();

        addComponents();
    }

    public void createAndShowGUI() {
        janela.setTitle("Exemplo FlowLayout");
        janela.setSize(400, 400);
        // Define o que vai ser feito ao clicar o botão de fechar da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define que a janela seja centralizada em relação à tela ao ser aberta
        janela.setLocationRelativeTo(null);
        // Redimensiona a janela pra se encaixar ao tamanho dos componentes
        // janela.pack();

        // Maximiza a janela
//        janela.setExtendedState(janela.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        // Mostra a janela
        janela.setVisible(true);
    }

    private void addComponents() {
        janela.setLayout(new FlowLayout());

        janela.add(new JLabel("Redimensione a tela e veja como os componentes são posicionados"));
        janela.add(new JButton("0"));
        janela.add(new JButton("1"));
        janela.add(new JButton("2"));
        janela.add(new JButton("3"));
        janela.add(new JButton("4"));
        janela.add(new JButton("5"));
        janela.add(new JButton("6"));
        janela.add(new JButton("7"));
        janela.add(new JButton("8"));
        janela.add(new JButton("9"));
    }

    public static void main(String[] args) {
        ExemploFlowLayout tela = new ExemploFlowLayout();
        tela.createAndShowGUI();
    }
}
