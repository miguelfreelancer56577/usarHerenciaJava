/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4_2;

import java.util.Scanner;

/**
 *
 * @author SPPDF
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        CuentaClave miCuenta = new CuentaClave();
        int op1 = 0;
        int op2 = 0;
        float cantidad;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Elije una opción");
        try {
            do {                
                System.out.println("1.- Crear cuenta vacia");
                System.out.println("2.- Crear cuenta saldo inicial");
                System.out.println("3.- Salir");
                op1 = sc.nextInt();
                if(op1 == 1){
                    System.out.println("Ingrese su numero de clave.");
                    miCuenta.setClave(sc.nextInt());
                    miCuenta.setSaldo(0);
                }else if(op1 == 2){
                    System.out.println("Ingrese su numero de clave.");
                    miCuenta.setClave(sc.nextInt());
                    System.out.println("Ingrese el saldo inicial");
                    float saldo = sc.nextFloat();
                    miCuenta.setSaldo(saldo);
                }else if(op1 == 3){
                    continue;
                }
                do {                    
                    System.out.println("1.- Ingresar Dinero");
                    System.out.println("2.- Sacar Dinero");
                    System.out.println("3.- Ver Saldo");
                    System.out.println("4.- Salir");
                    op2 = sc.nextInt();
                    switch(op2){
                        case 1:
                            System.out.println("Ingrese la cantidad.");
                            cantidad = sc.nextFloat();
                            miCuenta.ingresar(cantidad);
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad que desea sacar.");
                            cantidad = sc.nextFloat();
                            miCuenta.extraer(cantidad);
                            break;
                        case 3:
                            System.out.println(miCuenta.getSaldo());
                            break;
                    }
                } while (op2 != 4);
            } while (op1 != 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(miCuenta);
    }
}
    
