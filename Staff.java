public class Staff extends Orang{
	private String NIK;

	public Staff(){

	}

	public Staff(String Nama, String TmptLahir, String TanggalLahir, String NIK){
		super(Nama,TmptLahir,TanggalLahir);
		this.NIK = NIK;
	}

	public String getNIK (){
		return NIK;
	}

	public void setNIK(String NIK){
		this.NIK = NIK;
	}
}
