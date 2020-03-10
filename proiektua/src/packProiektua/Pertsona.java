package packProiektua;
//nik ere ohar bat sartu dut

public class Pertsona {
//atributuak - JLG
	private int id;
	
	
//Eraikitzailea - JLG
	public Pertsona(int pId) {
		this.id=pId;
	}
	
//gainontzeko metodoak -JLG
	public boolean idBerdinaDu(Pertsona pPer) {
		boolean emaitza=false;
		
		if(this.id==5){
			emaitza=true;
		}
		return emaitza;
		
	
	}
	
}
