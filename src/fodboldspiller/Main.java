package fodboldspiller;

import fodboldspiller.Fodboldspiller;

public class Main {
    public static void main(String[] args) {
        Fodboldspiller spiller1 = new Fodboldspiller("lionel", "Messi",
                "Inter Miami CF", 1.7, 72);

        System.out.println(spiller1.getFornavn() + " " + spiller1.getEfternavn());
        System.out.println(spiller1.getHøjde());
        System.out.println(spiller1.getVægt());
        System.out.println(spiller1.getKlub());

        Fodboldspiller spiller2 = new Fodboldspiller("Christiano", "Ronaldo",
                "Al-nasr", 1.87, 83);

        System.out.println("\n" + spiller2.getFornavn() + " " + spiller2.getEfternavn());
        System.out.println(spiller2.getHøjde());
        System.out.println(spiller2.getVægt());
        System.out.println(spiller2.getKlub());

        Fodboldspiller spiller3 = new Fodboldspiller("Neymar", "da Silva Santos Júnior",
                "Al-Hilal", 1.75, 68);
        System.out.println("\n" + spiller3.getFornavn() + " " + spiller3.getEfternavn());
        System.out.println(spiller3.getHøjde());
        System.out.println(spiller3.getVægt());
        System.out.println(spiller3.getKlub());

        Fodboldspiller[] hold = {spiller1, spiller2, spiller3};

        Hold dreamTeam = new Hold("FCDreamTeam");
        Fodboldspiller[] spillere = dreamTeam.getHold();
        /*Fodboldspiller[] hold = new Fodboldspiller[3];
        hold[0] = spiller1;
        hold[1] = spiller2;
        hold[2] = spiller3;*/

        for (Fodboldspiller : spiller : hold) {
            if (spiller1.getEfternavn().equals("Messi")){
                System.out.println("Messi er på holdet!");
            }
            boolean erFunder = dreamTeam.findSpiller("Lionel");
            if (erFundet == true){
                System.out.println(navn + " er på holdet ");
            }
            else {
            System.out.println("Desværre ikke fundet");
        }
    }
    }