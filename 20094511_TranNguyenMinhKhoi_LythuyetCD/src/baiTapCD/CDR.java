package baiTapCD;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CDR {
	private String maCD;
	private String tuaCD;
	private String caSi;
	private Calendar ngayPH;
	private int soBH;
	private double giaThanh;
	
	//đóng gói
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngayPH) throws Exception {
		if (ngayPH != null) {
			this.ngayPH = ngayPH;
		}else {
			throw new Exception("Ngày phát hành không được trống");
		}
	}
	public int getSoBH() {
		return soBH;
	}
	public void setSoBH(int soBH) throws Exception {
		if (soBH > 0) {
			this.soBH = soBH;
		}else {
			throw new Exception("Số bài hát phải >0");
		}
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public CDR(String maCD, String tuaCD, String caSi, Calendar ngayPH, int soBH, double giaThanh) throws Exception {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSi = caSi;
		if (ngayPH != null) {
			this.ngayPH = ngayPH;
		}else {
			throw new Exception("Ngày phát hành không được trống");
		}
		
		if (soBH > 0) {
			this.soBH = soBH;
		}else {
			throw new Exception("Số bài hát phải >0");
		}
		this.giaThanh = giaThanh;
	}
	
	//phương thức
	public double getThanhTien() {
		double tg = 0;
		tg = getGiaThanh()*getSoBH();
		return tg;
	}
	
	//from tiền tệ, ngày tháng theo Việt Nam
	Locale lc = new Locale("vi", "VN");
	NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
	DateFormat df = DateFormat.getDateInstance(3, lc);

	@Override
	public String toString() {
		return "Mã CD: " + maCD + ", tựa CD: " + tuaCD + ", ca sĩ: " + caSi + ", ngày phát hành: " 
	            + ngayPH + ", số bài hát: " + soBH
				+ ", giá thành: " + nf.format(getGiaThanh()) + ", thành tiền: " +
	            nf.format(getThanhTien()) + "1";
	}
}
