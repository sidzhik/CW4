import java.util.Scanner;
public class RectangleArea {
    private double x, y, wynik;

    public void pobiranieDanych(){
        Scanner in = new Scanner(System.in);
        System.out.print("Wpisz dlugosc 1 boku: ");
        x = in.nextDouble();
        System.out.print("Wpisz dlugosc 2 boku: ");
        y = in.nextDouble();
    }

    public void oblicaniePola(){
        this.wynik = x * y;
    }

    public void wyswietlaniePola(){
        System.out.println("Pole prostokata: " + wynik);
    }

}
