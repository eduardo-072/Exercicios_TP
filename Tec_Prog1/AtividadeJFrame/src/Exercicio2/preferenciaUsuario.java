package Exercicio2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class preferenciaUsuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Usuario usuario;
    
    // Componentes da interface
    private JComboBox<String> cmbTema;
    private JCheckBox chkNotificacoes;
    private JSlider sliderVolume;
    private JTextArea txtAreaPreferencias;
    private JLabel lblVolumeValor;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	preferenciaUsuario  frame = new preferenciaUsuario ();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public preferenciaUsuario() {
       
        usuario = new Usuario();
        
        setTitle("Configuração de Preferências");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblTitulo = new JLabel("PREFERÊNCIAS DO USUÁRIO");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JLabel lblTema = new JLabel("Tema:");
        lblTema.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        cmbTema = new JComboBox<>();
        cmbTema.setModel(new DefaultComboBoxModel<>(new String[] {"Claro", "Escuro"}));
        cmbTema.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aplicarTema();
            }
        });

        JLabel lblNotificacoes = new JLabel("Notificações:");
        lblNotificacoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        chkNotificacoes = new JCheckBox("Habilitar notificações");
        chkNotificacoes.setSelected(true);
        
        JLabel lblVolume = new JLabel("Volume:");
        lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        sliderVolume = new JSlider();
        sliderVolume.setMinimum(0);
        sliderVolume.setMaximum(100);
        sliderVolume.setValue(50);
        sliderVolume.setMajorTickSpacing(25);
        sliderVolume.setMinorTickSpacing(5);
        sliderVolume.setPaintTicks(true);
        sliderVolume.setPaintLabels(true);
        sliderVolume.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                atualizarVolumeLabel();
            }
        });
        
        lblVolumeValor = new JLabel("50%");
        lblVolumeValor.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnSalvar = new JButton("Salvar Preferências");
        btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salvarPreferencias();
            }
        });

        JLabel lblPreferenciasSalvas = new JLabel("Preferências Salvas:");
        lblPreferenciasSalvas.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        JScrollPane scrollPane = new JScrollPane();
        
        txtAreaPreferencias = new JTextArea();
        txtAreaPreferencias.setEditable(false);
        txtAreaPreferencias.setFont(new Font("Monospaced", Font.PLAIN, 12));
        scrollPane.setViewportView(txtAreaPreferencias);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(95)
        			.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(25)
        			.addComponent(lblTema, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(cmbTema, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(25)
        			.addComponent(lblNotificacoes, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(chkNotificacoes, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(25)
        			.addComponent(lblVolume, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(sliderVolume, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(lblVolumeValor, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(145)
        			.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(25)
        			.addComponent(lblPreferenciasSalvas, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(25)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(15)
        			.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTema, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cmbTema, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNotificacoes, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(chkNotificacoes, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addGap(25)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblVolume, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(sliderVolume, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_contentPane.createSequentialGroup()
        					.addGap(15)
        					.addComponent(lblVolumeValor, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        			.addGap(30)
        			.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addGap(25)
        			.addComponent(lblPreferenciasSalvas, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(5)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        );
        contentPane.setLayout(gl_contentPane);

        carregarPreferenciasIniciais();
    }
    
    private void carregarPreferenciasIniciais() {
        cmbTema.setSelectedItem(usuario.getTema());
        chkNotificacoes.setSelected(usuario.isNotificacoesHabilitadas());
        sliderVolume.setValue(usuario.getVolume());
        aplicarTema();
        txtAreaPreferencias.setText(usuario.toString());
    }

    private void aplicarTema() {
        String temaSelecionado = (String) cmbTema.getSelectedItem();
        
        if ("Escuro".equals(temaSelecionado)) {
            contentPane.setBackground(new Color(45, 45, 45));
            txtAreaPreferencias.setBackground(new Color(60, 60, 60));
            txtAreaPreferencias.setForeground(Color.WHITE);
            chkNotificacoes.setBackground(new Color(45, 45, 45));
            chkNotificacoes.setForeground(Color.WHITE);
            sliderVolume.setBackground(new Color(45, 45, 45));
            sliderVolume.setForeground(Color.WHITE);

            for (var component : contentPane.getComponents()) {
                if (component instanceof JLabel) {
                    ((JLabel) component).setForeground(Color.WHITE);
                }
            }
        } else {
            contentPane.setBackground(new Color(240, 240, 240));
            txtAreaPreferencias.setBackground(Color.WHITE);
            txtAreaPreferencias.setForeground(Color.BLACK);
            chkNotificacoes.setBackground(new Color(240, 240, 240));
            chkNotificacoes.setForeground(Color.BLACK);
            sliderVolume.setBackground(new Color(240, 240, 240));
            sliderVolume.setForeground(Color.BLACK);
            
            for (var component : contentPane.getComponents()) {
                if (component instanceof JLabel) {
                    ((JLabel) component).setForeground(Color.BLACK);
                }
            }
        }
    }
    
    private void atualizarVolumeLabel() {
        lblVolumeValor.setText(sliderVolume.getValue() + "%");
    }

    private void salvarPreferencias() {
        
        String tema = (String) cmbTema.getSelectedItem();
        boolean notificacoes = chkNotificacoes.isSelected();
        int volume = sliderVolume.getValue();
        
        usuario.setTema(tema);
        usuario.setNotificacoesHabilitadas(notificacoes);
        usuario.setVolume(volume);
        
        exibirPreferencias();
    }
 
    private void exibirPreferencias() {
        txtAreaPreferencias.setText(usuario.toString());
    }
}