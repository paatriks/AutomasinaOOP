package Kulinskis;

import javax.swing.*;

public class Ritenis {
    private int diametrs, spiediens;
    private String riepasTips, riepuRazotajs;
    private boolean jaunsRitenis;

    public Ritenis(int diametrs, int spiediens, String riepasTips, String riepuRazotajs) {
        this.diametrs = diametrs;
        this.spiediens = spiediens;
        this.riepasTips = riepasTips;
        this.riepuRazotajs = riepuRazotajs;
        this.jaunsRitenis = false;
    }

    public void pumpetRiepas() {
        String ievade;
        int skaitlis;

        while (true) {
            ievade = JOptionPane.showInputDialog(null, "Par cik psi palielināsi spiedienu riepās?", "Piepumpēt riepas", JOptionPane.QUESTION_MESSAGE);

            try {
                 skaitlis = Integer.parseInt(ievade);
                int jaunsSpiediens =  this.spiediens + skaitlis;
                if (jaunsSpiediens > 50 || jaunsSpiediens < 20 || skaitlis < 1) {
                        JOptionPane.showMessageDialog(null, "Riepās būs pārāk augsts spiediens", "Bīstami", JOptionPane.WARNING_MESSAGE);
                }

                else {
                    this.spiediens = jaunsSpiediens;
                    JOptionPane.showMessageDialog(null, "Spiediens riepās tika paaugstināts līdz " + this.spiediens + "  psi", "Riepu spiediens", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void samazinatSpiedienu() {
        String ievade;
        int skaitlis;

        while (true) {
            ievade = JOptionPane.showInputDialog(null, "Par cik psi samazināsi spiedienu riepās?", "Samazināt spiedienu", JOptionPane.QUESTION_MESSAGE);

            try {
                skaitlis = Integer.parseInt(ievade);
                int jaunsSpiediens =  this.spiediens - skaitlis;
                if (jaunsSpiediens < 20 || skaitlis < 1) {
                    JOptionPane.showMessageDialog(null, "Riepās būs pārāk zems spiediens", "Bīstami", JOptionPane.WARNING_MESSAGE);
                }

                else {
                    this.spiediens = jaunsSpiediens;
                    JOptionPane.showMessageDialog(null, "Spiediens riepās tika samazināts līdz " + this.spiediens + "  psi", "Riepu spiediens", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void parbauditSpiedienu () {
        JOptionPane.showMessageDialog(null, "Spiediens riepās ir " + this.spiediens, "Spiediens riepās", JOptionPane.INFORMATION_MESSAGE);
    }

    public void nomainitRiteni () {
        int choice = JOptionPane.showOptionDialog(null,"Vai vēlies nomainīt riteni?","Nomainīt riteni", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Jā", "Nē"},"default");

        if (choice == 0) {
            int skaitlis = 0;
            do {
                String ievade = JOptionPane.showInputDialog(null, "Cik riteņus mainīsi?", "Riteņu maiņa", JOptionPane.QUESTION_MESSAGE);
                try {
                    skaitlis = Integer.parseInt(ievade);
                    if (skaitlis < 0 || skaitlis > 4)
                        JOptionPane.showMessageDialog(null, "Ievadi derīgu riteņu skaitu!", "Kļūda", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis");
                }

            } while (skaitlis < 1 || skaitlis > 4);

            switch (skaitlis) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Tika nomainīts 1 ritenis", "Ritenis nomainīts", JOptionPane.INFORMATION_MESSAGE);
                    this.jaunsRitenis = true;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Tika nomainīti 2 riteņi", "Riteņi nomainīti", JOptionPane.INFORMATION_MESSAGE);
                    this.jaunsRitenis = true;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Tika nomainīti 3 riteņi", "Riteņi nomainīti", JOptionPane.INFORMATION_MESSAGE);
                    this.jaunsRitenis = true;
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Tika nomainīti 4 riteņi", "Riteņi nomainīti", JOptionPane.INFORMATION_MESSAGE);
                    this.jaunsRitenis = true;
                    break;
            }

        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "Tu izvēlējies nemainīt nevienu riteni!", "Riteņu maiņa", JOptionPane.WARNING_MESSAGE);
            this.jaunsRitenis = false;

        } else {
            JOptionPane.showMessageDialog(null, "Nekas netika izvēlēts!", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ritenaInfo() {
        JOptionPane.showMessageDialog(null, "Riteņa diametrs: " + diametrs + "\n" + "Riteņu spiediens: " + spiediens + "\n"
                + "Automašīnas riepu tips: " + riepasTips + "\n" + "Riepu ražotājs: " + riepuRazotajs + "\n"
                + "Automašīnai ir tikuši nomainīti riteņi: " + (jaunsRitenis ? "Jā" : "Nē") + "\n", "Atribūti", JOptionPane.INFORMATION_MESSAGE);
    }
}
