import java.util.Scanner;

public class Main {
	public static void Menu(){
		System.out.println("----------Menu----------");
		System.out.println("1. Mahasiswa");
		System.out.println("2. Staff");
	}


	public static void main(String[] args) {
		Matakuliah matkul[] = {
			new Matakuliah ("IF111",100,100,100),
			new Matakuliah ("IF112",100,100,100),
			new Matakuliah ("IF123",100,100,100)
		};

		Mahasiswa mhs[] = {
			new Mahasiswa ("Yunika","Pekalongan","05-06-1999","22203","IF",matkul),
			new Mahasiswa ("Budiman","Bekasi","28-02-1999","12802","IF",matkul),
			new Mahasiswa ("Keenan","Semarang","18-02-1999","22333","IF",matkul)
		};

		Staff staff[] = {
				new Staff ("Andre","Pekalongan","05-06-1999","122203"),
				new Staff ("Julian","Bekasi","28-02-1999","122802"),
				new Staff ("Irawan","Semarang","18-02-1999","122333")
		};

		Scanner scanner = new Scanner(System.in);
		int pilihan,edit,uts,uas,tugas;
		String NIM,Matkul,NIK;
		for (;;){
			Menu();
			pilihan = scanner.nextInt();
			scanner.nextLine();

			if (pilihan == 1){
				System.out.println("----------Mahasiswa----------");
				System.out.print("Masukkan NIM : ");
				NIM = scanner.nextLine();

				for(int i=0; i<mhs.length;i++){
					if(mhs[i].getNIM().equals(NIM)){
						System.out.print("Masukkan Kode Matkul :");
							Matkul = scanner.nextLine();
							System.out.println("Nilai UTS :" +mhs[i].getMatakuliah(Matkul).getNilaiUTS());
							System.out.println("Nilai UAS :" +mhs[i].getMatakuliah(Matkul).getNilaiUAS());
							System.out.println("Nilai Tugas :" +mhs[i].getMatakuliah(Matkul).getNilaiTugas());
					}
				}
			}

			else if (pilihan == 2){
				System.out.println("--------Staff[01]---------");
				System.out.println("Masukkan NIK : ");
				NIK = scanner.nextLine();

				for (int i=0;i<staff.length;i++){
					if(staff[i].getNIK().equals(NIK)){
						System.out.print("NIM Mahasiswa : ");
						NIM = scanner.nextLine();
						for(int j=0;j<mhs.length;j++){
							if(mhs[j].getNIM().equals(NIM)){
								System.out.print("Masukkan kode matkul :");
								Matkul = scanner.nextLine();

								System.out.println("--------Staff[02]---------");
								System.out.println("1. Nilai UTS");
								System.out.println("2. Nilai Tugas");
								System.out.println("3. Nilai UAS");
								System.out.println("4. Semua");
								edit = scanner.nextInt();

								if (edit == 1){
									System.out.println("--------Staff[03]---------");
									System.out.print("Masukkan nilai : ");
									uts = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiUTS(uts);
								}

								else if (edit == 2){
									System.out.println("--------Staff[03]---------");
									System.out.print("Masukkan nilai : ");
									tugas = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiTugas(tugas);
								}

								else if (edit == 3){
									System.out.println("--------Staff[03]---------");
									System.out.print("Masukkan nilai : ");
									uas = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiUAS(uas);
								}

								else if (edit == 4){
									System.out.println("--------Staff[03]---------");
									System.out.print("Masukkan nilai UTS : ");
									uts = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiUTS(uts);

									System.out.print("Masukkan nilai Tugas : ");
									tugas = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiTugas(tugas);

									System.out.print("Masukkan nilai UAS: ");
									uas = scanner.nextInt();
									mhs[j].getMatakuliah(Matkul).setNilaiUAS(uas);

								}
							}
						}
					}
				}
			}
		}
	}
}

