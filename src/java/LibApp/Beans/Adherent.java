/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibApp.Beans;

import java.util.logging.Logger;

/**
 *
 * @author l.IsSaM.l
 */
public class Adherent {
    
    
        
        private int IdAdherent; 
        private String CodeAdherent;
        private String CIN;
        private String NomAdherent;
        private String PrenomAdherent;
        private String ProfessionAdherent;

    public Adherent() {
    }

    public Adherent(String CodeAdherent, String CIN, String NomAdherent, String PrenomAdherent, String ProfessionAdherent) {
        this.CodeAdherent = CodeAdherent;
        this.CIN = CIN;
        this.NomAdherent = NomAdherent;
        this.PrenomAdherent = PrenomAdherent;
        this.ProfessionAdherent = ProfessionAdherent;
    }

  

    public int getIdAdherent() {
        return IdAdherent;
    }

    public String getCodeAdherent() {
        return CodeAdherent;
    }

    public String getNomAdherent() {
        return NomAdherent;
    }

    public String getPrenomAdherent() {
        return PrenomAdherent;
    }

    public String getProfessionAdherent() {
        return ProfessionAdherent;
    }

    public void setIdAdherent(int IdAdherent) {
        this.IdAdherent = IdAdherent;
    }

    public void setCodeAdherent(String CodeAdherent) {
        this.CodeAdherent = CodeAdherent;
    }

    public void setNomAdherent(String NomAdherent) {
        this.NomAdherent = NomAdherent;
    }

    public void setPrenomAdherent(String PrenomAdherent) {
        this.PrenomAdherent = PrenomAdherent;
    }

    public void setProfessionAdherent(String ProfessionAdherent) {
        this.ProfessionAdherent = ProfessionAdherent;
    }

    @Override
    public String toString() {
        return "Adherent{" + "IdAdherent=" + IdAdherent + ", CodeAdherent=" + CodeAdherent + ", NomAdherent=" + NomAdherent + ", PrenomAdherent=" + PrenomAdherent + ", ProfessionAdherent=" + ProfessionAdherent + '}';
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }
  
    
    
    
}
