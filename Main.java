
public class EnBuyukSayı{

	public static void main(String[] args) {
		char grade = 'E';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;

		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Orta : Geçtiniz");
			break;
		case 'F':
		case 'E':
			System.out.println("Malesef Kaldınız :(");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}
