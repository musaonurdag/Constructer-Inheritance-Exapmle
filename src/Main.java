import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Calisanlar Programina Hosgeldiniz");
		 
		 String İslemler ="Islemler ...\n"
				 			+"1.Yazilimci Islemleri\n"
				 			+ "2.Yonetici Islemleri\n"
				 			+ "Cikis icin q'ya basin";
		 System.out.println(İslemler);
		 
		 while(true) {
			 System.out.print("Islemi seciniz: ");
			 String islem = scanner.nextLine();
			 
			  if(islem.equals("q")) {
				  System.out.println("Programdan Cikiliyor...");
				  break ;				 
			  }
			  else if(islem.equals("1")) {
				  Yazilimci yazilimci = new Yazilimci("Musa Onur","Dag", "538","Java,C++");
				  String yazilimci_islem="1.Format at\n"
						   				+"2.Bilgileri Goster\n"
						   				+"Cikis icin q'ya basin";
				  
				  System.out.println(yazilimci_islem);
				  while(true) {
					  System.out.print("Islemi seciniz: ");
					  String y_islem=scanner.nextLine();
					  
					  if(y_islem.equals("q")) {
						  System.out.println("Yazilimci islemlerinden cikiliyor");
						  break;
					  }
					  else if(y_islem.equals("1")) {
						  System.out.println("isletim sistemi giriniz: ");
						  String isletim_sistemi = scanner.nextLine();
						  yazilimci.format_at(isletim_sistemi);
						 
						  
					  }
					  else if(y_islem.equals("2")) {
						  yazilimci.bilgileri_goster();
				
					  }
					  else {
						  System.out.println("gecersiz islem");
					  }
					  
				  }
				  
			  }
			  
			  
			  
			  
			  else if(islem.equals("2")) {
				  
				  Yonetici yonetici1 = new Yonetici("Sude Naz","Dogdu","3316", 10);
				   String yonetici_islemler="1.Zam yap\n"
						   					+"2.Bilgileri goster\n"
						   					+ "Cikis icin q'ya basin";
				   System.out.println(yonetici_islemler);
				   
				   while(true) {
					   System.out.print("Islemi seciniz: ");
					   String yon_islem=scanner.nextLine();
					   
					   if(yon_islem.equals("q")) {
						   System.out.println("Cikis yapiliyor");
						   break;
					   }
					   else if(yon_islem.equals("1")) {
						   yonetici1.zam_Yap(500);
						  
						   
					   }
					   else if(yon_islem.equals("2")) {
						   yonetici1.bilgileri_goster();
						   
						   
					   }
					   else {
						   System.out.println("Hatali islem secimi");
					   }
				   }
				  
				  
			  }
			  else {
				  System.out.println("Gecersiz islem");
			  }
		 }

	}

}
