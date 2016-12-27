/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibApp.Requetes;

import LibApp.Beans.Adherent;

/**
 *
 * @author l.IsSaM.l
 */
public class REQUETE {
    
    
    // LES REQUETES DES ADHERENTS 
    
     public static String Adhenrent_all()
    {
        return " select * from adherent;";
    }
    
    public static String Adh_CIN(String CIN)
    {
    return " select * from adherent where CIN ='"+CIN+"';";
    }
    
    public static String Adh_CODE(String CODE)
    {
    return " select * from adherent where CodeAdherent ='"+CODE+"';";
    }
    
    public static String Adh_like_Nom(String Nom)
    {
        return "select * from adherent where NomAdherent like '%"+Nom+"%';";
    }
    
    public static  String Adh_Add(Adherent Adh) 
    {
        
    
   
     return "INSERT INTO `adherent`(`CodeAdherent`, `CIN`, `NomAdherent`, `PrenomAdherent`, `ProfessionAdherent`) VALUES ('"+Adh.getCodeAdherent()+"','"+Adh.getCIN()+"','"+Adh.getNomAdherent()+"','"+Adh.getPrenomAdherent()+"','"+Adh.getProfessionAdherent()+"');" ;
    }
    
    public static String Adh_del_CIN(String CIN)
    {
        return "delete from adherent where CIN ='"+CIN+"';";
    }
    
    public static String Adh_del_CODE(String CODE)
    {
        return "delete from adherent where CodeAdherent ='"+CODE+"';";
    }
    
    
    public static String Adh_Update_By_CIN(Adherent Adh)
    {
        return "UPDATE Adherent SET CodeAdherent='"+Adh.getCodeAdherent()+"',NomAdherent='"+Adh.getNomAdherent()+"',PrenomAdherent='"+Adh.getPrenomAdherent()+"',ProfessionAdherent='"+Adh.getProfessionAdherent()+"' WHERE CIN ='"+Adh.getCIN()+"';";
    }
    
    public static String Adh_profil(String CIN , String CODE )
    {
    return "select * from adherent where CIN='"+CIN+"' and CodeAdherent='"+CODE+"';";
    }
     
  
}
