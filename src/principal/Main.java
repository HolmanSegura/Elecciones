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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Partidos obj11 = new Partidos();
        Administracion obj12 = new Administracion();
        int menu;
        do{
            System.out.print("MENU PRINCIPAL \n"
            + "1.votar \n"
            + "2.administracion de votos y costos \n"
            + "3.salir \n"
            + "opcion: ");
            menu = sc.nextInt();
        }while(menu<1);
        switch(menu){
            case 1:
                obj11.Partidos();
            break;         
            case 2:
                obj12.Administracion();
            break;    
            }
    }
    private static class Partidos {

        public void Partidos() {
            Scanner sc = new Scanner(System.in);
            //guarda el partido por el cual se va a votar
            int votoPart; 
            int votar;
            //variables para asignarle el costo de las campañas politicas
            long campPolo=3_000_000_000L , campLiberal=2_000_000_000L , campVerde=1_000_000_000L , campMira=500_000_000L;
            //variables para obtener cantidad de votos para cada candidato
            int votoCand1=0,votoCand2=0,votoCand3=0,votoCand4=0,votoCand5=0,votoCand6=0,votoCand7=0,votoCand8=0,votoCand9=0;
            //variables para obtener la cantidad total de votos por partido
            int votoPolo=0,votoLiberal=0, votoVerde=0, votoMira=0;
            //variable para aumento de precio de campaña
            int aumentoCamp=0;
            Candidato Obj1 = new Candidato("yeison","ramirez",1028308210,40,8382832,"Cll 43","bogota","Partido Polo");
            Candidato Obj2 = new Candidato("victor","beltran",829013,37,8438248,"Cra 63","facatativa","Partido Polo");
            Candidato Obj3 = new Candidato("jose","segura",1070989508,56,8234497,"Cra 65","bogota","Partido Polo");
            Candidato Obj4 = new Candidato("samuel","zarate",2189080,47,8493294,"Cra 67","medellin","Partido Liberal");
            Candidato Obj5 = new Candidato("yesid","molina",839218390,43,8843428,"Cll 68","cali","Partido Liberal");
            Candidato Obj6 = new Candidato("diego","muños",1298017,46,8342057,"Cll 42","pereira","Partido Verde");
            Candidato Obj7 = new Candidato("brayan","rodriguez",189028,55,8321484,"Cll 45","ibague","Partido Verde");
            Candidato Obj8 = new Candidato("fabian","caro",20883923,42,8213709,"Cra 34","antioquia","Partido Mira");
            Candidato Obj9 = new Candidato("luis","moreno",1088329825,37,8932071,"Cra 66","medellin","Partido Mira");
            do{
                System.out.println("Seleccione el partido por el cual quiere votar"
                +"1.Partido Polo"
                +"2.Partido Liberal"
                +"3.Partido Verde"
                +"4.Partido Mira"
                +"opcion: ");
                votoPart = sc.nextInt();
            }while(votoPart<1);
            Publicidad Obj10 = new Publicidad();
            switch(votoPart){
                case 1:
                    do{
                        System.out.println("PARTIDO POLO\n"
                        +"\n1.Candidato 1"+Obj1.datosCandidato()
                        +"\n2.Candidato 2"+Obj2.datosCandidato()
                        +"\n3.Candidato 3"+Obj3.datosCandidato()
                        +"\nEscoja el candidato por el cual va a votar"
                        +"opcion: ");
                        votar = sc.nextInt();
                    }while(votar<1);
                    //la funcion if va a contar los votos de los candidatos del partido polo
                    if(votar==1){
                    votoCand1 += 1;
                    }
                    else{
                        if(votar==2){
                            votoCand2 += 1;
                        }
                        else{
                            votoCand3 += 1;
                        }
                    }
                    aumentoCamp = Obj10.Publicidad();
                    campPolo += aumentoCamp;
                    votoPolo += 1;
                break;    
                case 2:
                    do{
                        System.out.println("PARTIDO LIBERAL\n"
                        +"\n1.Candidato 1 "+Obj4.datosCandidato()
                        +"\n1.Candidato 2 "+Obj5.datosCandidato()
                        +"\nEscoja el candidato por el cual va a votar "
                        +"opcion: ");
                        votar = sc.nextInt();
                    }while(votar<1);
                    //la funcion if va a contar los votos de los candidatos del partido liberal
                    if(votar==1){
                        votoCand4 += 1;
                    }
                    else{
                        votoCand5 += 1;
                    }
                    aumentoCamp=Obj10.Publicidad();
                    campLiberal += aumentoCamp;
                    votoLiberal += 1;
                break;    
                case 3:
                    do{
                        System.out.println("PARTIDO VERDE\n"
                        +"\n1.Candidato 1"+Obj6.datosCandidato()
                        +"\n2.Candidato 2"+Obj7.datosCandidato()
                        +"\nEscoja el candidato por el cual va a votar"
                        +"opcion: ");
                        votar = sc.nextInt();
                    }while(votar<1);
                    //la funcion if va a contar los votos de los candidatos del partido verde
                    if(votar==1){
                        votoCand6 += 1;
                    }else{
                        votoCand7 += 1;
                    }
                    aumentoCamp=Obj10.Publicidad();
                    campVerde += aumentoCamp;
                    votoVerde += 1;
                break;    
                case 4:
                    do{
                        System.out.println("PARTIDO MIRA\n"
                        +"\n1.Candidato 1"+Obj8.datosCandidato()
                        +"\n2.Candidato 2"+Obj9.datosCandidato()
                        +"\nEscoja el candidato por el cual va a votar"
                        +"opcion: ");
                        votar = sc.nextInt();
                    }while(votar<1);
                    //la funcion if va a contar los votos de los candidatos del partido mira
                    if(votar==1){
                        votoCand8 += 1;
                    }
                    else{
                        votoCand9 += 1;
                    }
                    aumentoCamp=Obj10.Publicidad();
                    campMira += aumentoCamp;
                    votoMira += 1; 
                break;
            }
        }
    }

    private static class Administracion {

        public void Administracion() {
            Scanner sc = new Scanner(System.in);
            //variables para obtener el promedio
            long promoPolo,promoLiberal,promoVerde,promoMira;
            //variables para asignarle el costo de las campañas politicas
            long campPolo=3_000_000_000L , campLiberal=2_000_000_000L , campVerde=1_000_000_000L , campMira=500_000_000L;
            //variables para obtener cantidad de votos para cada candidato
            int votoCand1=0,votoCand2=0,votoCand3=0,votoCand4=0,votoCand5=0,votoCand6=0,votoCand7=0,votoCand8=0,votoCand9=0;
            //variables para obtener la cantidad total de votos por partido
            int votoPolo=0,votoLiberal=0, votoVerde=0, votoMira=0;
            Candidato Obj1 = new Candidato("yeison","ramirez",1028308210,40,8382832,"Cll 43","bogota","Partido Polo");
            Candidato Obj2 = new Candidato("victor","beltran",829013,37,8438248,"Cra 63","facatativa","Partido Polo");
            Candidato Obj3 = new Candidato("jose","segura",1070989508,56,8234497,"Cra 65","bogota","Partido Polo");
            Candidato Obj4 = new Candidato("samuel","zarate",2189080,47,8493294,"Cra 67","medellin","Partido Liberal");
            Candidato Obj5 = new Candidato("yesid","molina",839218390,43,8843428,"Cll 68","cali","Partido Liberal");
            Candidato Obj6 = new Candidato("diego","muños",1298017,46,8342057,"Cll 42","pereira","Partido Verde");
            Candidato Obj7 = new Candidato("brayan","rodriguez",189028,55,8321484,"Cll 45","ibague","Partido Verde");
            Candidato Obj8 = new Candidato("fabian","caro",20883923,42,8213709,"Cra 34","antioquia","Partido Mira");
            Candidato Obj9 = new Candidato("luis","moreno",1088329825,37,8932071,"Cra 66","medellin","Partido Mira");
            int menuA;
            do{
                System.out.println("Menu Administrador");
                System.out.println("1.Calculo total de votos por candidato");
                System.out.println("2.Calculo total de votos por partido");
                System.out.println("3.Costo promedio por partido político");
                menuA = sc.nextInt();
            }while(menuA<1);
            switch(menuA){
                case 1:
                    System.out.println("\tvotos por candidato");
                    System.out.println("Candidato 1 \n"+Obj1.datosCandidato()+"Total votos: "+votoCand1);
                    System.out.println("Candidato 2 \n"+Obj2.datosCandidato()+"Total votos: "+votoCand2);
                    System.out.println("Candidato 3 \n"+Obj3.datosCandidato()+"Total votos: "+votoCand3);
                    System.out.println("Candidato 4 \n"+Obj4.datosCandidato()+"Total votos: "+votoCand4);
                    System.out.println("Candidato 5 \n"+Obj5.datosCandidato()+"Total votos: "+votoCand5);
                    System.out.println("Candidato 6 \n"+Obj6.datosCandidato()+"Total votos: "+votoCand6);
                    System.out.println("Candidato 7 \n"+Obj7.datosCandidato()+"Total votos: "+votoCand7);
                    System.out.println("Candidato 8 \n"+Obj8.datosCandidato()+"Total votos: "+votoCand8);
                    System.out.println("Candidato 9 \n"+Obj9.datosCandidato()+"Total votos: "+votoCand9);
                break;
                case 2:
                    System.out.println("\tvotos por partido");
                    System.out.println("Polo: "+votoPolo);
                    System.out.println("Liberal: "+votoLiberal);
                    System.out.println("Verde: "+votoVerde);
                    System.out.println("Mira: "+votoMira);
                break;
                case 3:
                    System.out.println("promedio del coste por partido político");
                    promoMira=campMira/votoMira;
                    promoPolo=campPolo/votoPolo;
                    promoLiberal=campLiberal/votoLiberal;
                    promoVerde=campVerde/votoVerde;
                    System.out.println("Polo: "+promoPolo);
                    System.out.println("Liberal: "+promoLiberal);
                    System.out.println("Verde: "+promoVerde);
                    System.out.println("Mira: "+promoMira);
                break;
            }
        }
    }
}
    
