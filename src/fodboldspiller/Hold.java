package fodboldspiller;

public class Hold {

    private Fodboldspiller[] hold;
    public Hold(String navn) {
        Fodboldspiller spiller1 = new Fodboldspiller("lionel", "Messi",
                "Inter Miami CF", 1.7, 72);
        Fodboldspiller spiller2 = new Fodboldspiller("Christiano", "Ronaldo",
                "Al-nasr", 1.87, 83);
        Fodboldspiller spiller3 = new Fodboldspiller("Neymar", "da Silva Santos Júnior",
                "Al-Hilal", 1.75, 68);
        Hold = new Fodboldspiller[]{spiller1, spiller2, spiller3};

    }

    public Fodboldspiller[] getHold(){
        return Hold;

    }
    public boolean findSpiller() {
        for (Fodboldspiller spiller : hold) {
            if (spiller.getEfternavn().equals(navn)
                    || spiller.getFornavn().equals(navn)) {
                System.out.println("Messi er på holdet");
                return true;
            }
        }
        return false;
    }
}
