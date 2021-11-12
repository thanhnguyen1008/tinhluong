public class TruongPhong extends thongtinnhanvien{
    public TruongPhong(String ten_nhan_vien, int he_so_luong, int phu_cap){

        super(ten_nhan_vien, he_so_luong, phu_cap);
        
    }
    @Override
        public int luong() {
            return 5000000 + (heso + phucap) * 1310;

        }
}
