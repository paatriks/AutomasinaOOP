package Kulinskis;

import javax.swing.*;
import java.util.ArrayList;

public class Autoserviss {
    static ArrayList<Atrumkarba> atrumkarbas = new ArrayList<>();
    static ArrayList<Automasina> automasinas = new ArrayList<>();
    static ArrayList<Motors> motori = new ArrayList<>();
    static ArrayList<Ritenis> riteni = new ArrayList<>();
    static ArrayList<Sture> stures = new ArrayList<>();
    public static void main(String[] args) {

        String[] darbibuSaraksts = {"Izveidot jaunu automašīnas objektu", "Izveidot motora objektu", "Izveidot jaunu ātrumkārbas objektu", "Izveidot jaunu riteņa objektu",
        "Izveidot jaunu stūres objektu", "Saglabāt failā", "Dzēst objektu no saraksta", "Aplūkot objektus", "Izsaukt metodi uz objektu", "Aizvērt"};


        Atrumkarba atrumkarba = new Atrumkarba("automats", 5);
        atrumkarbas.add(atrumkarba);
        Motors motors = new Motors(3.0, 240, 6, "benzīns", false);
        motori.add(motors);
        Ritenis ritenis = new Ritenis(18, 35, "Vasaras", "Sailun");
        riteni.add(ritenis);
        Sture sture = new Sture("Gumija", true, false, 8, 30);
        stures.add(sture);
        Automasina masina = new Automasina(motors, ritenis, sture, atrumkarba, 55, 2400, "Chrysler", "300C");
        automasinas.add(masina);
        masina.ritenis.pumpetRiepas();

    }

    static void dzestObjektu() {
        String[] masinas = new String[automasinas.size()];
        String[] atrumKarbas = new String[atrumkarbas.size()];
        String[] moTori = new String[motori.size()];
        String[] riTeni = new String[riteni.size()];
        String[] sTures = new String[stures.size()];
        // nepaspeju pabeigt programmu, gribēju uztaisīt lai var izdzēst objektus. Mājās izdarīšu pacīnīšos.
    }

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

        JOptionPane.showMessageDialog(null, rezultats.toString(), "Objektu saraksts", JOptionPane.INFORMATION_MESSAGE);
    }

}

