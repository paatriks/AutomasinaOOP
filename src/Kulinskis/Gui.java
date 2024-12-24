package Kulinskis;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Gui {
     static void createGui() {
        JFrame logs = new JFrame("Automašīnas");
        logs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logs.setSize(650, 400);
        ImageIcon ikona = new ImageIcon("src/car.png");
        logs.setIconImage(ikona.getImage());
        logs.setResizable(false);
        logs.setLocationRelativeTo(null);
        logs.setLayout(new BorderLayout(0, 20));

        JLabel title = new JLabel("Izvēlies darbību", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBorder(new EmptyBorder(15, 0, 0, 0));
        logs.add(title, BorderLayout.NORTH);

        ImageIcon icon = new ImageIcon("src/bilde.png");
        Image scaleImage = icon.getImage().getScaledInstance(135, 135, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);
        JLabel bilde = new JLabel(scaledIcon, SwingConstants.CENTER);
        logs.add(bilde, BorderLayout.SOUTH);

        JPanel pogasPanel1 = new JPanel();
        JPanel pogasPanel2 = new JPanel();
        JPanel panel = new JPanel(new FlowLayout());
        pogasPanel2.setPreferredSize(new Dimension(300, 138));

        pogasPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2),"Saglabāt vai dzēst objektus"));
        pogasPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.lightGray, 2),"Apskatīt, izveidot vai izsaukt metodi uz objekta"));

        pogasPanel1.setLayout(new GridLayout(3, 1,0 , 6));
        pogasPanel2.setLayout(new GridLayout(3, 1,0 , 6));

        JButton poga1 = new JButton("Saglabāt automašīnas objektu failā");
        poga1.setBackground(Color.LIGHT_GRAY);
        poga1.setForeground(Color.BLACK);
        poga1.setToolTipText("Saglabā objektu teksta failā");
        poga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga1.setMargin(new Insets(6, 10, 6, 10));
        poga1.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());

        JButton poga2 = new JButton("Apskatīt faila saturu");
        poga2.setBackground(Color.LIGHT_GRAY);
        poga2.setForeground(Color.BLACK);
        poga2.setToolTipText("Apskatīt teksta faila saturu");
        poga2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga2.setMargin(new Insets(6, 10, 6, 10));
        poga2.setFocusPainted(false);
        poga2.addActionListener(e -> DarbsArFailu.apskatitFailu());

        JButton poga3 = new JButton("Dzēst izveidotos objektus no saraksta");
        poga3.setBackground(Color.LIGHT_GRAY);
        poga3.setForeground(Color.BLACK);
        poga3.setToolTipText("Dzēst izveidotu objektu no ArrayList");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setMargin(new Insets(6, 10, 6, 10));
        poga3.setFocusPainted(false);
        poga3.addActionListener(e -> DarbsArObjektiem.dzestObjektus());

        pogasPanel1.add(poga1);
        pogasPanel1.add(poga2);
        pogasPanel1.add(poga3);

        JButton poga4 = new JButton("Apskatīt izveidotos objektus");
        poga4.setBackground(Color.LIGHT_GRAY);
        poga4.setForeground(Color.BLACK);
        poga4.setToolTipText("Apskatīt izveidotos objektus no ArrayList");
        poga4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga4.setMargin(new Insets(6, 10, 6, 10));
        poga4.setFocusPainted(false);
        poga4.addActionListener(e -> DarbsArObjektiem.apskatitObjektus());

        JButton poga5 = new JButton("Izveidot automašīnas objektu no jauna");
        poga5.setBackground(Color.LIGHT_GRAY);
        poga5.setForeground(Color.BLACK);
        poga5.setToolTipText("Izveidot automašīnas objektu no ātrumkārbas, motora, riteņa, stūres objektiem");
        poga5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga5.setMargin(new Insets(6, 10, 6, 10));
        poga5.setFocusPainted(false);
        poga5.setMargin(new Insets(6, 10, 6, 10));
        poga5.addActionListener(e -> DarbsArObjektiem.izveidotObjektu());

        JButton poga6 = new JButton("Izsaukt metodi uz objekta");
        poga6.setBackground(Color.LIGHT_GRAY);
        poga6.setForeground(Color.BLACK);
        poga6.setToolTipText("Izsaukt metodi uz automašīnas, riteņa, stūres, motora vai ātrumkārbas objekta");
        poga6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga6.setMargin(new Insets(6, 10, 6, 10));
        poga6.setFocusPainted(false);
        poga6.addActionListener(e -> DarbsArObjektiem.izsauktMetodi());

        pogasPanel2.add(poga4);
        pogasPanel2.add(poga5);
        pogasPanel2.add(poga6);

        panel.add(pogasPanel1);
        panel.add(pogasPanel2);
        logs.add(panel, BorderLayout.CENTER);
        logs.setVisible(true);
    }
}
