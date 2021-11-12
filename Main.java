import java.util.Scanner;

public class Main{
	

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("hay dien ten nhan vien");
	String ten_nhan_vien = scanner.nextLine();
	System.out.println("hay dien he so luong cua nhan vien");
	int he_so_luong = Integer.valueOf(scanner.nextLine());
	System.out.println("hay dien he so phu cap cua nhan vien");
	int phu_cap = Integer.valueOf(scanner.nextLine());
	System.out.println("hay dien chuc vu cua nhan vien cua ban");
	String chuc_vu = scanner.nextLine(); 
	int luong;
	if (chuc_vu.equals("NhanVienReRach")){
		NhanVienReRach nhanvien = new NhanVienReRach(ten_nhan_vien, he_so_luong, phu_cap);
		luong = nhanvien.luong();
		System.out.println(luong);
	}if (chuc_vu.equals("NhanVienCaoCap")){
		NhanVienCaoCap nhanvien = new NhanVienCaoCap(ten_nhan_vien, he_so_luong, phu_cap);
		luong = nhanvien.luong();
		System.out.println(luong);
	}if (chuc_vu.equals("TruongPhong")){
		TruongPhong nhanvien = new TruongPhong(ten_nhan_vien, he_so_luong, phu_cap);
		luong = nhanvien.luong();
		System.out.println(luong);
    	}
}
}

    
