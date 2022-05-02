package zadanieDrugie.Ptaki;

public class Seagull {
    private double rozmiar;
    private double predkosc;


    public void setPredkosc(double predkosc) {
        this.predkosc = predkosc;
    }

    public Seagull (double rozmiar, double predkosc){
        this.rozmiar= rozmiar;
        this.predkosc=predkosc;
    }

    public Seagull(){
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public double getPredkosc() {
        return predkosc;
    }

}
