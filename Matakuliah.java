public class Matakuliah {
	private String KodeMatkul;
	private int NilaiUTS, NilaiTugas, NilaiUAS;

	public Matakuliah(){

	}

	public Matakuliah(String KodeMatkul, int NilaiUTS, int NilaiTugas, int NilaiUAS){
		this.KodeMatkul = KodeMatkul;
		this.NilaiUTS = NilaiUTS;
		this.NilaiUAS = NilaiUAS;
		this.NilaiTugas = NilaiTugas;
	}

	public String getKodeMatkul(){
		return KodeMatkul;
	}

	public int getNilaiUTS(){
		return NilaiUTS;
	}

	public int getNilaiTugas(){
		return NilaiTugas;
	}

	public int getNilaiUAS(){
		return NilaiUAS;
	}

	public void setKodeMatkul(String KodeMatkul){
		this.KodeMatkul = KodeMatkul;
	}

	public void setNilaiUTS (int NilaiUTS){
		this.NilaiUTS = NilaiUTS;
	}

	public void setNilaiTugas (int NilaiTugas){
		this.NilaiTugas = NilaiTugas;
	}

	public void setNilaiUAS (int NilaiUAS){
		this.NilaiUAS = NilaiUAS;
	}




}
