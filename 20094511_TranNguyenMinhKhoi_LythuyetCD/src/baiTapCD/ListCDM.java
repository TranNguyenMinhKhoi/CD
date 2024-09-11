package baiTapCD;

public class ListCDM {
	public int count;
	CDR[] ls;
	public ListCDM(int n) {
		ls = new CDR[n];
		count = 0;
	}
	
	//Tăng kích thước mảng
	public void tangKT() {
		CDR[] tam = new CDR[ls.length*2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls = tam;
	}
	
	public boolean themCDR(CDR cd) {
		if (count == ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCD().equalsIgnoreCase(cd.getMaCD())) {
				return false;
			}
		}
		ls[count]=cd;
		count++;
		return true;	
	}
	
	//Xóa CD
	public boolean xoa(String maXoa) {
		int viTri = -1;
		for (int i = 0; i < count; i++) {
			if(ls[i].getMaCD().equalsIgnoreCase(maXoa)) {
				viTri = i;
			}
		}
		if (viTri != -1) {
			for (int i = 0; i < count-1; i++)
				ls[i] = ls[i+1];
				count--;
				return true;
			} else {
				return false;
			}
		}
		
		public boolean capNhat(String ma, double gia) {
			int viTri = -1;
			for (int i = 0; i < count; i++) {
				if (ls[i].getMaCD().equalsIgnoreCase(ma)) {
					viTri = i;
				}
			}
			if (viTri != -1) {
				ls[viTri].setGiaThanh(gia);
				return true;
			}else {
				return false;
			}
	}
		public void sapXep() {
			for (int i = 0; i < count; i++) {
				for (int j = 0; j < count-1; j++) {
					if (ls[i].getMaCD().compareToIgnoreCase(ls[i].getMaCD())>0) {
						CDR tam = ls[i];
						ls[i] = ls[j];
						ls[j] = tam;	
					}
				}
			}
		}
		//in ra kết quả
		public CDR[] getCdrs() {
			return ls;
		}
}
