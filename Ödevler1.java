
public class Ödevler1 {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		// for döngüsü javada bu şekilde tanımlanır

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
				// break ile kodu bitirebiliyoruz
			}
		}
		if (varMi) {
			mesajVer("Sayı Mevcut" + aranacak);
		} else {
			mesajVer("Sayı Mevcut Değildir" + aranacak);

		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
