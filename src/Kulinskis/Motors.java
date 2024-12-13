package Kulinskis;

import javax.swing.*;

public class Motors {
    private double motoraTilpums;
    private int motoraJauda, cilindri;
    private String motoraVeids;
    private boolean pielaists;

    public Motors(double motoraTilpums, int motoraJauda, int cilindri, String motoraVeids, boolean pielaists) {
        this.motoraTilpums = motoraTilpums;
        this.motoraJauda = motoraJauda;
        this.cilindri = cilindri;
        this.motoraVeids = motoraVeids;
        this.pielaists = pielaists;
    }

    public void pielaistVaiNoslapetMotoru() {
        int choice = JOptionPane.showOptionDialog(null,"Tu vēlies pielaist vai noslāpēt motoru?","Pielaist vai noslāpēt", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Pielaist", "Noslāpēt"},"default");

        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Motors ir pielaists!", "Motors ir pielaists", JOptionPane.INFORMATION_MESSAGE);
            this.pielaists = true;

        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Motors ir noslāpēts!", "Motors ir noslāpēts", JOptionPane.INFORMATION_MESSAGE);
            this.pielaists = false;

        } else {
            JOptionPane.showMessageDialog(null, "Nekas netika izvēlēts!", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void parbauditStavokli() {
        if (pielaists) JOptionPane.showMessageDialog(null, "Motors rūc", "Motors ir pielaists", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Motors nerūc", "Motors ir noslāpēts", JOptionPane.INFORMATION_MESSAGE);
    }

    public void paterins () {
        if (motoraVeids.equalsIgnoreCase("benzīns")) JOptionPane.showMessageDialog(null,"Tava auto patēriņs ir 20L", "Motora patēriņs", JOptionPane.INFORMATION_MESSAGE);
        else if (motoraVeids.equalsIgnoreCase("dīzelis")) JOptionPane.showMessageDialog(null,"Tava auto patēriņs ir 15L", "Motora patēriņs", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null,"Tava auto patēriņs ir 0L, iespējams tas ir elektroauto", "Motora patēriņs", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return "Motors (tilpums: " + motoraTilpums + "L, jauda: " + motoraJauda + " ZS, cilindri: " + cilindri + ", motora veids: " + motoraVeids + ", motors ir pielaists: "
                + (pielaists ? "Jā" : "Nē") + ")";
    }

}
