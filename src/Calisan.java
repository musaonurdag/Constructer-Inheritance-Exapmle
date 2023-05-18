
public class Calisan {
	private String ad;
	private String Soy_ad;
	private String ID;

	
	public Calisan(String ad,String Soy_ad,String ID) {
		
		this.ad=ad;
		this.Soy_ad=Soy_ad;
		this.ID=ID;
	}


	public void bilgileri_goster() {
		System.out.println("Calisan bilgileri");
		System.out.println("Ad: " +ad);
		System.out.println("Soyad: " +Soy_ad);
		System.out.println("ID: " +ID);
		
	}
	
	
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoy_ad() {
		return Soy_ad;
	}


	public void setSoy_ad(String soy_ad) {
		Soy_ad = soy_ad;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}
	
	
}
