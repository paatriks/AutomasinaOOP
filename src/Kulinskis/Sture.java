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
        int choice = JOptionPane.showOptionDialog(null,"Uz kuru pusi stūrēsi?","Stūrēt", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Pa labi", "Pa kreisi"},"default");
        if (choice == 0) JOptionPane.showMessageDialog(null, "Tu stūrē pa labi", "Stūrēšana", JOptionPane.INFORMATION_MESSAGE);
        else if (choice == 1) JOptionPane.showMessageDialog(null, "Tu stūrē pa kreisi", "Stūrēšana", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Nekas netika izvēlēts!", "Kļūda", JOptionPane.ERROR_MESSAGE);
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

    @Override
    public String toString() {
        return "Stūre (materiāls: " + materials + ", diametrs: " + diametrs + "cm" + ", pogu skaits: " + poguSkaits + ", stūre ir regulējama: " + (irRegulejama ? "Jā" : "Nē") +
                ", stūrei ir apsilde: " + (irApsilde ? "Jā" : "Nē") + ")";
    }
}
