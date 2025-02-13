package generate;

import java.util.*;

public class Account {

    private int id;
    private int aDecouvert;
    private int solde;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getADecouvert() {
        return aDecouvert;
    }
    
    public void setADecouvert(int aDecouvert) {
        this.aDecouvert = aDecouvert;
    }
    public int getSolde() {
        return solde;
    }
    
    public void setSolde(int solde) {
        this.solde = solde;
    }

	public void Debiter (  int somme  ) {
        this.solde = this.solde - somme;
	}
	public void Crediter (  int somme  ) {
	}

}
