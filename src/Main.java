public class Main {

    public static void ejercicioIf() {
        int numerolf = 3;

        if (numerolf > 0) {
            System.out.println("it's positive!");

        } else if (numerolf < 0) {
            System.out.println("it's negative!");

        } else {
            System.out.println("it's 0!");

        }

    }

    public static void ejercicioWhile() {
        int numberWhile = -10;

        while (numberWhile < 3) {
            System.out.println(numberWhile);
            numberWhile = numberWhile + 1;
        }
    }

    public static void ejercicioDoWhile() {
        int numberWhile = -10;

        do {
            System.out.println(numberWhile);
            numberWhile = numberWhile + 1;
        } while (numberWhile < 3);
    }

    public static void ejercicioFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }
    }

    public static void ejercicioSwitch() {
        var estacion = "invierno";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;

            case "invierno":
                System.out.println("es invierno");
                break;

            case "otoño":
                System.out.println("es otoño");
                break;

            case "primavera":
                System.out.println("es primavera");
                break;

            default:
                System.out.println(estacion);

        }
    }


public static void main(String[] args) {

        ejercicioIf();

        ejercicioWhile();

        ejercicioDoWhile();

        ejercicioFor();

        ejercicioSwitch();

        }
}