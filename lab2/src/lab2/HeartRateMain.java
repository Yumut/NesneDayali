package lab2;

import java.util.Scanner;



public class HeartRateMain {

	public static void main(String[] args) {
		
		String ad="",soyad="";
		int yıl=0,yas,MHR;
		HearthRate hrt = new HearthRate(ad,soyad,yıl);
		Scanner sc = new Scanner(System.in);
		System.out.println("Adınız");
		ad=sc.nextLine();
		System.out.println("Soyadınız");
		soyad=sc.nextLine();
		System.out.println("Dogum Yılınız");
		yıl=sc.nextInt();
		
		hrt.setName(ad);
		hrt.setSoyad(soyad);
		hrt.setYıl(yıl);
		yas=hrt.getYas();
		MHR=hrt.getmaxHeartrate(yas);
		
		
		
		
		
		
		
		System.out.println("yaşiniz\n"+hrt.getYas());
		System.out.println("MHR\n"+hrt.getmaxHeartrate(yas));
		System.out.println("THR\n"+hrt.gettargetHeartrate(MHR));
		hrt.getshow();
		
		

	}

}
