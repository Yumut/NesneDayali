package dersarray;

import java.util.Scanner;



public class Array {

	
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	Array2 sr = new Array2();
	int puan=0;
	int []cevap = new int[5];
	
	
	
		
	 sr.soru1();
	 cevap[0]=sc.nextInt();
	 if(cevap[0]==2){
		 puan++;
		 System.out.println("Doğru Cevap");
	 }else {
		 
		 System.out.println("Yanlış Cevap");
	 }
		
	 
	 sr.soru2();
		 cevap[1]=sc.nextInt();
		 if(cevap[1]==1){
			 puan++;
			 System.out.println("Doğru Cevap");
		 }else {
			 
			 System.out.println("Yanlış Cevap");
		 }
		 
		 sr.soru3();
			 cevap[2]=sc.nextInt();
			 if(cevap[2]==4){
				 puan++;
				 System.out.println("Doğru Cevap");
			 }else {
				 
				 System.out.println("Yanlış Cevap");
			 }
			 
			 
			 sr.soru4();
				 cevap[3]=sc.nextInt();
				 if(cevap[3]==4){
					 puan++;
					 System.out.println("Doğru Cevap");
				 }else {
					 
					 System.out.println("Yanlış Cevap");
				 }
				 
				 sr.soru5();
					 cevap[4]=sc.nextInt();
					 if(cevap[4]==2){
						 puan++;
						 System.out.println("Doğru Cevap");
					 }else {
						 
						 System.out.println("Yanlış Cevap");
					 }
					 
					 switch(puan){
					  case 5:
						  System.out.println("Mükemmel");
					    break;
					  case 4:
						  System.out.println("Çok İyi");
					  case 3:
						  System.out.println("Küresel Isınma hakkındaki bilgilerinizi tazeleme zamanı");
						  
					    break;
					  case 2:
						  System.out.println("Küresel Isınma hakkındaki bilgilerinizi tazeleme zamanı");
					  case 1:
						  System.out.println("Küresel Isınma hakkındaki bilgilerinizi tazeleme zamanı");
					
					}

					 
					 
						
						 
						 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}


