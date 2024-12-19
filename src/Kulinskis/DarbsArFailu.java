package Kulinskis;

import javax.swing.*;
import java.io.*;

public class DarbsArFailu {
    static void saglabatFaila(Automasina obj) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("automasinas.txt", true));

            writer.write("Automašīnas ražotājs: " + obj.razotajs + "\n" + "Automašīnas modelis: " + obj.modelis + "\n" + "Automašīnas motors: " + obj.motors + "\n" + "Automašīnas ritenis: " + obj.ritenis + "\n"
                    + "Automašīnas stūre: " + obj.sture + "\n" + "Automašīnas ātrumkārba: " + obj.atrumkarba + "\n" + "Automašīnas ātrums: " + obj.atrums + " km/h" + "\n"
                    + "Automašīnas svars: " + obj.svars + " kg\n");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Radās kļūda, strādājot ar failu", "Kļūda", JOptionPane.ERROR_MESSAGE);
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
