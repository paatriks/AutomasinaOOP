package Kulinskis;

import javax.swing.*;

public class Sture {
    private String materials;
    private boolean irApsilde, irRegulejama;
    private int poguSkaits, diametrs;

    public Sture(String materials, boolean irApsilde, boolean irRegulejama, int poguSkaits, int diametrs) {
        this.materials = materials;
        this.irApsilde = irApsilde;
        this.irRegulejama = irRegulejama;
        this.poguSkaits = poguSkaits;
        this.diametrs = diametrs;
    }

    public void sturet() {
        String[] opcijas = {"pa labi", "pa kreisi"};
        String ievade = (String) JOptionPane.showInputDialog(null, "Stūrēsi pa labi vai pa kreisi?", "Virziens", JOptionPane.QUESTION_MESSAGE, null, opcijas, opcijas[0]);
        if (ievade != null && !ievade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tu izvēlējies stūrēt pa " + ievade, "Virziens", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void nospiestPogu () {
        int skaitlis = 0;
        do {
            String ievade = JOptionPane.showInputDialog(null, "Kuru pogu spiedīsi? (nr.)", "Nospiest pogu", JOptionPane.QUESTION_MESSAGE);

            try {
                skaitlis = Integer.parseInt(ievade);
                if (skaitlis < 1 || skaitlis > poguSkaits) JOptionPane.showMessageDialog(null, "Tāda poga nav!", "Kļuda", JOptionPane.ERROR_MESSAGE);
                else JOptionPane.showMessageDialog(null, "Tu nospiedi " + skaitlis + ". pogu uz stūres", "Poga", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīta pareiza poga", "Kļūda", JOptionPane.ERROR_MESSAGE);
            }
        } while (skaitlis < 1 || skaitlis > poguSkaits);

    }

    public void sturesInfo() {
        JOptionPane.showMessageDialog(null, "Stūres materiāls: " + materials + "\n" + "Stūres diametrs: " + diametrs + " cm" + "\n"
                + "Stūres pogu skaits: " + poguSkaits + "\n" + "Stūre ir regulējama: " + (irRegulejama ? "Jā" : "Nē") + "\n"
                + "Stūrei ir apsilde: " + (irApsilde ? "Jā" : "Nē") + "\n", "Atribūti", JOptionPane.INFORMATION_MESSAGE);
    }
}
