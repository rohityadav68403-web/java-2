
import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5;

    Calculator() {

        setTitle("Simple Calculator");
        setSize(420, 350);
        setLayout(null);

        l1 = new Label("First No.");
        l2 = new Label("Second No.");
        l3 = new Label("Result");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mult");
        b4 = new Button("Div");
        b5 = new Button("Cancel");

        l1.setBounds(50, 70, 100, 30);
        l2.setBounds(50, 120, 100, 30);
        l3.setBounds(50, 170, 100, 30);

        t1.setBounds(180, 70, 150, 30);
        t2.setBounds(180, 120, 150, 30);
        t3.setBounds(180, 170, 150, 30);

        b1.setBounds(20, 240, 65, 30);
        b2.setBounds(95, 240, 65, 30);
        b3.setBounds(170, 240, 65, 30);
        b4.setBounds(245, 240, 65, 30);
        b5.setBounds(320, 240, 65, 30);

        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b5) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }

        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());

            if (e.getSource() == b1) {
                t3.setText(String.valueOf(a + b));
            }
            else if (e.getSource() == b2) {
                t3.setText(String.valueOf(a - b));
            }
            else if (e.getSource() == b3) {
                t3.setText(String.valueOf(a * b));
            }
            else if (e.getSource() == b4) {
                if (b == 0) {
                    t3.setText("Cannot divide by zero");
                }
                else {
                    t3.setText(String.valueOf(a / b));
                }
            }

        }
        catch (NumberFormatException ex) {
            t3.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
