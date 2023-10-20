package br.edu.ifpb.poo;

import javax.swing.*;
import java.awt.*;

public class ExemploGridBagLayout {

    // Os controles são mantidos no escopo da classe para
    // estarem acessíveis a todos os métodos
    private final JTextField resultado;
    private final JButton btnAC;
    private final JButton btnSinal;
    private final JButton btnPorcentagem;
    private final JButton btnDiv;
    private final JButton btnMult;
    private final JButton btnSoma;
    private final JButton btnSub;
    private final JButton btnIgual;
    private final JButton btn0;
    private final JButton btn1;
    private final JButton btn2;
    private final JButton btn3;
    private final JButton btn4;
    private final JButton btn5;
    private final JButton btn6;
    private final JButton btn7;
    private final JButton btn8;
    private final JButton btn9;
    private final JButton btnVirgula;
    private final JFrame janela;

    public ExemploGridBagLayout() {
        resultado = new JTextField();
        resultado.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDiv = new JButton("/");
        btnMult = new JButton("x");
        btnSoma = new JButton("+");
        btnSub = new JButton("-");
        btnIgual = new JButton("=");
        btnVirgula = new JButton(",");
        btnAC = new JButton("AC");
        btnSinal = new JButton("+/-");
        btnPorcentagem = new JButton("%");
        janela = new JFrame();

        addComponents();
    }

    private void addComponents() {
        janela.setLayout(new GridBagLayout());
        // Com essas restrições, podemos controlar como cada controle é adicionado,
        // um a um. Determinaremos a posição e tamanho de cada elemento no grid
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        // Teremos 4 colunas de botões e o JTextField do resultado ficará no topo, ocupando 4 colunas
        constraints.ipady = 10; // Adiciona preenchimento interno vertical em cada componente
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        // Criaremos
        janela.add(resultado, constraints);
        // Não precisamos criar um novo objeto para cada controle adicionado, reutilizaremos o objeto
        // constraints
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        janela.add(btnAC, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        janela.add(btnSinal, constraints);
        constraints.gridx = 2;
        constraints.gridy = 1;
        janela.add(btnPorcentagem, constraints);
        constraints.gridx = 3;
        constraints.gridy = 1;
        janela.add(btnDiv, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        janela.add(btn7, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        janela.add(btn8, constraints);
        constraints.gridx = 2;
        constraints.gridy = 2;
        janela.add(btn9, constraints);
        constraints.gridx = 3;
        constraints.gridy = 2;
        janela.add(btnMult, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        janela.add(btn4, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        janela.add(btn5, constraints);
        constraints.gridx = 2;
        constraints.gridy = 3;
        janela.add(btn6, constraints);
        constraints.gridx = 3;
        constraints.gridy = 3;
        janela.add(btnSub, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        janela.add(btn1, constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        janela.add(btn2, constraints);
        constraints.gridx = 2;
        constraints.gridy = 4;
        janela.add(btn3, constraints);
        constraints.gridx = 3;
        constraints.gridy = 4;
        janela.add(btnSoma, constraints);
        // O botão 0 vai ocupar duas células (0 e 1) da linha 5
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        janela.add(btn0, constraints);
        // O botão 0 ocupa duas células, logo o botão de vírgula deve
        // ficar na célula 2
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        janela.add(btnVirgula, constraints);
        constraints.gridx = 3;
        constraints.gridy = 5;
        janela.add(btnIgual, constraints);
    }
    public void createAndShowGUI() {
        janela.setTitle("Exemplo GridbagLayout");
        janela.setLocationRelativeTo(null);
        // Não definimos o tamanho da janela, pois o método pack() cuidará disso
        // Redimensiona a janela pra se encaixar ao tamanho dos componentes
        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploGridBagLayout tela = new ExemploGridBagLayout();
        tela.createAndShowGUI();
    }
}
