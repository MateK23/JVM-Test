package SnakeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeGUI implements ActionListener {

    private JPanel mainPanel;
    private JButton upButton;
    private JButton downButton;
    private JButton leftButton;
    private JButton rightButton;
    private JLabel scoreLabel;
    private JLabel foodPosLabel;
    private JButton restartButton;
    private JButton aButton;
    private JButton aButton1;
    private JButton aButton2;
    private JButton aButton3;
    private JButton aButton4;
    private JButton aButton5;
    private JButton aButton6;
    private JButton aButton7;
    private JButton aButton8;
    private JButton aButton9;
    private JButton aButton10;
    private JButton aButton11;
    private JButton aButton12;
    private JButton aButton13;
    private JButton aButton14;
    private JButton aButton15;
    private JButton aButton16;
    private JButton aButton17;
    private JButton aButton18;
    private JButton aButton19;
    private JButton aButton20;
    private JButton aButton21;
    private JButton aButton22;
    private JButton aButton23;
    private JButton aButton24;
    private JButton aButton25;
    private JButton aButton26;
    private JButton aButton27;
    private JButton aButton28;
    private JButton aButton29;
    private JButton aButton30;
    private JButton aButton31;
    private JButton aButton32;
    private JButton aButton33;
    private JButton aButton34;
    private JButton aButton35;
    private JButton aButton36;
    private JButton aButton37;
    private JButton aButton38;
    private JButton aButton39;
    private JButton aButton40;
    private JButton aButton41;
    private JButton aButton42;
    private JButton aButton43;
    private JButton aButton44;
    private JButton aButton45;
    private JButton aButton46;
    private JButton aButton47;
    private JButton aButton48;
    private JButton aButton49;
    private JButton aButton50;
    private JButton aButton51;
    private JButton aButton52;
    private JButton aButton53;
    private JButton aButton54;
    private JButton aButton55;
    private JButton aButton56;
    private JButton aButton57;
    private JButton aButton58;
    private JButton aButton59;
    private JButton aButton60;
    private JButton aButton61;
    private JButton aButton62;
    private JButton aButton63;
    private JButton aButton64;
    private JButton aButton65;
    private JButton aButton66;
    private JButton aButton67;
    private JButton aButton68;
    private JButton aButton69;
    private JButton aButton70;
    private JButton aButton71;
    private JButton aButton72;
    private JButton aButton73;
    private JButton aButton74;
    private JButton aButton75;
    private JButton aButton76;
    private JButton aButton77;
    private JButton aButton78;
    private JButton aButton79;
    private JButton aButton80;
    private JButton aButton81;
    private JButton aButton82;
    private JButton aButton83;
    private JButton aButton84;
    private JButton aButton85;
    private JButton aButton86;
    private JButton aButton87;
    private JButton aButton88;
    private JButton aButton89;
    private JButton aButton90;
    private JButton aButton91;
    private JButton aButton92;
    private JButton aButton93;
    private JButton aButton94;
    private JButton aButton95;
    private JButton aButton96;
    private JButton aButton97;
    private JButton aButton98;
    private JButton aButton99;


    public SnakeGUI() {
        JFrame frame = new JFrame();


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        // mainPanel.setLayout(new GridLayout(10, 10));

        upButton.addActionListener(this);
        downButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);

        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
