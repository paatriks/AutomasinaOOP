package Kulinskis;

import javax.swing.*;

public class Atrumkarba {
    private String veids;
    private int kopaAtrumi;
    private int pasreizejaisAtrums;

    public Atrumkarba(String veids, int kopaAtrumi) {
        this.veids = veids;
        this.kopaAtrumi = kopaAtrumi;
        this.pasreizejaisAtrums = 1;
    }

    public void nomainitAtrumu() {
        String ievade;
        int atrums;
        while (true) {
            ievade = JOptionPane.showInputDialog(null, "Kurā ātrumā liksi?", "Ātruma nomaiņa", JOptionPane.INFORMATION_MESSAGE);

            try {
                atrums = Integer.parseInt(ievade);
                if (atrums> 0 && atrums <= kopaAtrumi) {
                    pasreizejaisAtrums = atrums;
                    JOptionPane.showMessageDialog(null, "Tavs pašreizējais ātrums ir nomainīts uz: " + pasreizejaisAtrums, "Ātruma maiņa", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Tavējai ātrumkārbai nav " + atrums + ". ātrums", "Kļūda", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void palielinatAtrumu() {
        if (pasreizejaisAtrums < kopaAtrumi) {
            pasreizejaisAtrums++;
            JOptionPane.showMessageDialog(null, "Ātrums palielināts par 1, tagad tu esi " + pasreizejaisAtrums + ". ātrumā");
        } else {
            JOptionPane.showMessageDialog(null, "Jau esi lielākajā ātrumā", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void samazinatAtrumu() {
        if (pasreizejaisAtrums > 1) {
            pasreizejaisAtrums--;
            JOptionPane.showMessageDialog(null, "Ātrums samazināts par 1, tagad tu esi " + pasreizejaisAtrums + ". ātrumā");

        } else {
            JOptionPane.showMessageDialog(null, "Jau esi mazākajā ātrumā", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atrumkarbasInfo() {
        JOptionPane.showMessageDialog(null, "Ātrumkārbas veids: " + veids + "\n" + "Ātrumkārbai ir: " + kopaAtrumi + " ātrumi " + "\n"
                + "Pašreiz automašīna brauc: " + pasreizejaisAtrums + ". ātrumā" + "\n", "Atribūti", JOptionPane.INFORMATION_MESSAGE);
    }
}
