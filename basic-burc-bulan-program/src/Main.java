/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        
       int  dogumAyi;
       int dogumGunu;
       String burc;
       Scanner scanner = new Scanner(System.in); 
        System.out.println("Doğum ayınızı giriniz: "); 
       dogumAyi =scanner.nextInt();
        System.out.println("Doğum gününüzü yazınız");
       dogumGunu =scanner.nextInt();
            if(dogumGunu > 31 || dogumGunu < 1 || dogumAyi < 1 || dogumAyi > 12){
         System.out.println("Hatalı giriş yaptınız !!");
         return;
     }

        
        
        else{
             if(dogumAyi ==3 && dogumGunu>=21 || dogumAyi ==4 && dogumGunu<=20){
           System.out.println("Koç Burcu");
           
       }
       else if(dogumAyi ==4 && dogumGunu>=21 || dogumAyi ==5 && dogumGunu<=21){
           System.out.println("Boğa Burcu");
       }
       else if(dogumAyi ==5 && dogumGunu>=22 || dogumAyi==6 && dogumGunu<=22){
           System.out.println("İkizler Burcu");
       } 
       
       else if(dogumAyi ==6 && dogumGunu>=23 || dogumAyi==7 && dogumGunu<=22){
           System.out.println("Yengeç Burcu");
       }
       
       else if(dogumAyi ==7 && dogumGunu>=23 || dogumAyi==8 && dogumGunu<=22){
           System.out.println("Aslan Burcu");
           
       }
       
       else if(dogumAyi ==8 && dogumGunu>=23 || dogumAyi==9 && dogumGunu<=22){
           System.out.println("Başak Burcu");
       }
       
       else if(dogumAyi ==9 && dogumGunu>=23 || dogumAyi==10 && dogumGunu<=22){
           System.out.println("Terazi Burcu");
       }
       
       else if(dogumAyi == 10 && dogumGunu>=23 || dogumAyi==11 && dogumGunu<=21){
           System.out.println("Akrep Burcu");
       }
       else if(dogumAyi ==11 && dogumGunu>=22 || dogumAyi==12 && dogumGunu<=21){
           System.out.println("Yay Burcu");
       }
       
       else if(dogumAyi ==12 && dogumGunu>=22 || dogumAyi==1 && dogumGunu<=21){
           System.out.println("Oğlak Burcu");
       }
       
       else if(dogumAyi ==1 && dogumGunu>=22 || dogumAyi==2 && dogumGunu<=19){
           System.out.println("Kova Burcu");
       }
       
       else if(dogumAyi ==2 && dogumGunu>=20 || dogumAyi==3 && dogumGunu<=20){
           System.out.println("Balık Burcu");
       }
           
        }
      
       
       
       
        
    }
}
