import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class CadastrodeFuncionarios {
    public static void main(String[] args) {
        JFrame cadastro = new JFrame();
        cadastro.setTitle("Cadastro de Funcionarios");
        cadastro.setSize(500, 500);

        JLabel labelNome = new JLabel();
        labelNome.setText("Nome: ");
        labelNome.setBounds(20, 20, 100, 20);

        JTextField caixaNome= new JTextField();
        caixaNome.setBounds(20, 40, 400, 20);


        cadastro.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cadastro.setLayout(null);
        cadastro.getContentPane().add(labelNome);
        cadastro.setVisible(true);

        


    }
}