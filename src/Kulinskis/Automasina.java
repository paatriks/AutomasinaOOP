package Kulinskis;

import javax.swing.*;

public class Automasina {
    public Motors motors;
    public Ritenis ritenis;
    public Sture sture;
    public int atrums, svars;
    public String razotajs, modelis;

    public Automasina(Motors motors, Ritenis ritenis, Sture sture, int atrums, int svars, String razotajs, String modelis) {
        this.motors = motors;
        this.ritenis = ritenis;
        this.sture = sture;
        this.atrums = atrums;
        this.svars = svars;
        this.razotajs = razotajs;
        this.modelis = modelis;
    }

    public Automasina() {
        motors = new Motors(virknesParbaude());
        ritenis = new Ritenis(virknesParbaude());
        sture = new Sture(virknesParbaude());
    }

    public void spiestGazi() {
        String ievade;
        int skaitlis;

        while (true) {
            ievade = JOptionPane.showInputDialog(null, "Par cik km/h gribi palielināt ātrumu?", "Ātruma palielināšana", JOptionPane.INFORMATION_MESSAGE);

            try {
                skaitlis = Integer.parseInt(ievade);
                int jaunsAtrums =  atrums + skaitlis;
                if (jaunsAtrums > 110) {
                    JOptionPane.showMessageDialog(null, "Latvijā maksimālais atļautais braukšanas ātrums nedrīkst pārsniegt 110 km/h", "Sods", JOptionPane.WARNING_MESSAGE);
                }

                else {
                    atrums = jaunsAtrums;
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
