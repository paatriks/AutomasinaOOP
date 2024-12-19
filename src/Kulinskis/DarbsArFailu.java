package Kulinskis;

import javax.swing.*;
import java.io.*;

public class DarbsArFailu {
    static void saglabatFaila() {

        if (DarbsArObjektiem.automasinas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nav izveidots neviens automašīnas objekts!", "Kļūda",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        String[] autoSaraksts = new String[DarbsArObjektiem.automasinas.size()];

        for (int i = 0; i < DarbsArObjektiem.automasinas.size(); i++) {
            autoSaraksts[i] = DarbsArObjektiem.automasinas.get(i).razotajs + " " + DarbsArObjektiem.automasinas.get(i).modelis;
        }
        String saglabatAuto = (String) JOptionPane.showInputDialog(null, "Kuru automašīnu vēlies saglabāt failā?", "Automašīnu saglabāšana failā",
                JOptionPane.QUESTION_MESSAGE, null,autoSaraksts, autoSaraksts[0]);
        if (saglabatAuto == null) return;

        for (Automasina m : DarbsArObjektiem.automasinas) {
            if ((m.razotajs + " " + m.modelis).equals(saglabatAuto)) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("automasinas.txt", true));

                    writer.write("Automašīnas ražotājs: " + m.razotajs + "\n" + "Automašīnas modelis: " + m.modelis + "\n" + "Automašīnas motors: " + m.motors + "\n" + "Automašīnas ritenis: " + m.ritenis + "\n"
                            + "Automašīnas stūre: " + m.sture + "\n" + "Automašīnas ātrumkārba: " + m.atrumkarba + "\n" + "Automašīnas ātrums: " + m.atrums + " km/h" + "\n"
                            + "Automašīnas svars: " + m.svars + " kg\n");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Automašīnas objekts tika saglabāts failā automasinas.txt", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Radās kļūda, strādājot ar failu", "Kļūda", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    static void apskatitFailu() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("automasinas.txt"));
            StringBuilder teksts = new StringBuilder();
            String rinda;
            while ((rinda = reader.readLine()) != null) {
                teksts.append(rinda).append("\n");
            }
            reader.close();
            JOptionPane.showMessageDialog(null, teksts, "Faila saturs", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Radās kļūda, strādājot ar failu", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }
}
