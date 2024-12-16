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
        String[] autoAtrumkarbas = new String[atrumkarbas.size()];
        String[] autoStures = new String[stures.size()];
        String[] autoMotori= new String[motori.size()];
        String[] autoRiteni = new String[riteni.size()];

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
                if (riteni.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens riteņa objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                for (int i = 0; i < riteni.size(); i++) {
                    autoRiteni[i] = riteni.get(i).toString();
                }
                String dzestRiteni = (String) JOptionPane.showInputDialog(null, "Kuru riteni vēlies dzēst no saraksta?", "Riteņu dzēšana",
                        JOptionPane.QUESTION_MESSAGE, null, autoRiteni, autoRiteni[0]);
                if (dzestRiteni == null) return;

                for (int i = 0; i < riteni.size(); i++) {
                    if (riteni.get(i).toString().equals(dzestRiteni)) {
                        riteni.remove(i);
                        JOptionPane.showMessageDialog(null, "Ritenis tika izdzēsta no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                break;

            case "Ātrumkārbu":
                if (atrumkarbas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens ātrumkārbas objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                for (int i = 0; i < atrumkarbas.size(); i++) {
                    autoAtrumkarbas[i] = atrumkarbas.get(i).toString();
                }
                String dzestAtrumkarbu = (String) JOptionPane.showInputDialog(null, "Kuru ātrumkārbu vēlies dzēst no saraksta?", "Ātrumkārbas dzēšana",
                        JOptionPane.QUESTION_MESSAGE, null,autoAtrumkarbas, autoAtrumkarbas[0]);
                if (dzestAtrumkarbu == null) return;

                for (int i = 0; i < atrumkarbas.size(); i++) {
                    if (atrumkarbas.get(i).toString().equals(dzestAtrumkarbu)) {
                        atrumkarbas.remove(i);
                        JOptionPane.showMessageDialog(null, "Ātrumkārba tika izdzēsta no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                break;

            case "Stūri":
                if (stures.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens stūres objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                for (int i = 0; i < stures.size(); i++) {
                    autoStures[i] = stures.get(i).toString();
                }
                String dzestSturi = (String) JOptionPane.showInputDialog(null, "Kuru stūri vēlies dzēst no saraksta?", "Stūres dzēšana",
                        JOptionPane.QUESTION_MESSAGE, null, autoStures, autoStures[0]);
                if (dzestSturi == null) return;

                for (int i = 0; i < stures.size(); i++) {
                    if (stures.get(i).toString().equals(dzestSturi)) {
                        stures.remove(i);
                        JOptionPane.showMessageDialog(null, "Stūre tika izdzēsta no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                break;

            case "Motoru":
                if (motori.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens motora objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                for (int i = 0; i < motori.size(); i++) {
                    autoMotori[i] = motori.get(i).toString();
                }
                String dzestMotoru = (String) JOptionPane.showInputDialog(null, "Kuru motoru vēlies dzēst no saraksta?", "Motora dzēšana",
                        JOptionPane.QUESTION_MESSAGE, null, autoMotori, autoMotori[0]);
                if (dzestMotoru == null) return;

                for (int i = 0; i < motori.size(); i++) {
                    if (motori.get(i).toString().equals(dzestMotoru)) {
                        motori.remove(i);
                        JOptionPane.showMessageDialog(null, "Motors tika izdzēsta no saraksta", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                break;
        }
    }
}
