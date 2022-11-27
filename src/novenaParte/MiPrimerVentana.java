package novenaParte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiPrimerVentana extends JFrame {
    private JTextField campoTexto;
    private JTextField campoPegado;
    private JButton copiarButton;
    private JButton limpiarButton;
    private JPanel panelPrincipal;

    public MiPrimerVentana(){
        super("Copiar y pegar");

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension tamañoPantalla = toolkit.getScreenSize();

        int altoPantalla = tamañoPantalla.height;
        int anchoPantalla = tamañoPantalla.width;

        setBounds(anchoPantalla/2,altoPantalla/2,anchoPantalla/4,altoPantalla/4);
        setContentPane(panelPrincipal);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoPegado.setText(campoTexto.getText());
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
                campoPegado.setText("");
            }
        });
    }
}
