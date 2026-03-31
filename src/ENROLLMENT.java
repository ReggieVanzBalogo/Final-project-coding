import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ENROLLMENT extends JFrame{
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JButton showEnrollmentButton;
    private JButton proceedToCourseButton;
    private JPanel MainPanel;

    public ENROLLMENT() {
        setContentPane(MainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(450,300);
        setTitle("Enrollment Form");
        setVisible(true);



        showEnrollmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t1.getText();
                String name = t2.getText();
                String email = t3.getText();
                String program = t4.getText();
                String year = t5.getText();

                JOptionPane.showMessageDialog(ENROLLMENT.this,"STUDENT ID:" + id + "\n" + "NAME:" + name + "\n"
                + "EMAIL:" + email + "\n" +"PROGRAM" + program + "\n" + "YEAR LEVEL:" + year     );
            }
        });



        proceedToCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new COURSE();
            }
        });

    }

    static void main() {
        new ENROLLMENT();
    }
}
