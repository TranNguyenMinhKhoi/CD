package baiTapCD;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class TestCDR {
	public static void main(String[] args) throws Exception{
		CDR cdr1 = new CDR("20094511", "IUH tôi yêu", "Ca sĩ Dối Gian", new GregorianCalendar(2024, 01, 01), 10, 40000);
		System.out.println("Thêm vào mảng");
		ListCDM ls = new ListCDM(2);
		ls.themCDR(cdr1);
		CDR cdr2 = new CDR("123456789", "IUH tôi thương", "Ca sĩ FiFai", new GregorianCalendar(2024, 02, 02), 20, 70000);
		CDR cdr3 = new CDR("987654321", "IUH tôi không ghét", "Ca sĩ Vô Cùng Tận", new GregorianCalendar(2024, 03, 03), 30, 110000);
		CDR cdr4 = new CDR("000000000", "IUH tôi yeah", "Ca sĩ Ohio", new GregorianCalendar(2024, 04, 04), 40, 60000);
		ls.themCDR(cdr2);
		ls.themCDR(cdr3);
		ls.themCDR(cdr4);
		
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getCdrs()[i].toString());
		}
		
		//Test sắp xếp
		System.out.println("Sắp xếp: ");
		ls.sapXep();
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getCdrs()[i].toString());
		}
		
		//Test xóa
		System.out.println("Xóa xong:");
		ls.xoa("20094511");
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getCdrs()[i].toString());
		}
		
		//Test Cập nhật
		System.out.println("Mã CD: 20094511");
		System.out.println("Cập nhật giá = 999999");
		ls.capNhat("20094511", 999999);
		for (int i = 0; i < ls.count; i++) {
			System.out.println(ls.getCdrs()[i].toString());
		}
	}
}
