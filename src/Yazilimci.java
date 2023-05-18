
public class Yazilimci extends Calisan {
	
	private String Diller;

	public Yazilimci(String ad, String Soy_ad, String ID,String Diller) {
		
		super(ad, Soy_ad, ID);
		this.Diller=Diller;
		
	}
	
	public void format_at(String isletim_sistemi) {
		
		System.out.println(getAd() +" " +isletim_sistemi +" Yukluyor");
	}

	
	@Override
	public void bilgileri_goster() {	
		super.bilgileri_goster();
		System.out.println("Yazilimcinin bildigi diller" +Diller);
	}
	
	
	
	

}
