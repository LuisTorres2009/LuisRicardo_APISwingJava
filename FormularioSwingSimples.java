import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;

public class FormularioSwingSimples {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Rótulos e Campos

        // Rótulo e campo para o Nome
        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setBounds(50, 30, 100, 16);
        JTextField campoNome = new JTextField(10);
        campoNome.setBounds(50, 50, 200, 24);

        // Rótulo e campo para o Email
        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(50, 80, 100, 16);
        JTextField campoEmail = new JTextField(15);
        campoEmail.setBounds(50, 100, 200, 24);

        // Rótulo e campo para a Idade
        JLabel labelIdade = new JLabel("Idade: ");
        labelIdade.setBounds(50, 130, 100, 16);
        JTextField campoIdade = new JTextField(5);
        campoIdade.setBounds(50, 150, 50, 24);

        // Rótulo e seleção de Sexo
        JLabel labelSexo = new JLabel("Sexo: ");
        labelSexo.setBounds(50, 180, 100, 16);
        
        JRadioButton radioMasculino = new JRadioButton("Masculino");
        radioMasculino.setBounds(50, 200, 100, 24);
        
        JRadioButton radioFeminino = new JRadioButton("Feminino");
        radioFeminino.setBounds(150, 200, 100, 24);
        
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);

        // Botão Cadastrar
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(50, 240, 100, 30);

        // Botão Limpar
        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(160, 240, 100, 30);

        // Ação do botão Cadastrar
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String email = campoEmail.getText();
                String idade = campoIdade.getText();
                
                // Validação do e-mail
                if (!validarEmail(email)) {
                    JOptionPane.showMessageDialog(frame, "E-mail inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Verifica o sexo selecionado
                String sexo = "";
                if (radioMasculino.isSelected()) {
                    sexo = "Masculino";
                } else if (radioFeminino.isSelected()) {
                    sexo = "Feminino";
                }

                JOptionPane.showMessageDialog(frame,
                    "Usuário Cadastrado: " +
                    "\nNome: " + nome +
                    "\nE-mail: " + email +
                    "\nIdade: " + idade +
                    "\nSexo: " + sexo
                );
            }
        });

        // Ação do botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoEmail.setText("");
                campoIdade.setText("");
                grupoSexo.clearSelection();
            }
        });

        // Adicionando componentes ao frame
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(labelSexo);
        frame.add(radioMasculino);
        frame.add(radioFeminino);
        frame.add(botaoCadastrar);
        frame.add(botaoLimpar);

        // Exibir a janela
        frame.setVisible(true);
    }

    // Função para validar o e-mail
    public static boolean validarEmail(String email) {
        // Expressão regular para validar o formato do e-mail
        String regex = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}