package br.edu.ifpb.poo;

import javax.swing.*;
import java.awt.*;

public class ExemploBorderLayout {
    private final JPanel painel1;
    private final JPanel painel2;
    private final JPanel painel3;
    private final JPanel painel4;
    private final JPanel painel5;
    private final JFrame janela;

    public ExemploBorderLayout() {
        janela = new JFrame();

        painel1 = new JPanel();
        painel1.setBackground(new Color(0xE52F2F));
        painel2 = new JPanel();
        painel2.setBackground(new Color(0x2F41E5));
        painel3 = new JPanel();
        painel3.setBackground(new Color(0x2FE5C4));
        painel4 = new JPanel();
        painel4.setBackground(new Color(0xE5CD2F));
        painel5 = new JPanel();
        painel5.setBackground(new Color(0xE5992F));

        painel1.setPreferredSize(new Dimension(50, 50));
        painel2.setPreferredSize(new Dimension(50, 50));
        painel3.setPreferredSize(new Dimension(50, 50));
        painel4.setPreferredSize(new Dimension(50, 50));
        painel5.setPreferredSize(new Dimension(50, 50));

        addComponents();
    }

    private void addComponents() {
        janela.setLayout(new BorderLayout());
        janela.add(painel1, BorderLayout.PAGE_START);
        janela.add(painel2, BorderLayout.PAGE_END);
        janela.add(painel3, BorderLayout.LINE_START);
        janela.add(painel4, BorderLayout.LINE_END);
        janela.add(painel5, BorderLayout.CENTER);
    }

    public void createAndShowGUI() {
        janela.setTitle("Exemplo BorderLayout");
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

    public static void main(String[] args) {
        ExemploBorderLayout tela = new ExemploBorderLayout();
        tela.createAndShowGUI();
    }
}
