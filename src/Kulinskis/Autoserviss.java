package Kulinskis;

public class Autoserviss {
    public static void main(String[] args) {

        String[] darbibuSaraksts = {"Izveidot jaunu automašīnas objektu", "Izveidot motora objektu", "Izveidot jaunu ātrumkārbas objektu", "Izveidot jaunu riteņa objektu",
        "Izveidot jaunu stūres objektu", "Saglabāt failā", "Dzēst objektu no saraksta", "Aplūkot objektus", "Izsaukt metodi uz objektu", "Aizvērt"};


        Atrumkarba atrumkarba = new Atrumkarba("automats", 5);
        DarbsArObjektiem.atrumkarbas.add(atrumkarba);
        Motors motors = new Motors(3.0, 240, 6, "benzīns", false);
        DarbsArObjektiem.motori.add(motors);
        Ritenis ritenis = new Ritenis(18, 35, "Vasaras", "Sailun");
        DarbsArObjektiem.riteni.add(ritenis);
        Sture sture = new Sture("Gumija", true, false, 8, 30);
        DarbsArObjektiem.stures.add(sture);
        Automasina masina = new Automasina(motors, ritenis, sture, atrumkarba, 55, 2400, "Chrysler", "300C");
        DarbsArObjektiem.automasinas.add(masina);
        masina.ritenis.pumpetRiepas();

    }
}

