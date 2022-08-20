public class Main {
    public static void main(String[] args){
        //Ejercicio If
        int numberIf = 3;

        if (numberIf > 0) {
            System.out.println("Es un número Positivo");
        } else if (numberIf == 0) {
            System.out.println("Es un número 0");
        }else {
            System.out.println("Es un número Negativo");
        }

        //Ejercicio While
        int numberWhile = 0;

        while (numberWhile < 3){
            System.out.println("Imprime por While " + numberWhile);
            numberWhile = numberWhile +1;
        }
        //Ejercicio Do While
        do{
            System.out.println("Imprime por Do While " + numberWhile);
            numberWhile = numberWhile +1;
        } while (numberWhile < 3);

        //Ejercicio For
        for (int numberFor = 0 ; numberFor <=3 ; numberFor = numberFor + 1){
            System.out.println("Imprime por bucle for " + numberFor);
        }

        //Ejercicio Switch
        var estacion = "agosto";

        switch (estacion){
            case "verano":
            System.out.println("Estamos en Verano");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("No has colocado una estación");
        }
    }
}
