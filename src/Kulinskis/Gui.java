package Kulinskis;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Gui {
    static void createGui() {
        JFrame logs = new JFrame("Automašīnas");
        logs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logs.setSize(600, 750);
        ImageIcon ikona = new ImageIcon("src/car.png");
        logs.setIconImage(ikona.getImage());
        logs.setResizable(false);
        logs.setLocationRelativeTo(null);

        JLabel title = new JLabel("Izvēlies darbību", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBounds(150, 20, 300, 30);
        logs.add(title);

        JPanel pogasPanel1 = new JPanel();
        JPanel pogasPanel2 = new JPanel();
        JPanel pogasPanel3 = new JPanel();

        pogasPanel1.setBorder(BorderFactory.createTitledBorder("LEFT"));
        pogasPanel2.setBorder(BorderFactory.createTitledBorder("CENTER"));
        pogasPanel3.setBorder(BorderFactory.createTitledBorder("RIGHT"));

        BoxLayout layout1 = new BoxLayout(pogasPanel1, BoxLayout.Y_AXIS);
        BoxLayout layout2 = new BoxLayout(pogasPanel2, BoxLayout.Y_AXIS);
        BoxLayout layout3 = new BoxLayout(pogasPanel3, BoxLayout.Y_AXIS);
        pogasPanel1.setLayout(layout1);
        pogasPanel2.setLayout(layout2);
        pogasPanel3.setLayout(layout3);

        JButton poga1 = new JButton("Izveidot automašīnas objektu ar esošiem objektiem");
        poga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga1.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArObjektiem.izveidotObjektu());

        JButton poga2 = new JButton("Izveidot automašīnas objektu no jauna");
        poga2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga2.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArObjektiem.izveidotObjektu());

        poga1.setAlignmentX(Component.LEFT_ALIGNMENT);
        poga2.setAlignmentX(Component.LEFT_ALIGNMENT);
        pogasPanel1.add(poga1);
        pogasPanel1.add(poga2);

        JButton poga3 = new JButton("Saglabāt automašīnas objektu failā");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        JButton poga4 = new JButton("Saglabāt automašīnas objektu failā");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        poga3.setAlignmentX(Component.CENTER_ALIGNMENT);
        poga4.setAlignmentX(Component.CENTER_ALIGNMENT);
        pogasPanel2.add(poga3);
        pogasPanel2.add(poga4);

        JButton poga5 = new JButton("Saglabāt automašīnas objektu failā");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        JButton poga6 = new JButton("Saglabāt automašīnas objektu failā");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        poga5.setAlignmentX(Component.RIGHT_ALIGNMENT);
        poga6.setAlignmentX(Component.RIGHT_ALIGNMENT);
        pogasPanel3.add(poga5);
        pogasPanel3.add(poga6);

        logs.setLayout(new FlowLayout());
        logs.add(pogasPanel1);
        logs.add(pogasPanel2);
        logs.add(pogasPanel3);

        logs.pack();
        logs.setVisible(true);
    }
}
