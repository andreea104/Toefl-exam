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
public class Join1_class {
    private String firstName;
    private String lastName;
   
    public Join1_class() {}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public Join1_class(String _fname, String _lname)
    {
        this.firstName = _fname;
        this.lastName = _lname;
    }
    
    public ArrayList<Join1_class> getList(String _name)
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P inner join centru_exam C ON P.Centru_ID = C.Centru_ID where C.Nume_centru = '"+_name +"'";
            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }
    
    public ArrayList<Join1_class> getList1(String _data, String _ora)
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P JOIN programari P1 on P.Programare_ID = P1.Programare_ID where P1.Data = '"+_data +"' AND P1.Ora = '"+_ora +"'";
            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }

    public ArrayList<Join1_class> getList4(String _nume)
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT E.Nume_eval as Nume, E.Prenume_eval as Prenume from evaluatori E JOIN eval_centru EC ON E.Eval_ID = EC.Eval_ID INNER JOIN centru_exam C ON EC.Centru_ID = C.Centru_ID where Nume_centru = '"+_nume +"'";
            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }

    public ArrayList<Join1_class> getList5(String _proba)
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from Participanti P inner join probe P1 ON P.Proba_ID = P1.Proba_ID WHERE Tip_proba = '"+_proba+"'";
            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }

    public ArrayList<Join1_class> getList6(String _nume, String _prenume)
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P JOIN centru_exam C ON P.Centru_ID = C.Centru_ID JOIN eval_centru EC ON P.Centru_ID = EC.Centru_ID JOIN Evaluatori E ON EC.Eval_ID = E.Eval_ID WHERE E.Nume_eval = '"+_nume+"' AND E.Prenume_eval = '"+_prenume+"'";

            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(j1);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

    }
    
    public ArrayList<Join1_class> getListS3()
    {
        ArrayList<Join1_class> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            String query = "SELECT Nume as Nume, Prenume as Prenume from participanti where Scor IN (SELECT MAX(Scor) from Participanti GROUP BY Centru_ID) order by Scor DESC";

            ResultSet rs = func.getData(query);
            
            Join1_class j1;
            
            while (rs.next())
            {
                j1 = new Join1_class(rs.getString("Nume"), rs.getString("Prenume")); // rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
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
