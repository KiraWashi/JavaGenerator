package generate;

import java.util.*;


public class Account implements IOperations {

    private int id;
    private boolean aDecouvert;
    private int solde;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public boolean getADecouvert() {
        return aDecouvert;
    }
    
    public void setADecouvert(boolean aDecouvert) {
        this.aDecouvert = aDecouvert;
    }
    public int getSolde() {
        return solde;
    }
    
    public void setSolde(int solde) {
        this.solde = solde;
    }

	public  void  debiter (  int somme  ) {
        this.solde =  this.solde  -  somme ;
        this.aDecouvert =  this.solde  <  0 ;
	}

	public  void  crediter (  int somme  ) {
        this.solde =  this.solde  +  somme ;
        this.aDecouvert =  this.solde  <  0 ;
	}

	public  Account (  int id  ) {
		this.id =  id ; 
	}


	public int testMethodeVide() {
    	return 0;
	}

}
