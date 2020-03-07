package packProiektua;

public class Pertsona {
//atributuak
	private int id;
	
	
//Eraikitzailea
	public Pertsona(int pId) {
		this.id=pId;
	}
	
//gainontzeko metodoak
	public boolean idBerdinaDu(Pertsona pPer) {
		boolean emaitza=false;
		
		if(this.id==5){
			emaitza=true;
		}
		return emaitza;
		
	
	}
	
}
