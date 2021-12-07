public class Orang {
	protected String Nama;
	protected String TmptLahir;
	protected String TanggalLahir;

	public Orang(){

	}
	public Orang (String Nama, String TmptLahir, String TanggalLahir){
		this.Nama = Nama;
		this.TmptLahir = TmptLahir;
		this.TanggalLahir = TanggalLahir;
	}

	public String getNama(){
		return Nama;
	}

	public String getTmptLahir(){
		return TmptLahir;
	}

	public String getTanggalLahir(){
		return TanggalLahir;
	}

	public void setNama(String Nama){
		this.Nama = Nama;
	}

	public void setTmptLahir(String TmptLahir){
		this.TmptLahir = TmptLahir;
	}

	public void setTanggalLahir(String TanggalLahir){
		this.TanggalLahir = TanggalLahir;
	}
}
