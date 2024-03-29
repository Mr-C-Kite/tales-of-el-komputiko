package application;

class RAUM extends DE{
    private String bezeichnung;
    private String kuerzel;
    private int index; //in am
    private boolean standort;
    private boolean raetselAktiv;
    
    RAUM(String bez, String k, int i){
        bezeichnung = bez;
        kuerzel = k;
        index = i;
        standort = false;
    }
    
    int gibIndex(){
        return index;
    }
    
    String gibKuerzel(){
        return kuerzel;
    }
    
    String gibBezeichnung(){
        return bezeichnung;
    }
    
    boolean gibRaetselAktiv() {
    	return raetselAktiv;
    }
    
    void RaetselTrue() {
    	raetselAktiv = true;
    	System.out.println("raetsel true");
    }
    
    void RaetselFalse() {
    	raetselAktiv = false;
    	System.out.println("raetsel false");
    }
    
    boolean standortSetzen(boolean b){
        return standort = b;
    }
}