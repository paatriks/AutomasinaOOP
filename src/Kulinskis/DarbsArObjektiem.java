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

        if (ievade == null) return;


        StringBuilder rezultats = new StringBuilder();
        switch (ievade) {
            case "Automašīnas":
                if (automasinas.isEmpty()) {
                    rezultats.append("Nav neviena automašīna.\n");
                } else {
                    for (Automasina masina : automasinas) {
                        rezultats.append(masina.razotajs).append(" ").append(masina.modelis).append("\n");
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
        String[] izvele = {"Automašīnu", "Riteni", "Ātrumkārbu", "Stūri", "Motoru"};
        String[] autoSaraksts = new String[automasinas.size()];

        String ievade = (String) JOptionPane.showInputDialog(null, "Kuru objektu vēlies dzēst?", "Objektu dzēšana", JOptionPane.QUESTION_MESSAGE, null, izvele, izvele[0]);
        if (ievade == null) return;

        switch (ievade) {
            case "Automašīnu":
                if (automasinas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens automašīnas objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                for (int i = 0; i < automasinas.size(); i++) {
                    autoSaraksts[i] = automasinas.get(i).razotajs + " " + automasinas.get(i).modelis;
                }
                String dzestAuto = (String) JOptionPane.showInputDialog(null, "Kuru automašīnu vēlies dzēst no saraksta?", "Automašīnu dzēšana",
                        JOptionPane.QUESTION_MESSAGE, null,autoSaraksts, autoSaraksts[0]);
                if (dzestAuto == null) return;

                for (int i = 0; i < automasinas.size(); i++) {
                    Automasina m = automasinas.get(i);
                    if ((m.razotajs + " " + m.modelis).equals(dzestAuto)) {
                        automasinas.remove(i);
                        JOptionPane.showMessageDialog(null, "Automašīna tika izdzēsta no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                break;

            case "Riteni":
                dzObjektu(riteni);
                break;

            case "Ātrumkārbu":
                dzObjektu(atrumkarbas);
                break;

            case "Stūri":
                dzObjektu(stures);
                break;

            case "Motoru":
                dzObjektu(motori);
                break;
        }
    }

    static <T> void dzObjektu(ArrayList<T> objekts) {
        if (objekts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nav izveidots neviens šīs klases objekts!", "Kļūda",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        String[] objektaIzvele = new String[objekts.size()];

        for (int i = 0; i < objekts.size(); i++) {
            objektaIzvele[i] = objekts.get(i).toString();
        }
        String dzestObjektu = (String) JOptionPane.showInputDialog(null, "Kuru objektu no saraksta vēlies dzēst?", "Objektu dzēšana",
                JOptionPane.QUESTION_MESSAGE, null, objektaIzvele, objektaIzvele[0]);

        if (dzestObjektu == null) return;

        for (int i = 0; i < objekts.size(); i++) {
            if (objekts.get(i).toString().equals(dzestObjektu)) {
                objekts.remove(i);
                JOptionPane.showMessageDialog(null, "Objekts tika izdzēsts no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
}
