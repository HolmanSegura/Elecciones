/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author holma
 */
public class Publicidad {
    int Publicidad(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.print("digite el metodo publicitario que mas lo influencio \n"
                        + "1.television "
                        + "2.radio "
                        + "3.internet "
                        + "opcion: ");
            opcion = sc.nextInt();
        }while(opcion<1);
        return opcion;
    }
}
