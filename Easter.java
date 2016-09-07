//Brian Truong (bt7tg)
//CS 2110-001
public class Easter {
	public static String easter(int y) {
		int a = y%19, b = y/100, c = y%100, d = b/4, e = b%4;
		int g = (8*b+13)/25, h = (19*a+b-d-g+15)%30, j = c/4, k = c%4;
		int m = (a+11*h)/319, r = (2*e+2*j-k-h+m+32)%7, n = (h-m+r+90)/25, p = (h-m+r+n+19)%32;
		String date = "";
		switch (n) {
			case 1:
				date += "January ";
				break;
			case 2:
				date += "February ";
				break;
			case 3:
				date += "March ";
				break;
			case 4:
				date += "April ";
				break;
			case 5:
				date += "May ";
				break;
			case 6:
				date += "June ";
				break;
			case 7:
				date += "July ";
				break;
			case 8:
				date += "August ";
				break;
			case 9:
				date += "September ";
				break;
			case 10:
				date += "October ";
				break;
			case 11:
				date += "November ";
				break;
			case 12:
				date += "December ";
				break;
			default:
				System.out.println("Month not found");
				System.exit(1);
		}
		date += p;
		return date;
	}
}
