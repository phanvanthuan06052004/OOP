package mypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;


public class QLCHSCXE {
	public static List<KhachHang> dsKhach;
	public static List<Xe> dsXe;
	public static List<HDSCXe> dsHDSCXe;
	public static List<PhieuThu> dsPhieuThu;
	public static List<NhomTho> dsNhomTho;
	public static List<Tho> dsTho;
	public static List<LoaiCongViec> dsLoaiCV;
	public static List<CongViec> dsCongViec;
	public static List<ChiTietHDSC> dsChiTietHDSC;
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tao danh sach nhom Tho
		dsNhomTho=new ArrayList<>();
		TaoDSNhomTho();
		// Tao danh sach Tho
		dsTho=new ArrayList<>();
		TaoDSTho();
		// Bo sung cac thuoc tinh lien ket con thieu
		// Bo sung ma truong nhom
		dsNhomTho.get(0).setMatruongnhom("T02");
		dsNhomTho.get(1).setMatruongnhom("T05");
		dsNhomTho.get(2).setMatruongnhom("T09");
		// Tao danh sach KhachHang
		dsKhach=new ArrayList<KhachHang>();
		TaoDSKhachHang();
		// Tao danh sach Xe
		dsXe=new ArrayList<Xe>();
		TaoDSXe();
		// Tao danh sach HDSCXe
		dsHDSCXe=new ArrayList<HDSCXe>();
		TaoDSHDSCXe();
		// Tao danh sach Phieu thu
		dsPhieuThu=new ArrayList<PhieuThu>();
		TaoDSPhieuThu();
		// Tao danh sach LoaiCV
		dsLoaiCV=new ArrayList<LoaiCongViec>();
		TaoNhomCV();
		// Tao danh sach CongViec
		dsCongViec=new ArrayList<CongViec>();
		TaoCongViec();
		// Tao danh sach ChithietHDSC
		dsChiTietHDSC=new ArrayList<ChiTietHDSC>();
		TaoChiTietHDSC();
		// Tra loi cac cau hoi truy van
		//1- Liet ke danh sach cac tho thuoc nhom N01
		System.out.println("--Cau 01--");
		CauSo01("N02");
		System.out.println();
		System.out.println("--Cau 02--");
		CauSo02("N01");
		System.out.println();
		System.out.println("--Cau 03--");
		System.out.println("Số lượng thợ trong nhóm thợ có mã N03 là: " + CauSo03("N03"));
		System.out.println();
		System.out.println("--Cau 04--");
		CauSo04();
		System.out.println();
		System.out.println("--Cau 04 cach khac--");
		Cau4_1();
		System.out.println();
		System.out.println("--Cau 05--");
		Cau5();
		System.out.println();
		System.out.println("--Cau 06--");
		Cau06();
		System.out.println();
		System.out.println("--Cau 07--");
		System.out.println("Danh sach cac tho chua tham gia hop dong:");
		Cau07();
		System.out.println();
		System.out.println("--Cau 08--");
		System.out.println("Danh sach cac tho da tham gia tat ca cac hop dong: ");
		Cau08();
	}
	// Tao danh sach 
	public static void TaoDSNhomTho() {
		dsNhomTho.add(new NhomTho("N01", "DIEN", "Chuyen lam dien XE"));
		dsNhomTho.add(new NhomTho("N02", "MAY", "Chuyen lam may XE"));
		dsNhomTho.add(new NhomTho("N03", "SON", "Chuyen lam dong son"));
	}
	public static void TaoDSTho() {
		dsTho.add(new Tho("T01", "Nguyen Van A", "Nam", "N01"));
		dsTho.add(new Tho("T02", "Nguyen Van B", "Nam", "N01"));
		dsTho.add(new Tho("T03", "Nguyen Van C", "Nam", "N01"));
		dsTho.add(new Tho("T04", "Nguyen Van D", "Nu", "N02"));
		dsTho.add(new Tho("T05", "Nguyen Van E", "Nam", "N02"));
		dsTho.add(new Tho("T06", "Nguyen Van F", "Nam", "N02"));
		dsTho.add(new Tho("T07", "Nguyen Van G", "Nu", "N03"));
		dsTho.add(new Tho("T08", "Nguyen Van H", "Nam", "N03"));
		dsTho.add(new Tho("T09", "Nguyen Van I", "Nu", "N03"));
		dsTho.add(new Tho("T10", "Nguyen Van J", "Nam", "N03"));
	}
	public static void TaoDSKhachHang() {
		dsKhach.add(new KhachHang("KH001", "Nguyen Van Nam", "0903988999"));
		dsKhach.add(new KhachHang("KH002", "Le Minh An", "0913919293"));
	}
	public static void TaoDSXe() {
		dsXe.add(new Xe("51F2-223.44", "Lead", "Honda","KH001"));
		dsXe.add(new Xe("59F9-123.45", "SH", "Honda","KH001"));
		dsXe.add(new Xe("52F4-989.79", "Jutiper", "Yamaha","KH002"));

	}
	public static void TaoDSHDSCXe() {
		dsHDSCXe.add(new HDSCXe("HD0001", 2500000,"51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0002", 1500000,"52F4-989.79"));
		dsHDSCXe.add(new HDSCXe("HD0003", 500000,"59F9-123.45"));
		dsHDSCXe.add(new HDSCXe("HD0004", 750000,"51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0005", 3500000,"52F4-989.79"));
		dsHDSCXe.add(new HDSCXe("HD0006", 1500000,"51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0007", 4500000,"59F9-123.45"));
	}
	public static void TaoDSPhieuThu() {
		dsPhieuThu.add(new PhieuThu("PH00001", 1000000,"HD0001" ));
		dsPhieuThu.add(new PhieuThu("PH00002", 1000000,"HD0002" ));
		dsPhieuThu.add(new PhieuThu("PH00003", 1000000,"HD0001" ));
		dsPhieuThu.add(new PhieuThu("PH00004", 500000,"HD0001" ));
		dsPhieuThu.add(new PhieuThu("PH00005", 300000,"HD0002" ));
		dsPhieuThu.add(new PhieuThu("PH00006", 300000,"HD0003" ));
		dsPhieuThu.add(new PhieuThu("PH00007", 100000,"HD0003" ));
		dsPhieuThu.add(new PhieuThu("PH00008", 1000000,"HD0004" ));
		dsPhieuThu.add(new PhieuThu("PH00009", 1000000,"HD0005" ));
		dsPhieuThu.add(new PhieuThu("PH00010", 100000,"HD0005" ));
		dsPhieuThu.add(new PhieuThu("PH00011", 1000000,"HD0006" ));
		dsPhieuThu.add(new PhieuThu("PH00012", 300000,"HD0006" ));	
	}
	public static void TaoNhomCV(){
		dsLoaiCV.add(new LoaiCongViec("L01", "Bao duong XE"));
		dsLoaiCV.add(new LoaiCongViec("L02", "Lam may XE"));
		dsLoaiCV.add(new LoaiCongViec("L03", "Lam dien trong XE"));
		dsLoaiCV.add(new LoaiCongViec("L04", "Lam dong son XE"));
	}
	public static void TaoCongViec(){
		dsCongViec.add(new CongViec("CV001", "Thay nhot XE", "L01"));
		dsCongViec.add(new CongViec("CV002", "Thay nuoc mat XE", "L01"));
		dsCongViec.add(new CongViec("CV003", "Bom XE", "L01"));
		dsCongViec.add(new CongViec("CV004", "Thay bac dan banh XE", "L01"));
		dsCongViec.add(new CongViec("CV005", "Thay sen cam XE", "L02"));
		dsCongViec.add(new CongViec("CV006", "Xoay subap XE", "L02"));
		dsCongViec.add(new CongViec("CV007", "Tien rang nap nhot may XE", "L02"));
		dsCongViec.add(new CongViec("CV008", "Thay bo noi ly hop XE", "L02"));
		dsCongViec.add(new CongViec("CV009", "Thay sen nhong dia XE", "L02"));
		dsCongViec.add(new CongViec("CV010", "Them nuoc binh dien XE", "L03"));
		dsCongViec.add(new CongViec("CV011", "Thay bong den XE", "L03"));
		dsCongViec.add(new CongViec("CV012", "Thay binh dien XE", "L03"));
		dsCongViec.add(new CongViec("CV013", "Thay bobin suon XE", "L03"));
		dsCongViec.add(new CongViec("CV014", "Han bo XE", "L04"));
		dsCongViec.add(new CongViec("CV015", "Son XE", "L04"));
		dsCongViec.add(new CongViec("CV016", "Han suon XE", "L04"));
		dsCongViec.add(new CongViec("CV017", "Lam nguoi chi tiet trong XE", "L04"));
		dsCongViec.add(new CongViec("CV018", "Phuc hoi phuoc XE", "L04"));
	}
	public static void TaoChiTietHDSC(){
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV001", "T04", 180000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV002", "T04", 30000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV003", "T05", 5000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV010", "T03", 50000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV011", "T01", 100000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV012", "T01", 350000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV018", "T07", 210000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV016", "T07", 410000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV014", "T08", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV015", "T10", 5600000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV010", "T03", 50000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV011", "T03", 100000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV012", "T01", 350000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV018", "T08", 210000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV001", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV002", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV003", "T04", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV007", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV008", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV009", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV007", "T04", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV008", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV009", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV010", "T03", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV005", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV004", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV007", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV008", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV009", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV002", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV001", "T04", 180000));
	}
	// Cac cau hoi truy van
	// Cau 1 - Liet ke danh sach cac tho thuoc nhom biet mannhomtho
	public static void CauSo01(String manhomtho) {
		List<Tho> lTho=dsTho
				.stream()
				.filter(tho->tho.getManhomtho().equals(manhomtho))
				.collect(Collectors.toList());
		if(lTho.size()==0) {
			System.out.println("Nhom chua tuyen duoc tho nao ca!!!");
		}
		else {
			System.out.println("Danh sach cac tho thuoc nhom: "+manhomtho);
			for (Tho tho : lTho) {
				System.out.println("Ma tho "+tho.getMatho()+
						"; Ho ten: "+tho.getHotentho());
			}
		}
	}
	// Cau 2 -In thong tin truong nhom khi biet manhomtho
	public static void CauSo02(String manhomtho) {
		Optional<String> matruongnhom = dsNhomTho.stream()
				.filter(nhomTho -> nhomTho.getManhomtho().equals(manhomtho))
				.map(NhomTho::getMatruongnhom)
				.findFirst();

		if (matruongnhom.isPresent()) {
			System.out.println("Nhóm: "+manhomtho+" có trưởng nhóm: " + matruongnhom.get());
		} else {
			System.out.println("Không tìm thấy nhóm thợ với mã: " + manhomtho);
		}			
	}
	// Cau 3 - Cho biet nhom co bao nhieu tho khi biet manhomtho
	public static int CauSo03(String manhomtho) {
		long soLuongTho = dsTho.stream()
				.filter(tho -> tho.getManhomtho().equals(manhomtho))
				.count();
		return (int) soLuongTho;
	}
	// Cau 4- Cho biet nhom nao co nhieu tho nhat
	public static void CauSo04() {
		for(NhomTho nt : dsNhomTho){
			nt.setSotho(CauSo03(nt.getManhomtho()));
		}
		Optional<NhomTho> nhomCoNhieuThoNhat = dsNhomTho.stream()
				.max(Comparator.comparingInt(nhomTho -> nhomTho.getSotho()));
		nhomCoNhieuThoNhat.ifPresent(nhomTho -> {
			System.out.println("Nhóm thợ có số lượng thợ nhiều nhất là: " + nhomTho.getTennhomtho());
		});
	}
	//
	// Cau 4: Cho biet nhom tho nao co nhieu tho nhat
	public static void Cau4_1(){
		Map<String, Long> nhomThoMax = dsTho.stream()
				.collect(Collectors.groupingBy(Tho::getManhomtho, Collectors.counting()));

		Map.Entry<String, Long> maxEntry = nhomThoMax.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.orElse(null);
		if (maxEntry != null){
			System.out.println("Nhom tho co so luong tho dong nhat: " + maxEntry.getKey() + " So luong = " +
					maxEntry.getValue());
		}
		else{
			System.out.println("Khong co nhom tho nao.");
		}
	}
	// Cau05: In cac hop dong da duoc chi tra hoan tat tri gia hop dong
	public static void Cau5() {
		// nhom cac phieu thu theo hop dong va tinh tong tien thu
		Map<String, Double> totalSotienthuPerSodh = dsPhieuThu.stream()
				.collect(Collectors.groupingBy(PhieuThu::getSodh, 
						Collectors.summingDouble(PhieuThu::getSotienthu)));

		// dua ra hop dong da thu day du
		dsHDSCXe.stream()
		.filter(hd -> totalSotienthuPerSodh.getOrDefault(hd.getSohd(), 0.0) == hd.getTrigiahd())
		.forEach(hd -> System.out.println("Hop dong so " + hd.getSohd() + " da duoc chi tra du"));
	}
	// Cau 06: Hop dong gia tri lon nhat - nho nhat va >= gt trung binh
	public static void Cau06() {
		// Tinh gia tri trung binh
		OptionalDouble averageValue = dsHDSCXe.stream()
				.mapToDouble(HDSCXe::getTrigiahd)
				.average();

		// Tim cac hop dong co gia tri lon nhat
		dsHDSCXe.stream()
		.max(Comparator.comparingDouble(HDSCXe::getTrigiahd))
		.ifPresent(hd -> System.out.println("Hop dong co tri gia lon nhat: " + hd.getSohd()));

		// Tim cac hop dong co gia tri nho nhat
		dsHDSCXe.stream()
		.min(Comparator.comparingDouble(HDSCXe::getTrigiahd))
		.ifPresent(hd -> System.out.println("Hop dong co tri gia nho nhat: " + hd.getSohd()));

		//Tim cac hop dong co gia tri >= gia tri trung binh
		if (averageValue.isPresent()) {
			double avgVal = averageValue.getAsDouble();
			List<HDSCXe> aboveAverageContracts = dsHDSCXe.stream()
					.filter(hd -> hd.getTrigiahd() >= avgVal)
					.collect(Collectors.toList());

			System.out.println("Cac hop dong co tri gia lon hon hoac bang gia tri trung binh:");
			aboveAverageContracts.forEach(hd -> System.out.println("Hop dong: " + hd.getSohd() + ", Tri gia: " + hd.getTrigiahd()));
		}
	}
	// Cau 07: danh sách thợ không tham gia vào bất kỳ hợp đồng nào
	public static void Cau07() {
		// Tạo Set chứa mã thợ từ danh sách chi tiết hợp đồng
		Set<String> thopThamGiaHD = dsChiTietHDSC.stream()
				.map(ChiTietHDSC::getMatho)
				.collect(Collectors.toSet());
			// Lọc ra những thợ không tham gia hợp đồng
			List<Tho> thoKhongThamGiaHD = dsTho.stream()
					.filter(tho -> !thopThamGiaHD.contains(tho.getMatho()))
					.collect(Collectors.toList());

			// In ra danh sách thợ không tham gia hợp đồng
			thoKhongThamGiaHD.forEach(
					tho -> System.out.println("Ma tho: "+tho.getMatho()+"; Ho ten: "+tho.getHotentho()));
	}
	//
	public static void Cau08() {
		// Tạo tập hợp các thợ tham gia mỗi hợp đồng
		List<Set<String>> danhSachMaThoTrongTungHopDong = dsChiTietHDSC.stream()
				.map(hd -> dsChiTietHDSC.stream()
						.filter(ct -> ct.getSohd().equals(hd.getSohd()))
						.map(ChiTietHDSC::getMatho)
						.collect(Collectors.toSet()))
				.collect(Collectors.toList());

		// Tìm giao điểm của tất cả các tập hợp thợ này
		Set<String> thoThamGiaTatCaHopDong = danhSachMaThoTrongTungHopDong.stream()
				.skip(1)
				.collect(() -> new HashSet<>(danhSachMaThoTrongTungHopDong.get(0)), Set::retainAll, Set::retainAll);

		// In ra danh sách thợ tham gia tất cả hợp đồng
		dsTho.stream()
		.filter(tho -> thoThamGiaTatCaHopDong.contains(tho.getMatho()))
		.forEach(tho -> System.out.println("Ma tho: "+tho.getMatho()+"; Ho ten: "+tho.getHotentho()));
	}
}


