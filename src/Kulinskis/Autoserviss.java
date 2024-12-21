package Kulinskis;

public class Autoserviss {
    public static void main(String[] args) {

        Atrumkarba atrumkarba = new Atrumkarba("automats", 8);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba);
        Motors motors = new Motors(6.0, 900, 12, "benzīns", false);
        DarbsArObjektiem.motori.add(motors);
        Ritenis ritenis = new Ritenis(21, 30, "Ziemas", "Continental");
        DarbsArObjektiem.riteni.add(ritenis);
        Sture sture = new Sture("Gumija", true, true, 10, 30);
        DarbsArObjektiem.stures.add(sture);
        Automasina masina = new Automasina(motors, ritenis, sture, atrumkarba, 105, 2100, "Buggati", "Chiron");
        DarbsArObjektiem.automasinas.add(masina);
        //masina.masinasInfo();

        Atrumkarba atrumkarba1 = new Atrumkarba("manual", 6);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba1);
        Motors motors1 = new Motors(2.0, 150, 4, "dīzelis", true);
        DarbsArObjektiem.motori.add(motors1);
        Ritenis ritenis1 = new Ritenis(17, 40, "Vissezonas", "Sailun");
        DarbsArObjektiem.riteni.add(ritenis1);
        Sture sture1 = new Sture("Gumija", false, false, 4, 30);
        DarbsArObjektiem.stures.add(sture1);
        Automasina masina1 = new Automasina(motors1, ritenis1, sture1, atrumkarba1, 34, 1840, "BMW", "320D");
        DarbsArObjektiem.automasinas.add(masina1);
        //masina1.masinasInfo();

        Atrumkarba atrumkarba2 = new Atrumkarba("manual", 5);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba2);
        Motors motors2 = new Motors(1.6, 122, 4, "benzīns", true);
        DarbsArObjektiem.motori.add(motors2);
        Ritenis ritenis2 = new Ritenis(16, 40, "Vissezonas", "Michelin");
        DarbsArObjektiem.riteni.add(ritenis2);
        Sture sture2 = new Sture("Gumija", false, false, 4, 30);
        DarbsArObjektiem.stures.add(sture2);
        Automasina masina2 = new Automasina(motors2, ritenis2, sture2, atrumkarba2, 56, 1570, "Mini", "Cooper");
        DarbsArObjektiem.automasinas.add(masina2);
        //masina2.masinasInfo();

        String[] darbibuSaraksts = {"Izveidot jaunu automašīnas objektu", "Izveidot motora objektu", "Izveidot jaunu ātrumkārbas objektu", "Izveidot jaunu riteņa objektu",
                "Izveidot jaunu stūres objektu", "Saglabāt failā", "Dzēst objektu no saraksta", "Aplūkot objektus", "Izsaukt metodi uz objektu", "Aizvērt"};


        Gui.createGui();

    }
}

