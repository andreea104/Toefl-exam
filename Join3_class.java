/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utente
 */
public class Join3_class {
    private String Name;
    private String City;
   
    public Join3_class() {}

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

   
    
    public Join3_class(String _name, String _city)
    {
        this.Name = _name;
        this.City = _city;
    }
    
    public ArrayList<Join3_class> getList(String _data)
    {
        ArrayList<Join3_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT C.Nume_centru as Nume, C.Localitate as Localitate from centru_exam C INNER JOIN programari P ON C.Centru_ID = P.Centru_ID where P.Data = '"+_data+"'";
            ResultSet rs = func.getData(query);
            
            Join3_class j1;
            
            while (rs.next())
            {
                j1 = new Join3_class(rs.getString("Nume"), rs.getString("Localitate")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }
    
    public ArrayList<Join3_class> getList1(String _data, String _ora)
    {
        ArrayList<Join3_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P JOIN programari P1 on P.Programare_ID = P1.Programare_ID where P1.Data = '"+_data +"' AND P1.Ora = '"+_ora +"'";
            ResultSet rs = func.getData(query);
            
            Join3_class j1;
            
            while (rs.next())
            {
                j1 = new Join3_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }

    public ArrayList<Join3_class> getListS1()
    {
        ArrayList<Join3_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT C.Nume_centru as Nume, C.Localitate as Localitate from centru_exam C where(select avg(P1.Scor) from Participanti P1 where P1.Centru_ID = C.Centru_ID) > (select avg(P2.Scor) from Participanti P2)";
            ResultSet rs = func.getData(query);
            
            Join3_class j1;
            
            while (rs.next())
            {
                j1 = new Join3_class(rs.getString("Nume"), rs.getString("Localitate")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }

    /*public Join1_class get(String _name) throws SQLException
    {
        Func_Class func = new Func_Class();
        //System.out.println(_name);
        String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P inner join centru_exam C ON P.Centru_ID = C.Centru_ID where C.Nume_centru = '"+_name +"'";
        PreparedStatement ps = DB.getConnection().prepareStatement(query);
        //ps.setString(1, _name);
        ResultSet rs = func.getData(query);
        //My_Classes.Participanti member = new My_Classes.Participanti();

        if (rs.next() )
        {
            //System.out.println(rs.getString(1));
            //System.out.println(rs.getString(2  ));
            
            //return new Join1_class(rs.getString(1), rs.getString(2));
            
        }
         
    }*/
}
