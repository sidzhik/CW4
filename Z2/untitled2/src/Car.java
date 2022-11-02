import javax.swing.*;

public class Car {
    private String model, marka, kolor;
    private int rok, cena, ilosc;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void delivery(int ilosc){
        this.ilosc = this.ilosc + ilosc;
    }

    public void sell(int ilosc){
        this.ilosc = this.ilosc - ilosc;
    }

    public String toString(){

        String MODEL = "MODEL: " + model + "\n";
        String MARKA = "MARKA: " + marka + "\n";
        String KOLOR = "KOLOR: " + kolor + "\n";
        String ROK = "ROK: " + rok + "\n";
        String ILOSC = "ILOSC: " + ilosc + "\n";
        String CENA = "CENA: " + cena + "\n";
        String WYNIK = MARKA + MODEL + KOLOR + ROK + ILOSC + CENA;
        return WYNIK;
    }


    public Car(String marka, String model, String kolor, int rok, int cena, int ilosc) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rok = rok;
        this.cena = cena;
        this.ilosc = ilosc;
    }
}
