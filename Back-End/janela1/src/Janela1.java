import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Janela1{
    	public static void main (String[] args){
        JFrame janela1 = new JFrame ();
        janela1. setTitle ("java do jota");
        janela1.setSize(500, 500);


        JLabel labelElogio = new JLabel();
        labelElogio.setText("Elogio: ");
        labelElogio.setBounds(10, 10, 100, 20);
        janela1.getContentPane().add(labelElogio);
        janela1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        janela1.setLayout(null);
        janela1.getContentPane().add(labelElogio);
        JTextField caixaElogio= new JTextField();
        caixaElogio.setBounds(20, 40, 400, 20);
        janela1.getContentPane().add(caixaElogio);
        janela1.setVisible(true);


        JButton botaoEnviar = new JButton();
        botaoEnviar.setText("Enviar");
        botaoEnviar.setBounds(20, 60, 100, 20);
        botaoEnviar.addActionListener(event ->{
            String nomeDigitado =caixaElogio.getText();
            JOptionPane.showMessageDialog(janela1,"Olá" + nomeDigitado);
        });
        janela1.getContentPane().add(botaoEnviar);
        janela1.setVisible(true);

    }
}



