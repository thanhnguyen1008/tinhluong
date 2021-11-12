public class NhanVienCaoCap extends thongtinnhanvien{
    public NhanVienCaoCap(String ten_nhan_vien, int he_so_luong, int phu_cap){
        super(ten_nhan_vien, he_so_luong, phu_cap);
        
    }
    @Override
        public int luong() {
            return 3000000 + (heso + phucap) * 1310;
        
        }
}
