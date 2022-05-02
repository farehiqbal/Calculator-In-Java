import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JPanel panel;

    JButton[] numButtons = new JButton[10];

    JButton addButton, subButton, mulButton, divButton, decButton, equButton;
    JButton aButton, bButton, cButton, dButton, eButton, fButton;
    JButton clrButton;

    Font font= new Font("Courier", Font.BOLD, 20);


    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550 );
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        //frame.setBackground(Color.GRAY);
        frame.setLayout(null);
        
        textfield = new JTextField();
        textfield.setEditable(true);
        textfield.setBounds(50,25,300,50);
        textfield.setBorder(null);
        textfield.setVisible(true);
        textfield.setBackground(Color.DARK_GRAY);
        textfield.setForeground(Color.WHITE);
        textfield.setFont(font);


        addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");

        aButton = new JButton("A");
        bButton = new JButton("B");
        cButton = new JButton("C");
        dButton = new JButton("D");
        eButton = new JButton("E");
        fButton = new JButton("F");
        clrButton = new JButton("⌫");

        addButton.setBackground(Color.DARK_GRAY);
        subButton.setBackground(Color.DARK_GRAY);
        mulButton.setBackground(Color.DARK_GRAY);
        divButton.setBackground(Color.DARK_GRAY);
        decButton.setBackground(Color.DARK_GRAY);
        equButton.setBackground(Color.DARK_GRAY);

        aButton.setBackground(Color.DARK_GRAY);
        bButton.setBackground(Color.DARK_GRAY);
        cButton.setBackground(Color.DARK_GRAY);
        dButton.setBackground(Color.DARK_GRAY);
        eButton.setBackground(Color.DARK_GRAY);
        fButton.setBackground(Color.DARK_GRAY);
        clrButton.setBackground(Color.DARK_GRAY);
        equButton.setBackground(Color.DARK_GRAY);

        addButton.setForeground(Color.WHITE);
        subButton.setForeground(Color.WHITE);
        mulButton.setForeground(Color.WHITE);
        divButton.setForeground(Color.WHITE);
        decButton.setForeground(Color.WHITE);
        equButton.setForeground(Color.WHITE);

        aButton.setForeground(Color.WHITE);
        bButton.setForeground(Color.WHITE);
        cButton.setForeground(Color.WHITE);
        dButton.setForeground(Color.WHITE);
        eButton.setForeground(Color.WHITE);
        fButton.setForeground(Color.WHITE);
        clrButton.setForeground(Color.WHITE);
        equButton.setForeground(Color.WHITE);


        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(font);
            numButtons[i].setFocusable(false);
            numButtons[i].setBackground(Color.DARK_GRAY);
            numButtons[i].setForeground(Color.WHITE);
            //numButtons[i].setBorder(null);
        
        }


        panel = new JPanel();
        panel.setBounds(5,100,370,420);
        panel.setLayout(new GridLayout(4,5,-1,-1));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(null);
        panel.setForeground(Color.WHITE);



        // adding elements to panel
        panel.add(aButton);
        panel.add(numButtons[1]);
		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
        panel.add(clrButton);
        panel.add(bButton);
		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);
		panel.add(mulButton);
        panel.add(cButton);
		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);
		panel.add(subButton);
        panel.add(dButton);
		panel.add(decButton);
		panel.add(numButtons[0]);
		panel.add(equButton);
		panel.add(divButton);



        //adding elements to frame

        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
        


    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // creating object 

    }

    @Override
    public void actionPerformed(ActionEvent e){
        // adding action listeners here.
    }

}
