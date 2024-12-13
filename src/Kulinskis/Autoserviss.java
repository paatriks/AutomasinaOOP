package Kulinskis;

public class Autoserviss {
    public static void main(String[] args) {

        String[] darbibuSaraksts = {"Izveidot jaunu automašīnas objektu", "Izveidot motora objektu", "Izveidot jaunu ātrumkārbas objektu", "Izveidot jaunu riteņa objektu",
        "Izveidot jaunu stūres objektu", "Saglabāt failā", "Dzēst objektu no saraksta", "Aplūkot objektus", "Izsaukt metodi uz objektu", "Aizvērt"};


        Atrumkarba atrumkarba = new Atrumkarba("automats", 5);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba);
        Motors motors = new Motors(4.0, 660, 8, "benzīns", false);
        DarbsArObjektiem.motori.add(motors);
        Ritenis ritenis = new Ritenis(21, 45, "Vasaras", "Pirelli");
        DarbsArObjektiem.riteni.add(ritenis);
        Sture sture = new Sture("Gumija", true, true, 10, 30);
        DarbsArObjektiem.stures.add(sture);
        Automasina masina = new Automasina(motors, ritenis, sture, atrumkarba, 100, 1700, "Ferarri", "256");
        DarbsArObjektiem.automasinas.add(masina);
        masina.masinasInfo();
        masina.ritenis.samazinatSpiedienu();
        masina.ritenis.parbauditSpiedienu();
        masina.ritenis.parbauditSpiedienu();
        masina.motors.paterins();
        masina.motors.pielaistVaiNoslapetMotoru();
        masina.sture.sturet();

        Atrumkarba atrumkarba1 = new Atrumkarba("manual", 6);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba1);
        Motors motors1 = new Motors(2.4, 150, 4, "benzīns", true);
        DarbsArObjektiem.motori.add(motors1);
        Ritenis ritenis1 = new Ritenis(17, 40, "Ziemas", "Michelin");
        DarbsArObjektiem.riteni.add(ritenis1);
        Sture sture1 = new Sture("Gumija", false, false, 4, 30);
        DarbsArObjektiem.stures.add(sture1);
        Automasina masina1 = new Automasina(motors1, ritenis1, sture1, atrumkarba1, 34, 1840, "Toyota", "Supra");
        DarbsArObjektiem.automasinas.add(masina1);
        masina1.masinasInfo();
        masina1.motors.parbauditStavokli();
        masina1.atrumkarba.palielinatAtrumu();


    }
}

