package aula03;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.carga = 80;

        c1.tampar();

        c1.status();

        c1.rabiscar();


    }
}
