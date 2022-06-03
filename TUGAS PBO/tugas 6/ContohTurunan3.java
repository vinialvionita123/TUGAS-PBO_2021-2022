class ContohTurunan2{
	public static void main(String[]args){Scanner scanner=new Scanner(System.in);
		
		int jenis_bidang = 0;
		
		while(true){
			System.out.print("1. Persegi (Datar) \n2. Kotak (Ruang)\nPilih jenis bidang:");
			int input = scanner.nextInt();
			
			if(input== 1 || input==2){
				jenis_bidang = input;
				break;
			}
		}
		boolean is_sama_sisi=false;
		
		while(true){
			System.out.print("1.Ya\n2. Tidak\nApakah sama sisi?");
			int input = scanner.nextInt();
			
			if (input == 1 || input == 2){
				if(input== 1)
				is_sama_sisi=true;
				break;
			}
		}
		
		Persegi persegi;
		Kotak kotak;
		
		if(jenis_bidang == 1 && is_sama_sisi){
			//hitung luas persegi (sama sisi)
			System.out.print   ("Masukkan sisi:");
			int sisi = scanner.nextInt();
			
			persegi = new Persegi(sisi);
			System.out.println("luas persegi adalah "+persegi.luas());
		}
		else if (jenis_bidang == 1){
			//hitung luas persegi panjang (tidak sama sisi)
			System.out.print("Masukkan panjang:");
			int panjang = scanner.nextInt();
			System.out.print("Masukkan lebar:");
			int lebar = scanner.nextInt();
			
			persegi=new Persegi(panjang, lebar);
			System.out.println("luas persegi panjang adalah"+persegi.luas());
		}
		else if (jenis_bidang==2 && is_sama_sisi){
			//hitung luas kubus (sama sisi)
			System.out.print("Masukkan sisi:");
			int sisi = scanner.nextInt();
			
			kotak = new Kotak(sisi);
			System.out.println("Volume kubus adalah"+ kotak.volume());
		}
		else{
			//hitung luas balok (tidak sama sisi)
			System.out.print("Masukkan panjang:");
			int panjang = scanner.nextInt();
			System.out.print("Masukkan lebar:");
			int lebar = scanner.nextInt();
			System.out.print("Masukkan tinggi:");
			int tinggi = scanner.nextInt();
			
			kotak = new Kotak(panjang, lebar, tinggi);
			System.out.println("volume balok adalah"+kotak.volume());
		}
	}
}
