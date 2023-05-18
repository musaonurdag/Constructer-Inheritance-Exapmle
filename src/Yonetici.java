
public class Yonetici extends Calisan{
	 private int sorumlukisi_sayisi;
	

	public Yonetici(String ad, String Soy_ad, String ID,int sorumlukisi_sayisi) {
		super(ad, Soy_ad, ID);
		this.sorumlukisi_sayisi=sorumlukisi_sayisi;
		
	}


	@Override
	public void bilgileri_goster() {		
		super.bilgileri_goster();
		System.out.println("Yonetici sorumlu kisi sayisi " +sorumlukisi_sayisi);
	}
	public void zam_Yap(int zamMiktari) {
		System.out.println("Calisanlara " +zamMiktari + " kadar  zam yapildi");
	}
	
	
	
	

}
