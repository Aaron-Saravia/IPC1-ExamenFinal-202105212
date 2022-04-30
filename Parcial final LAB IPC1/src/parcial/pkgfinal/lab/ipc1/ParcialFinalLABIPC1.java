/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial.pkgfinal.lab.ipc1;

import java.util.Scanner;

public class ParcialFinalLABIPC1 {

    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);

        int a;
        int b;
        int menu = 0;

        System.out.println("EXAMEN FINAL LABORATORIO DE IPC1F");

        while (menu != 4) {
            System.out.println("");
            System.out.println("Digite una opcion: ");

            System.out.println("       MENU:       ");
            System.out.println("-------------------");
            System.out.println("|1. Problema 1     |");
            System.out.println("|2. Problema 2     |");
            System.out.println("|3. Problema 3     |");
            System.out.println("|4. Salir          |");
            System.out.println("-------------------");
            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Ingrese un numero");
                    a = numero1.nextInt();

                    System.out.println("Ingrese un segundo numero");
                    b = numero2.nextInt();

                    if (a > b) {
                        System.out.println("El mayor es: " + a);
                        System.out.println("El menor es: " + b);
                    } else {
                        System.out.println("El mayor es: " + b);
                        System.out.println("El menor es: " + a);
                    }
                    break;
                case 2:
                    
                    System.out.print("Introduce el numero e asteriscos que deseas en la base de la piramide: ");
                    int numFilas = leer.nextInt();
                    leer.nextLine();

                    System.out.println();
                    for (int altura = 1; altura <= Math.ceil((float) numFilas / 2); altura++) {
                        
                        for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
                            System.out.print(" ");
                        }
                        
                        for (int asteriscos = 1; asteriscos <= (altura*2) - 1; asteriscos++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Cristo REY es la respuesta a todos los problemas");
                    
                    int pesomax_camion1 = 1000;
                    int noVacas1 = 8;
                    
                    
                    String[] PesosVacas1 = new String[8];
                    
                    PesosVacas1[0] = "223";
                    PesosVacas1[1] = "243";
                    PesosVacas1[2] = "100";
                    PesosVacas1[3] = "200";
                    PesosVacas1[4] = "200";
                    PesosVacas1[5] = "155";
                    PesosVacas1[6] = "300";
                    PesosVacas1[7] = "150";
                    
                    String[] LecheVacas1 = new String[8];
                    
                    LecheVacas1[0] = "30";
                    LecheVacas1[1] = "34";
                    LecheVacas1[2] = "28";
                    LecheVacas1[3] = "45";
                    LecheVacas1[4] = "31";
                    LecheVacas1[5] = "50";
                    LecheVacas1[6] = "29";
                    LecheVacas1[7] = "01";
                    
                    int pesomax_camion2 = 2000;
                    int noVacas2 = 10;
                    
                    String[] PesosVacas2 = new String[10];
                    PesosVacas2[0] = "340";
                    PesosVacas2[1] = "355";
                    PesosVacas2[2] = "223";
                    PesosVacas2[3] = "243";
                    PesosVacas2[4] = "130";
                    PesosVacas2[5] = "240";
                    PesosVacas2[6] = "260";
                    PesosVacas2[7] = "155";
                    PesosVacas2[8] = "302";
                    PesosVacas2[9] = "130";
                    
                    String[] LecheVacas2 = new String[10];
                    
                    LecheVacas2[0] = "45";
                    LecheVacas2[1] = "50";
                    LecheVacas2[2] = "34";
                    LecheVacas2[3] = "39";
                    LecheVacas2[4] = "29";
                    LecheVacas2[5] = "40";
                    LecheVacas2[6] = "30";
                    LecheVacas2[7] = "52";
                    LecheVacas2[8] = "31";
                    LecheVacas2[9] = "01";
                    
                    break;
            }
        }

    }

}
