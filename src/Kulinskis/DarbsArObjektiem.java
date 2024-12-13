package Kulinskis;

import javax.swing.*;
import java.util.ArrayList;

public class DarbsArObjektiem {
    static ArrayList<Atrumkarba> atrumkarbas = new ArrayList<>();
    static ArrayList<Automasina> automasinas = new ArrayList<>();
    static ArrayList<Motors> motori = new ArrayList<>();
    static ArrayList<Ritenis> riteni = new ArrayList<>();
    static ArrayList<Sture> stures = new ArrayList<>();

    static void apskatitObjektus() {
        String[] objekti = {"Automašīnas", "Motorus", "Stūres", "Ātrumkārbas", "Riteņus"};
        String ievade = (String) JOptionPane.showInputDialog(null, "Kurus objektus vēlies apskatīties?",
                "Apskatīt objektus", JOptionPane.QUESTION_MESSAGE, null, objekti, objekti[0]);

        if (ievade == null) {
            return;
        }

        StringBuilder rezultats = new StringBuilder();
        switch (ievade) {
            case "Automašīnas":
                if (automasinas.isEmpty()) {
                    rezultats.append("Nav neviena automašīna.\n");
                } else {
                    for (Automasina masina : automasinas) {
                        rezultats.append(masina).append("\n");
                    }
                }
                break;
            case "Motorus":
                if (motori.isEmpty()) {
                    rezultats.append("Nav neviena motora.\n");
                } else {
                    for (Motors motors : motori) {
                        rezultats.append(motors).append("\n");
                    }
                }
                break;
            case "Stūres":
                if (stures.isEmpty()) {
                    rezultats.append("Nav nevienas stūres.\n");
                } else {
                    for (Sture sture : stures) {
                        rezultats.append(sture).append("\n");
                    }
                }
                break;
            case "Ātrumkārbas":
                if (atrumkarbas.isEmpty()) {
                    rezultats.append("Nav nevienas ātrumkārbas.\n");
                } else {
                    for (Atrumkarba atrumkarba : atrumkarbas) {
                        rezultats.append(atrumkarba).append("\n");
                    }
                }
                break;
            case "Riteņus":
                if (riteni.isEmpty()) {
                    rezultats.append("Nav neviena riteņa.\n");
                } else {
                    for (Ritenis ritenis : riteni) {
                        rezultats.append(ritenis).append("\n");
                    }
                }
                break;
            default:
                rezultats.append("Nezināms objekta veids.\n");
                break;
        }

        JOptionPane.showMessageDialog(null, rezultats, "Objektu saraksts", JOptionPane.INFORMATION_MESSAGE);
    }

    static void dzestObjektus() {

    }
}
