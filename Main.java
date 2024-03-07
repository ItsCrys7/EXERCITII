
public class Main {
    public static void main (String[] args) {

        Sertar sertar = new Sertar(1,2,3);
        sertar.tiparesteSertar();

        Sertar s1 = new Sertar(5,3,2);
        Sertar s2 = new Sertar(4,2,6);
        Birou birou = new Birou(10,10,10,s1,s2);
        birou.tiparesteBirou();
    }
}