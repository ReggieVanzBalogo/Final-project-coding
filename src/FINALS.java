import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FINALS extends JFrame {
    private JPanel MainPanel;
    private JButton finishButton;


    public FINALS() {
        setContentPane(MainPanel);
        setTitle("REGISTRATION CONFIRMATION");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JOptionPane.showMessageDialog(FINALS.this,
                "REGISTRATION CONFIRMATION\n\n" +
                        "Status: SUCCESSFUL\n" +
                        "Thank you for registering!");

        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(FINALS.this, "System Closed!");
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new FINALS();
    }
}
