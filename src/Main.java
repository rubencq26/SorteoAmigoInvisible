import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> participantes = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int rep = -1;
        int numPar = 0;
        int part;
        int aceptar = 0;
        String nombre;
        System.out.println("Amigo invisible");
         do{
            System.out.println("Ingrese el numero de participantes: ");
            numPar = scanner.nextInt();
            scanner.nextLine();
        }while(numPar < 1 );

        for(int i=0; i<numPar; i++){
            System.out.println("Ingrese el nombre del participante nº " + (i + 1) +": ");
            nombre = scanner.nextLine();
            participantes.add(nombre);
        }

        ArrayList<String> amigos = new ArrayList(participantes);
        System.out.println("Comienza el Sorteo, pulse Enter para continuar: ");
        scanner.nextLine();

        for(int i = 0; i < numPar; i++){
            do {
                System.out.println("Turno de " + amigos.get(i));
                System.out.println("Para hacer aparecer a quien te toca regalar pulse Enter: ");
                scanner.nextLine();
                part = (int) (Math.random() * participantes.size());
                System.out.println("Te toca ser el amigo invisible de: "+ participantes.get(part) );
                System.out.println("1. Aceptar\n2. Rechazar(te toco a ti mismo)\nElige una opcion: ");
                aceptar = scanner.nextInt();
                scanner.nextLine();
                if(aceptar == 2){
                    rep = part;
                }
                if(participantes.size() ==  1 && aceptar == 2){
                    System.out.println("A ocurrido un error, queda un participante y solo falta su turno, reinicien la eleccion");
                    break;
                }

                for(int j=0; j<50; j++){
                    System.out.println("⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆");
                    System.out.println("⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿");
                    System.out.println("⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉\n");
                }
            }while(aceptar == 2 || part == rep);
                participantes.remove(part);
                rep = -1;
        }
        System.out.println("Fin del Sorteo");
    }
}