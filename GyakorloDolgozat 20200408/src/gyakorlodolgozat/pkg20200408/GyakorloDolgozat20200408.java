/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlodolgozat.pkg20200408;

import com.sun.beans.editors.ColorEditor;
import java.awt.Color;
import static java.sql.DriverManager.println;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Soma
 */

public class GyakorloDolgozat20200408 {
static Random rnd=new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Feladat1();
        System.out.println("\n\n-----------------\n");
        Feladat2();
        System.out.println("\n\n-----------------\n");
        Feladat3();
        System.out.println("\n\n-----------------\n");
        Feladat4();
        System.out.println("\n\n-----------------\n");
        Feladat5();
        System.out.println("\n\n-----------------\n");
        
    }

    private static void Feladat1()
    {
        System.out.println("1.Feladat: az első 20 hárommal és kettővel osztható számokat. A számokat írja ki egymás mellé a program vesszővel elválasztva");
        int Kivant_Szam=0;
        for (int i = 1; i <=20; i++)
        {
            Kivant_Szam=6*i;
            
            if(Kivant_Szam%4==0)
            {
               System.out.print("\033[31;1m"+Kivant_Szam+" \033[0m ; ");
               //System.out.print(+Kivant_Szam +" ; "); 
            
            }
            else{
                System.out.print(+Kivant_Szam +" ; ");
            }
        }
            
    }

    private static void Feladat2()
    {
        System.out.println("\n2.Feladat");
        System.out.println("Egy nyolcoldalú bűvös kockát feldobunk 14 alkalommal.\n" +
                           " Írja ki a dobásokat sorszámmal a program külön sorba.\n" +
                           " Számítsa ki a program a dobott számok összegét és átlagát.\n" +
                           " Számolja meg és írja ki a program hány alkalommal dobott a gép 7-et?");  
        int Buvos_Kocka=0;
        double Osszeg=0;
        double Atlag=0;
        int db=0;
        for (int i = 1; i < 15; i++) 
        {
            Buvos_Kocka=rnd.nextInt(8)+1;
            System.out.println(+i+" dobás:= "+Buvos_Kocka+"");
            Osszeg+=Buvos_Kocka;
            Atlag=Osszeg/14;
            if(Buvos_Kocka==7)
            {
                db++;
            }
        }
        System.out.println("\nA dobott számok összege: "+Osszeg);
        System.out.println("\nA dobott számok átlaga: "+Atlag);
        System.out.println("\n Ennyi alkalommal dobtunk 7-est: "+db);
        
    }

    private static void Feladat3() {
        System.out.println("3.Feladat");
        System.out.println("Készítsen programot mely bekéri a felhasználó nevét és lakóhelyének lélekszámát. "
                + "A program állapítsa meg az alábbi táblázat irányelvei alapján milyen településen él a felhasználó "
                + "Ha a felhasználó nem megfelelő számot ad meg, a program írja ki, "
                + "hogy „HIBÁS ADATBEVILET”");
        
         Scanner Konzol= new Scanner(System.in); 
         System.out.print("Kérem adja meg a nevét: ");
         String Neve=Konzol.next();
         
        
         System.out.print("Kérem adja meg hány fős helyen lakik: ");
         int LakosokSzama=Konzol.nextInt();
        if(LakosokSzama>0)
        {
          if(LakosokSzama<5000)
          {
              System.out.println(""+Neve+ " Ön egy községben lakik");
          }
          if(5000<=LakosokSzama && LakosokSzama<20000)
          {
              System.out.println(""+Neve+ " Ön egy kisvárosban lakik");
          }
          if(20000<=LakosokSzama && LakosokSzama<100000)
          {
              System.out.println(""+Neve+ " Ön egy Középvárosban lakik");
          }
          if(100000<=LakosokSzama && LakosokSzama<1000000)
          {
              System.out.println(""+Neve+ " Ön egy Középvárosban lakik");
          }
          if(1000000<=LakosokSzama)
          {
              System.out.println(""+Neve+ " Ön egy Nagy Városban lakik");
          }
        }
        else
        {
            System.out.println("Hibásan megadott ");
        }
    }

    private static void Feladat4() 
    {
        System.out.println("4.Feladat");
        System.out.println("Írjon programot, amely bekér két valós számot (egész vagy tört számot) a felhasználótól a sugarat és a magasságot. "
                + "Számítsa ki a program a henger térfogatát felszínét.");
        Scanner Konzol= new Scanner(System.in); 
         System.out.print("Kérem adja meg az alapkör sugarát: ");
         int Sugar=Konzol.nextInt();
             
         System.out.print("Kérem adja meg a magasságot: ");
         int Magassag=Konzol.nextInt();
         double Terfogat=Math.pow(Sugar, 2)*Math.PI*Magassag;
         System.out.println("A Henger térfogata: "+Terfogat);
         double Felszin=2*Sugar*Math.PI*Magassag+2*Math.pow(Sugar, 2)*Math.PI;
         System.out.println("A henger Felszíne: "+Felszin);
         
    }

    private static void Feladat5() {
        System.out.println("5.Feladat");
        System.out.println("Készítsen programot mely bekéri a felhasználó nevét, az autóval megtett "
                + "út hosszát illetve mennyi idő alatt tette meg a jármű az utat. "
                + "Számítsa ki a program és írja ki a képernyőre a felhasználót megszólítva "
                + "a program két tizedes jegy pontossággal, "
                + "hogy mekkora volt az utazás alatt a jármű átlag sebessége.");
        Scanner Konzol= new Scanner(System.in); 
         System.out.print("Kérem adja meg a nevét: ");
         String Neve=Konzol.next();
         System.out.print("Kérem adja meg a megtett út hosszát: ");
         double Ut=Konzol.nextDouble();             
         System.out.print("Kérem adja meg az utazási időt: ");
         double Ido=Konzol.nextDouble();
         double Atlagsebesseg=Ut/Ido;        
         System.out.print("\n"+Neve+" átlag sebesség: "+Atlagsebesseg+" km/h ");
    }
    
}
    
