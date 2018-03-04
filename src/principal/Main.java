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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables para asignarle el costo de las campañas
        long campPolo=3_000_000_000L , campLiberal=2_000_000_000L , campVerde=1_000_000_000L , campMira=500_000_000L;
        int votar;
        int opMenu;
        //cantidad de votos por cada votante
        int votoCand1=0,votoCand2=0,votoCand3=0,votoCand4=0,votoCand5=0,votoCand6=0,votoCand7=0,votoCand8=0,votoCand9=0;
        //cantidad total de votos por partido
        int votoPolo=0,votoLiberal=0, votoVerde=0, votoMira=0;
        //variables para sacar el promedio
        long promoPolo,promoLiberal,promoVerde,promoMira;
        int aumentoCamp=0;//aumento de precio de campaña
        Scanner sc = new Scanner(System.in);
        int votoPart; //guarda el partido por el cual se va a votar
        int cantVoI,cantVoF;
        while(true){
            System.out.print("Tarjeton \n"
                        + "1.votar "
                        + "2.administracion de votos y costos "
                        + "3.salir "
                        + "opcion: ");
            opMenu = sc.nextInt();
        Candidato obj1 = new Candidato("yeison","ramirez",1028308210,40,8382832,"Cll 43","bogota","Partido Polo");
        Candidato obj2 = new Candidato("victor","beltran",829013,37,8438248,"Cra 63","facatativa","Partido Polo");
        Candidato obj3 = new Candidato("jose","segura",1070989508,56,8234497,"Cra 65","bogota","Partido Polo");
        Candidato obj4 = new Candidato("samuel","zarate",2189080,47,8493294,"Cra 67","medellin","Partido Liberal");
        Candidato obj5 = new Candidato("yesid","molina",8392183090,43,8083428,"Cll 68","cali","Partido Liberal");
        Candidato obj6 = new Candidato("diego","muños",1298017,46,8342057,"Cll 42","pereira","Partido Verde");
        Candidato obj7 = new Candidato("brayan","rodriguez",189028,55,8321484,"Cll 45","ibague","Partido Verde");
        Candidato obj8 = new Candidato("fabian","caro",20883923,42,8213709,"Cra 34","antioquia","Partido Mira");
        Candidato obj9 = new Candidato("luis","moreno",1088329825,37,8932071,"Cra 66","medellin","Partido Mira");
        }
        
    
}
}
