public class Mahasiswa extends Orang {
	private String NIM;
	private String Prodi;
	private Matakuliah[] Matakuliah = new Matakuliah[5];

	public Mahasiswa (){

	}

	public Mahasiswa (String Nama, String TmptLahir, String TanggalLahir, String NIM, String Prodi, Matakuliah[] Matakuliah){
		super(Nama,TmptLahir,TanggalLahir);
		this.NIM = NIM;
		this.Prodi = Prodi;
		for (int i=0;i<Matakuliah.length;i++){
			this.Matakuliah[i] = new Matakuliah(
					Matakuliah[i].getKodeMatkul(),
					Matakuliah[i].getNilaiUTS(),
					Matakuliah[i].getNilaiTugas(),
					Matakuliah[i].getNilaiUAS());
		}
	}

	public String getNIM(){
		return NIM;
	}

	public String getProdi(){
		return Prodi;
	}

	public Matakuliah getMatakuliah(String kode){
		Matakuliah temp  = new Matakuliah();
		for (int i=0; i<Matakuliah.length; i++){
			if (Matakuliah[i].getKodeMatkul().equals(kode)){
				temp = Matakuliah[i];
			}
		}
		return temp;
	}

	public void setNIM(String NIM){
		this.NIM = NIM;
	}

	public void setProdi(String Prodi){
		this.Prodi = Prodi;
	}

	public void setMatakuliah(Matakuliah[] Matakuliah){
		this.Matakuliah = Matakuliah;
	}
}
