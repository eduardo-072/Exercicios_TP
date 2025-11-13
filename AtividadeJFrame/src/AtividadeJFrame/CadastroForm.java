package AtividadeJFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNome;
    private JSpinner spnIdade;
    private final ButtonGroup grupoSexo = new ButtonGroup();
    private JLabel lblResultado;
    private JRadioButton rbMasc;
    private JRadioButton rbFem;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroForm frame = new CadastroForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CadastroForm() {
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 60, 20);
        contentPane.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(90, 20, 250, 20);
        contentPane.add(txtNome);
        txtNome.setColumns(10);
        
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20, 55, 60, 20);
        contentPane.add(lblIdade);
        
        spnIdade = new JSpinner();
        spnIdade.setBounds(90, 55, 60, 20);
        contentPane.add(spnIdade);
        
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(20, 90, 60, 20);
        contentPane.add(lblSexo);
        
        rbMasc = new JRadioButton("Masculino");
        grupoSexo.add(rbMasc);
        rbMasc.setBounds(90, 90, 100, 20);
        contentPane.add(rbMasc);
        
        rbFem = new JRadioButton("Feminino");
        grupoSexo.add(rbFem);
        rbFem.setBounds(195, 90, 100, 20);
        contentPane.add(rbFem);
        
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarDados();
            }
        });
        btnEnviar.setBounds(140, 130, 100, 25);
        contentPane.add(btnEnviar);
        
        lblResultado = new JLabel("");
        lblResultado.setBounds(20, 170, 340, 80);
        contentPane.add(lblResultado);
    }
    
    private void enviarDados() {
        String nome = txtNome.getText();
        int idade = (int) spnIdade.getValue();
        String sexo = rbMasc.isSelected() ? "Masculino" : rbFem.isSelected() ? "Feminino" : "";

        if (nome.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        lblResultado.setText("<html>Nome: " + nome + "<br>Idade: " + idade + "<br>Sexo: " + sexo + "</html>");
    }
}