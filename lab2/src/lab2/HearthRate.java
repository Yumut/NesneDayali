package lab2;

public class HearthRate {
	String Name;
	String Soyad;
	int yıl;
	public HearthRate(String name, String soyad, int yıl) {
		super();
		Name = name;
		Soyad = soyad;
		this.yıl = yıl;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSoyad() {
		return Soyad;
	}
	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
	public int getYıl() {
		return yıl;
	}
	public int getYas() {
		return 2022-yıl;
	}
	public void setYıl(int yıl) {
		this.yıl = yıl;
	}
	public int getmaxHeartrate(int yas){
		return 220-yas;
		
	}
	public int gettargetHeartrate(int MHR){
		return (MHR*85)/100;
		
	}
	public  void getshow() {
		System.out.print("Ad\n"+getName());
		System.out.print("Soyad \n"+getSoyad());
		System.out.print("Yas \n"+getYas());
		System.out.print("MHR \n"+ getmaxHeartrate(getYas()));
		System.out.print("THR \n"+ gettargetHeartrate(getmaxHeartrate(getYas())));
	}
	

}
