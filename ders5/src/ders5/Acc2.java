package ders5;

import java.util.Scanner;

public class Acc2 {

	public static void main(String[] args) {
		
		int vz,fn,pr,lab,gnl=0;
		double ort;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Vize Notu Giriniz");
		vz=sc.nextInt();
		System.out.print("final Notu Giriniz");
		fn=sc.nextInt();
		System.out.print("proje Notu Giriniz");
		pr=sc.nextInt();
		System.out.print("lab Notu Giriniz");
		lab=sc.nextInt();
		ort = ((vz*20)+(fn*40)+(pr*30)+(lab*20))/100;
		
		if(ort>=55 && ort<=59){
			gnl=1;}
		else if(ort<=60 && ort>=64) {
			
			gnl=1;
		}
		else if(ort<=65 && ort>=74) {
					
					gnl=2;
				}
		else if(ort<=75 && ort>=79) {
			
			gnl=3;
		}
		else if(ort<=80 && ort>=84) {
			
			gnl=4;
		}else {
			System.out.print("Hata");
		}
		
		switch(gnl) {
		case 1:
			System.out.print("DD");
		case 2:	
			System.out.print("DC");
		case 3: 
			System.out.print("cc");
		case 4:
			System.out.print("cb");
		
		}
			
		
		
		
		
		/*
		int p=1000,n=10,toplam;
		int i=1;
		double r=0.05,a;
		
		for( i=1;i<=n;i++) {
			a=p*Math.pow((1+r),i);
			
		 System.out.printf("Depozito Tutarı: %6.2f  \n",a);
		}
		*/
		
		
		/*
		int ogr=0,ortalama=0,puan;
		int y =0;
		Scanner sc = new Scanner(System.in);
		while(y<1) {
			System.out.print("Notu Giriniz");
			puan=sc.nextInt();
			if(puan==-1) {
			 break;
			}else {
			   ortalama=ortalama+puan;
			   ogr++;
			}
		}
		System.out.print("ort"+ortalama/ogr);
		
*/
	}

}
