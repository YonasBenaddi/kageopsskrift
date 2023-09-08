package person;

public class Person {
    private String navn; //this.navn
    private int alder; //this.alder
    private double højde;
    private double vægt;

    private final int MINIMUMS_ALDER = 0;

    public Person(String navn, int alder, double højde, double vægt){
        this.navn = navn;
        this.alder = alder;
        this.højde = højde;
        this.vægt = vægt;
    }
    public Person(double højde, double vægt) {
        this.navn = "";
        this.alder = 0;
        this.højde = højde;
        this.vægt = vægt;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder(){
        return alder;
    }
    public void setAlder(int alder){
        this.alder = alder;

        if ( alder > MINIMUMS_ALDER ){
            this.alder = alder;
        }
    }

    //servicemetode
    public double bmi(){
        //return vægt / (højde * højde); nedenstående svarer til det samme - nedenstående
        // hedder en statisk metode
        return vægt / Math.pow(højde,2);
    }

    public String toString(){
        //metoden kaldes implicit i print sætninger
        return "Navn: " + navn + " " + "Alder: " + alder +
                " højde: " + højde + " Vægt: " + vægt;
    }
}
