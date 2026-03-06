package Exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroForm extends JFrame {

    private JTextField txtNome;
    private JSpinner spnIdade;
    private JRadioButton rbMasc;
    private JRadioButton rbFem;
    private JLabel lblResultado;

    public CadastroForm() {
        setTitle("Formulário de Cadastro");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblIdade = new JLabel("Idade:");
        JLabel lblSexo = new JLabel("Sexo:");

        txtNome = new JTextField(20);

        spnIdade = new JSpinner(new SpinnerNumberModel(18, 1, 120, 1));

        rbMasc = new JRadioButton("Masculino");
        rbFem = new JRadioButton("Feminino");

        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rbMasc);
        grupoSexo.add(rbFem);

        JButton btnEnviar = new JButton("Enviar");

        lblResultado = new JLabel("");
        lblResultado.setPreferredSize(new Dimension(300, 80));

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDados();
            }
        });

        // Adiciona na tela
        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(spnIdade);
        add(lblSexo);
        add(rbMasc);
        add(rbFem);
        add(btnEnviar);
        add(lblResultado);

        setVisible(true);
    }

    private void enviarDados() {
        String nome = txtNome.getText();
        int idade = (int) spnIdade.getValue();
        String sexo = rbMasc.isSelected() ? "Masculino" : rbFem.isSelected() ? "Feminino" : "";

        if (nome.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de enviar!");
            return;
        }

        Cliente cliente = new Cliente(nome, idade, sexo);

        lblResultado.setText("<html>" + cliente.getResumo().replace("\n", "<br>") + "</html>");
    }

    public static void main(String[] args) {
        new CadastroForm();
    }
}
