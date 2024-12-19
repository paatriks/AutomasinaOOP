package Kulinskis;

import javax.swing.*;
import java.awt.*;

public class Gui {
    static void createGui() {
        JFrame logs = new JFrame("Automašīnas");
        logs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logs.setSize(600, 450);
        ImageIcon ikona = new ImageIcon("src/car.png");
        logs.setIconImage(ikona.getImage());
        logs.setLayout(new BorderLayout());
        logs.setResizable(false);
        logs.setLocationRelativeTo(null);

        JLabel title = new JLabel("Izvēlies darbību", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        logs.add(title, BorderLayout.NORTH);

        JPanel pogasPanel = new JPanel();
        pogasPanel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton poga1 = new JButton("Izveidot automašīnas objektu ar esošiem objektiem");
        poga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga1.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArObjektiem.izveidotObjektu());
        pogasPanel.add(poga1);

        JButton poga2 = new JButton("Izveidot automašīnas objektu no jauna");
        poga2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga2.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArObjektiem.izveidotObjektu());
        pogasPanel.add(poga2);

        JButton poga3 = new JButton("Saglabāt automašīnas objektu failā");
        poga3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        poga3.setFocusPainted(false);
        poga1.addActionListener(e -> DarbsArFailu.saglabatFaila());
        pogasPanel.add(poga3);

        logs.add(pogasPanel, BorderLayout.CENTER);
        logs.setVisible(true);
    }
}
