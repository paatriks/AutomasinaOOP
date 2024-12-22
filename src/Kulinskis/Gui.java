package Kulinskis;

import javax.swing.*;
import java.awt.*;

public class Gui {
     static void createGui() {
        JFrame logs = new JFrame("Automašīnas");
        logs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logs.setSize(850, 350);
        ImageIcon ikona = new ImageIcon("src/car.png");
        logs.setIconImage(ikona.getImage());
        logs.setResizable(false);
        logs.setLocationRelativeTo(null);
        logs.setLayout(new BorderLayout(0, 20));

        JLabel title = new JLabel("Izvēlies darbību", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        logs.add(title, BorderLayout.NORTH);

        JPanel pogasPanel1 = new JPanel();
        JPanel pogasPanel2 = new JPanel();
        JPanel pogasPanel3 = new JPanel();
        JPanel panel = new JPanel(new FlowLayout());

        pogasPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2),"Strādāt ar failu"));
        pogasPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2),"Apskatīt vai dzēst objektus"));
        pogasPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2),"Izveidot automašīnas objektu"));

        pogasPanel1.setLayout(new GridLayout(2, 1,0 , 6));
        pogasPanel2.setLayout(new GridLayout(2, 1,0 , 6));
        pogasPanel3.setLayout(new GridLayout(2, 1,0 , 6));

        JButton poga1 = new JButton("Saglabāt automašīnas objektu failā");
        poga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga1.setMargin(new Insets(6, 10, 6, 10));
        poga1.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        JButton poga2 = new JButton("Apskatīt faila saturu");
        poga2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga2.setMargin(new Insets(6, 10, 6, 10));
        poga2.setFocusPainted(false);
        poga2.addActionListener(e -> DarbsArFailu.apskatitFailu());

        pogasPanel1.add(poga1);
        pogasPanel1.add(poga2);

        JButton poga3 = new JButton("Apskatīt izveidotos objektus");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setMargin(new Insets(6, 10, 6, 10));
        poga3.setFocusPainted(false);
        poga3.addActionListener(e -> DarbsArObjektiem.apskatitObjektus());

        JButton poga4 = new JButton("Dzēst izveidotos objektus");
        poga4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga4.setMargin(new Insets(6, 10, 6, 10));
        poga4.setFocusPainted(false);
        poga4.addActionListener(e -> DarbsArObjektiem.dzestObjektus());

        pogasPanel2.add(poga3);
        pogasPanel2.add(poga4);

        JButton poga5 = new JButton("Izveidot automašīnas objektu ar esošām detļām");
        poga5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga5.setMargin(new Insets(6, 10, 6, 10));
        poga5.setFocusPainted(false);
        poga5.addActionListener(e -> DarbsArFailu.saglabatFaila());

        JButton poga6 = new JButton("Izveidot automašīnas objektu no jauna");
        poga6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga6.setMargin(new Insets(6, 10, 6, 10));
        poga6.setFocusPainted(false);
        poga6.setMargin(new Insets(6, 10, 6, 10));
        poga6.addActionListener(e -> DarbsArFailu.saglabatFaila());

        pogasPanel3.add(poga5);
        pogasPanel3.add(poga6);

        panel.add(pogasPanel1);
        panel.add(pogasPanel2);
        panel.add(pogasPanel3);
        logs.add(panel, BorderLayout.CENTER);

        logs.setVisible(true);
    }
}
