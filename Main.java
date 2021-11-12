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
	
	
	int num, i, j, temp;
        System.out.println("nhap vao so nhan vien va vien chuc:");
        num = scanner.nextInt();
        int array[] = new int[num];
        System.out.println("nhap vao thu nhap cac nhan vien:");
        for (i = 0; i < num; i++)
            array[i] = scanner.nextInt();
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("ket qua sau khi sap xep thu tu nhan vien la: ");
        

}
}

    