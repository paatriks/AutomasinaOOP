package Kulinskis;

import javax.swing.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.regex.Pattern;

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
                dzest(riteni);
                break;

            case "Ātrumkārbu":
                dzest(atrumkarbas);
                break;

            case "Stūri":
                dzest(stures);
                break;

            case "Motoru":
                dzest(motori);
                break;
        }
    }

    static <T> void dzest(ArrayList<T> objekts) {
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

    static void izveidotObjektu() {
        String[] izvele = {"Ātrumkārbu", "Motoru", "Riteni", "Stūri", "Automašīnu"};

        String ievade = null;
        do {
            ievade = (String) JOptionPane.showInputDialog(null, "Kuru objektu veidosi?", "Objektu izveide", JOptionPane.QUESTION_MESSAGE,
                    null, izvele, izvele[0]);

            switch (ievade) {
                case "Ātrumkārbu":
                    String veids;
                    int kopaAtrumi;

                    veids = virknesParbaude("Norādi ātrumkārbas veidu", "Manuālā");
                    kopaAtrumi = skaitlaParbaude("Norādi ātrumu skaitu", 1, 8);

                    Atrumkarba atrumkarba = new Atrumkarba(veids, kopaAtrumi);
                    atrumkarbas.add(atrumkarba);

                    JOptionPane.showMessageDialog(null, "Ātrumkārbas objekts veiksmīgi izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Motoru":
                    double motoraTilpums;
                    int motoraJauda, cilindri;
                    String motoraVeids;
                    boolean pielaists;

                    motoraTilpums = skaitlaParbaude("Norādi motora tilpumu (litri)", 0.5, 6.0);
                    motoraJauda = skaitlaParbaude("Norādi motora jaudu (ZS)", 50, 1500);
                    cilindri = skaitlaParbaude("Norādi cilindru skaitu", 3, 16);
                    motoraVeids = virknesParbaude("Norādi motora veidu (benzīns vai dīzelis)", "benzīns");
                    pielaists = irVaiNav("Vai motors ir pielaists?", "Jā");

                    Motors motors = new Motors(motoraTilpums, motoraJauda, cilindri, motoraVeids, pielaists);
                    motori.add(motors);

                    JOptionPane.showMessageDialog(null, "Motora objekts veiksmīgi izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Riteni":
                    int diametrs, spiediens;
                    String riepasTips, riepuRazotajs;

                    diametrs = skaitlaParbaude("Norādi riteņa diametru (collas)", 15, 22);
                    spiediens = skaitlaParbaude("Norādi rieapas spiedienu (psi)", 20, 50);
                    riepasTips = virknesParbaude("Norādi riepas tipu (vasaras, ziemas vai vissezonas)", "ziemas");
                    riepuRazotajs = virknesParbaude("Norādi riepas ražotāju", "Michelin");

                    Ritenis ritenis = new Ritenis(diametrs, spiediens, riepasTips, riepuRazotajs);
                    riteni.add(ritenis);

                    JOptionPane.showMessageDialog(null, "Riteņa objekts veiksmīgi izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Stūri":
                    String materials;
                    boolean irApsilde, irRegulejama;
                    int poguSkaits, sturesDiametrs;

                    materials = virknesParbaude("Norādi stūres materiālu", "Poliuretāns");
                    irApsilde = irVaiNav("Vai stūrei ir apsilde?", "Jā");
                    irRegulejama = irVaiNav("Vai stūre ir regulējama?", "Jā");
                    poguSkaits = skaitlaParbaude("Norādi pogu skaitu uz stūres", 2, 15);
                    sturesDiametrs = skaitlaParbaude("Norādi stūres diametru (cm)", 35, 45);

                    Sture sture = new Sture(materials, irApsilde, irRegulejama, poguSkaits, sturesDiametrs);
                    stures.add(sture);

                    JOptionPane.showMessageDialog(null, "Stūres objekts veiksmīgi izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "Automašīnu":

                    if (atrumkarbas.isEmpty() || motori.isEmpty() || riteni.isEmpty() || stures.isEmpty()) {
                        ArrayList<String> autodetalas = new ArrayList<>();

                        if (atrumkarbas.isEmpty()) autodetalas.add("Ātrumkārba");
                        if (motori.isEmpty()) autodetalas.add("Motors");
                        if (riteni.isEmpty()) autodetalas.add("Ritenis");
                        if (stures.isEmpty()) autodetalas.add("Stūre");

                        String missing = String.join(", ", autodetalas);

                        JOptionPane.showMessageDialog(null, "Nevar izveidot automašīnu! Trūkst sekojošās detaļas: " + missing, "Trūkst detaļas", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int atrums, svars;
                    String razotajs, modelis;
                    Motors autoMotors = motori.getLast();
                    Ritenis autoRitenis = riteni.getLast();
                    Sture autoSture = stures.getLast();
                    Atrumkarba autoAtrumkarba = atrumkarbas.getLast();

                    atrums = skaitlaParbaude("Norādi automašīnas ātrumu (km/h)", 1, 110);
                    svars = skaitlaParbaude("Norādi automašīnas svaru (kg)", 1000, 9000);
                    razotajs = virknesParbaude("Norādi automašīnas ražotāju", "Audi");
                    modelis = autoModelaParbaude("Norādi automašīnas modeli", "A6");

                    Automasina masina = new Automasina(autoMotors, autoRitenis, autoSture, autoAtrumkarba, atrums, svars, razotajs, modelis);
                    automasinas.add(masina);

                    JOptionPane.showMessageDialog(null, "Automašīnas objekts veiksmīgi izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (!ievade.equals("Automašīnu"));
    }

    static String virknesParbaude(String zinojums, String noklusejuma) {
        String virkne;
        do {
            virkne = JOptionPane.showInputDialog(zinojums, noklusejuma);

            if (virkne == null) return null;
            virkne = virkne.trim();

        } while (!Pattern.matches("^[a-zA-ZāčēģīķļņšūžĀČĢĪĶĻŅŠŪŽ]+$", virkne));
        return virkne;
    }

    static String autoModelaParbaude(String zinojums, String noklusejuma) {
        String virkne;
        do {
            virkne = JOptionPane.showInputDialog(zinojums, noklusejuma);

            if (virkne == null) return null;
            virkne = virkne.trim();

        } while (!Pattern.matches("^[a-zA-ZāčēģīķļņšūžĀČĢĪĶĻŅŠŪŽ0-9]+$", virkne));
        return virkne;
    }

    static int skaitlaParbaude(String zinojums, int min, int max) {
        String ievade;
        int skaitlis;

        while (true) {
            ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);

            if (ievade == null) return -1;

            try {
                skaitlis = Integer.parseInt(ievade);
                if (skaitlis < min || skaitlis > max) continue;
                return skaitlis;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    static double skaitlaParbaude(String zinojums, double min, double max) {
        String ievade;
        double skaitlis;

        while (true) {
            ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);

            if (ievade == null) return -1;

            try {
                skaitlis = Double.parseDouble(ievade);
                if (skaitlis < min || skaitlis > max) continue;
                return skaitlis;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Netika ievadīts skaitlis!", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static boolean irVaiNav(String zinojums, String noklusejuma) {
        String atbilde;
        boolean javaine;
        do {
            atbilde = JOptionPane.showInputDialog(null, zinojums, noklusejuma);

            if (atbilde.equalsIgnoreCase("Jā")) javaine = true;
            else javaine = false;

        } while (!atbilde.equalsIgnoreCase("Jā") && !atbilde.equalsIgnoreCase("Nē"));
        return javaine;
    }

    static void izsauktMetodi() {
        String[] izvele = {"Automašīnas objekta", "Ātrumkārbas objekta", "Motora objekta", "Riteņa objekta", "Stūres objekta"};

        String ievade = (String) JOptionPane.showInputDialog(null, "Uz kura objekta vēlies izsaukt metodi?", "Metodes izsaukšana",
                JOptionPane.QUESTION_MESSAGE, null, izvele, izvele[0]);

        if (ievade == null) return;

        switch (ievade) {
            case "Automašīnas objekta":
                if (automasinas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens automašīnas objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] autoSaraksts = new String[automasinas.size()];

                for (int i = 0; i < automasinas.size(); i++) {
                    autoSaraksts[i] = automasinas.get(i).razotajs + " " + automasinas.get(i).modelis;
                }
                String izveliesAuto = (String) JOptionPane.showInputDialog(null, "Uz kuru automašīnas objektu vēlies izsaukt metodi?", "Izvēlies automašīnu",
                        JOptionPane.QUESTION_MESSAGE, null,autoSaraksts, autoSaraksts[0]);
                if (izveliesAuto == null) break;

                for (Automasina m : automasinas) {
                    if ((m.razotajs + " " + m.modelis).equals(izveliesAuto)) {
                        String[] autoMetodes = {"Spiest gāzi", "Apskatīt automašīnas info"};
                        String metodesIzvele = (String) JOptionPane.showInputDialog(null, "Kuru metodi vēlies izsaukt?", "Metožu izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, autoMetodes, autoMetodes[0]);
                        if (metodesIzvele == null) break;

                        switch (metodesIzvele) {
                            case "Spiest gāzi":
                                m.spiestGazi();
                                break;
                            case "Apskatīt automašīnas info":
                                m.masinasInfo();
                                break;
                        }
                    }
                }
                break;

            case "Ātrumkārbas objekta":
                if (atrumkarbas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens ātrumkārbas objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] autoAtrumkarbas = new String[atrumkarbas.size()];

                for (int i = 0; i < atrumkarbas.size(); i++) {
                    autoAtrumkarbas[i] = atrumkarbas.get(i).toString();
                }
                String izveliesAtrumkarbu = (String) JOptionPane.showInputDialog(null, "Uz kuru ātrumkārbas objektu vēlies izsaukt metodi?", "Izvēlies ātrumkārbu",
                        JOptionPane.QUESTION_MESSAGE, null,autoAtrumkarbas, autoAtrumkarbas[0]);
                if (izveliesAtrumkarbu == null) break;

                for (Atrumkarba k : atrumkarbas) {
                    if ((k.toString().equals(izveliesAtrumkarbu))) {
                        String[] atrumkarbuMetodes = {"Nomainīt ātrumu", "Palielināt ātrumnu", "Samazināt ātrumu", "Apskatīt ātrumkārbas info"};
                        String metodesIzvele = (String) JOptionPane.showInputDialog(null, "Kuru metodi vēlies izsaukt?", "Metožu izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, atrumkarbuMetodes, atrumkarbuMetodes[0]);
                        if (metodesIzvele == null) break;

                        switch (metodesIzvele) {
                            case "Nomainīt ātrumu":
                                k.nomainitAtrumu();
                                break;
                            case "Palielināt ātrumnu":
                                k.palielinatAtrumu();
                                break;
                            case "Samazināt ātrumu":
                                k.samazinatAtrumu();
                                break;
                            case "Apskatīt ātrumkārbas info":
                                JOptionPane.showMessageDialog(null, k.toString(), "Ātrumkārbas info", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                }
                break;

            case "Motora objekta":
                if (motori.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens motora objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] autoMotori = new String[motori.size()];

                for (int i = 0; i < motori.size(); i++) {
                    autoMotori[i] = motori.get(i).toString();
                }
                String izveliesMotoru = (String) JOptionPane.showInputDialog(null, "Uz kuru motora objektu vēlies izsaukt metodi?", "Izvēlies motoru",
                        JOptionPane.QUESTION_MESSAGE, null,autoMotori, autoMotori[0]);
                if (izveliesMotoru == null) break;

                for (Motors m : motori) {
                    if ((m.toString().equals(izveliesMotoru))) {
                        String[] motoraMetodes = {"Pielaist vai noslāpēt motoru", "Pārbaudīt vai motors ir pielaists", "Noskaidrot patēriņu", "Apskatīt motora info"};
                        String metodesIzvele = (String) JOptionPane.showInputDialog(null, "Kuru metodi vēlies izsaukt?", "Metožu izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, motoraMetodes, motoraMetodes[0]);
                        if (metodesIzvele == null) break;

                        switch (metodesIzvele) {
                            case "Pielaist vai noslāpēt motoru":
                                m.pielaistVaiNoslapetMotoru();
                                break;
                            case "Pārbaudīt vai motors ir pielaists":
                                m.parbauditStavokli();
                                break;
                            case "Noskaidrot patēriņu":
                                m.paterins();
                                break;
                            case "Apskatīt motora info":
                                JOptionPane.showMessageDialog(null, m.toString(), "Motora info", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                }
                break;

            case "Riteņa objekta":
                if (riteni.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens riteņa objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] autoRiteni = new String[riteni.size()];

                for (int i = 0; i < riteni.size(); i++) {
                    autoRiteni[i] = riteni.get(i).toString();
                }
                String izveliesRiteni = (String) JOptionPane.showInputDialog(null, "Uz kuru riteņa objektu vēlies izsaukt metodi?", "Izvēlies riteni",
                        JOptionPane.QUESTION_MESSAGE, null,autoRiteni, autoRiteni[0]);
                if (izveliesRiteni == null) break;

                for (Ritenis r : riteni) {
                    if ((r.toString().equals(izveliesRiteni))) {
                        String[] ritenaMetodes = {"Pumpēt riepas", "Samazināt spiedienu riepās", "Pārbaudīt spiedienu", "Nomainīt riteni", "Apskatīt riteņa info"};
                        String metodesIzvele = (String) JOptionPane.showInputDialog(null, "Kuru metodi vēlies izsaukt?", "Metožu izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, ritenaMetodes, ritenaMetodes[0]);
                        if (metodesIzvele == null) break;

                        switch (metodesIzvele) {
                            case "Pumpēt riepas":
                                r.pumpetRiepas();
                                break;
                            case "Samazināt spiedienu riepās":
                                r.samazinatSpiedienu();
                                break;
                            case "Pārbaudīt spiedienu":
                                r.parbauditSpiedienu();
                                break;
                            case "Nomainīt riteni" :
                                r.nomainitRiteni();
                                break;
                            case "Apskatīt riteņa info":
                                JOptionPane.showMessageDialog(null, r.toString(), "Riteņa info", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                }
                break;

            case "Stūres objekta":
                if (stures.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nav izveidots neviens stūres objekts!", "Kļūda",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] autoStures = new String[stures.size()];

                for (int i = 0; i < stures.size(); i++) {
                    autoStures[i] = stures.get(i).toString();
                }
                String izveliesSturi = (String) JOptionPane.showInputDialog(null, "Uz kuru stūres objektu vēlies izsaukt metodi?", "Izvēlies stūri",
                        JOptionPane.QUESTION_MESSAGE, null,autoStures, autoStures[0]);
                if (izveliesSturi == null) break;

                for (Sture s : stures) {
                    if ((s.toString().equals(izveliesSturi))) {
                        String[] sturesMetodes = {"Stūrēt", "Nospiest pogu uz stūres", "Apskatīt stūres info"};
                        String metodesIzvele = (String) JOptionPane.showInputDialog(null, "Kuru metodi vēlies izsaukt?", "Metožu izvēle",
                                JOptionPane.QUESTION_MESSAGE, null, sturesMetodes, sturesMetodes[0]);
                        if (metodesIzvele == null) break;

                        switch (metodesIzvele) {
                            case "Stūrēt":
                                s.sturet();
                                break;
                            case "Nospiest pogu uz stūres":
                                s.nospiestPogu();
                                break;
                            case "Apskatīt stūres info":
                                JOptionPane.showMessageDialog(null, s.toString(), "Stūres info", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                }
                break;

        }
    }
}
