import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JFrame {
    private JTextField passwordField;
    private JCheckBox uppercaseCheckBox, lowercaseCheckBox, numbersCheckBox, specialCharCheckBox;
    private JButton generateButton, newPasswordButton;
    private Menu menu;

    public Window(Menu menu) {
        this.menu = menu;

        setTitle("Password Generator");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new FlowLayout()); // Layout para organizar componentes

        // Label
        JLabel label = new JLabel("Gerador de Senhas");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label);

        // Campo de tamanho da senha
        JLabel sizeLabel = new JLabel("Digite o tamanho da senha:");
        JTextField sizeField = new JTextField(5);
        add(sizeLabel);
        add(sizeField);

        // Caixa de texto para mostrar a senha gerada
        passwordField = new JTextField(20);
        passwordField.setEditable(false); // Não pode editar diretamente
        add(passwordField);

        // Checkboxes para opções de senha
        uppercaseCheckBox = new JCheckBox("Letras Maiúsculas");
        lowercaseCheckBox = new JCheckBox("Letras Minúsculas");
        numbersCheckBox = new JCheckBox("Números");
        specialCharCheckBox = new JCheckBox("Caracteres Especiais");

        add(uppercaseCheckBox);
        add(lowercaseCheckBox);
        add(numbersCheckBox);
        add(specialCharCheckBox);

        // Botão para gerar a senha
        generateButton = new JButton("Gerar Senha");
        add(generateButton);

        // Ação do botão "Gerar Senha"
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> options = new ArrayList<>();
                if (uppercaseCheckBox.isSelected()) options.add(1);
                if (lowercaseCheckBox.isSelected()) options.add(2);
                if (numbersCheckBox.isSelected()) options.add(3);
                if (specialCharCheckBox.isSelected()) options.add(4);

                Password password = new Password(options,Integer.parseInt(sizeField.getText()));
                passwordField.setText(password.getPassword());
            }
        });

        newPasswordButton = new JButton("Nova Senha");
        add(newPasswordButton);

        newPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uppercaseCheckBox.setSelected(false);
                lowercaseCheckBox.setSelected(false);
                numbersCheckBox.setSelected(false);
                specialCharCheckBox.setSelected(false);
                passwordField.setText("");
            }
        });

        setVisible(true);
    }
}
