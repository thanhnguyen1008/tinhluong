public abstract class thongtinnhanvien {
    public String ten;
    public int heso;
    public int phucap;
	public abstract int luong();

    public thongtinnhanvien(String ten_nhan_vien, int he_so_luong, int phu_cap){
        ten = ten_nhan_vien;
        heso = he_so_luong;
        phucap = phu_cap;
    }
    
}
