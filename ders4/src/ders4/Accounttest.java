package ders4;

public class Accounttest {

	public static void main(String[] args) {
		String isim="ibrahim";
		String soyad="yakup";
		int yas=15;
		Account acc = new Account(isim, soyad, yas);
		System.out.println("Hoşgeldiniz"+acc.getName()+""+acc.getSurname());
		System.out.println("yaşınız"+acc.getYas());
		acc.setName("umut");
		acc.setSurname("Deneme");
		acc.setYas(25);
		System.out.println("Hoşgeldiniz"+acc.getName()+""+acc.getSurname());
		System.out.println("yaşınız"+acc.getYas());
		Account acc2= new Account("samet", "yakup", 22);
		System.out.println("Hoşgeldiniz"+acc2.getName()+""+acc2.getSurname());
		System.out.println("yaşınız"+acc2.getYas());
		

	}

}
