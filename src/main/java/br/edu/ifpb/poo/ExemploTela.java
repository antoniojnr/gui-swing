package br.edu.ifpb.poo;

import javax.swing.*;

public class ExemploTela {
    // Não vamos usar herança (estender JFrame) como mostrei em aula.
    // Com isso, estaríamos estendendo o JFrame apenas para usar seus métodos
    // e teríamos uma classe que teria todos os métodos públicos de JFrame,
    // quando precisamos apenas de alguns. Usar composição, nesse caso, é a
    // melhor prática.
    private final JFrame janela;

    public ExemploTela() {
        janela = new JFrame();

        addComponents();
    }

    public void createAndShowGUI() {
        janela.setTitle("Exemplo tela");
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
        JLabel labelTexto = new JLabel("Texto");
        labelTexto.setHorizontalAlignment(SwingConstants.CENTER);
        janela.add(labelTexto);
    }

    public static void main(String[] args) {
        ExemploTela tela = new ExemploTela();
        tela.createAndShowGUI();
    }
}
