/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utente
 */
public class Select2_class {
    private String nrSubiect;
    private String tipSubiect;
    
    public Select2_class() {}

    public void setNrSubiect(String nrSubiect) {
        this.nrSubiect = nrSubiect;
    }

    public void setTipSubiect(String tipSubiect) {
        this.tipSubiect = tipSubiect;
    }

    public String getNrSubiect() {
        return nrSubiect;
    }

    public String getTipSubiect() {
        return tipSubiect;
    }

   public Select2_class(String nrSubiect, String tipSubiect)
    {
        this.nrSubiect = nrSubiect;
        this.tipSubiect = tipSubiect;
    }
   
    public ArrayList<Select2_class> getListS2()
    {
        ArrayList<Select2_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query =  "SELECT S.Nr_Subiect as Numar, S.Tip_subiect as Tip from subiecte S where (select count(P.Participant_ID) from Participanti P where P.Subiecte_ID = S.Subiecte_ID) = 0";
            ResultSet rs = func.getData(query);
            
            Select2_class j1;
            
            while (rs.next())
            {
                j1 = new Select2_class(rs.getString("Numar"), rs.getString("Tip")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }
}
