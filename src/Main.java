import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pozitiv = 0;
        int negativ = 0;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int numar=scanner.nextInt();

            if (numar>0){
                pozitiv++;
                System.out.println("Numarul introdus este: " + numar + " care e pozitiv");
            } if (numar<0){
                negativ++;
                System.out.println("Numarul introdus este: " + numar + " care e negativ");
            }
            suma = suma + numar;
            if (numar==0){
                System.out.println("Iesire");
                break;
            }
        }
        System.out.println("Suma este: " + suma);
        System.out.println("Numere pozitive sunt: " + pozitiv);
        System.out.println("Numere negative sunt: " + negativ);
    }
    }



