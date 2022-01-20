package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Centre
 {
    private int id;
    private String name;
    private String city;
    private String county;
    private String street;
    private String number;
    
    public Centre() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    

    public Centre(int _id, String _name, String _city, String _county, String _street, String _number)
    {
        this.id = _id;
        this.name = _name;
        this.city = _city;
        this.county = _county;
        this.street = _street;
        this.number = _number;
    }
    
    //insert a new author function    
    public void addCentru(String _name, String _city, String _county, String _street, String _number)
    {
        String insertQuery = "INSERT INTO `centru_exam`(`Nume_centru`, `Localitate`, `Judet`, `Strada`, `Numar`) VALUES (?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _name);
            ps.setString(2, _city);
            ps.setString(3, _county);
            ps.setString(4, _street);
            ps.setString(5, _number);

            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Centru adaugat", "add member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Adaugare esuata", "add member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
    public void editCentru(Integer _id, String _name, String _city, String _county, String _street, String _number)
    {
        String editQuery = "UPDATE `centru_exam` SET `Nume_centru`= ?,`Localitate`= ?,`Judet`= ?, `Strada`=?, `Numar`=? WHERE `Centru_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _name);
            ps.setString(2, _city);
            ps.setString(3, _county);
            ps.setString(4, _street);
            ps.setString(5, _number);
            ps.setInt(6, _id);
             
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Editare reusita", "edit member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Editare esuata", "edit member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void removeCentru(int _id)
    {
        String removeQuery = "DELETE FROM `centru_exam` WHERE `Centru_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
               
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Centru sters", "remove member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Centrul nu a fost sters", "remove member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    //get member by id
    public Centre getCentruById(Integer _id) throws SQLException
    {
        Func_Class func = new Func_Class();
        
        String query = "SELECT * FROM `centru_exam` WHERE `Centru_ID` = "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next() )
        {
            //System.out.println(rs.getString(4));
            return new Centre(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)); 
        }
        else
        {
            return null;
        }
    }
}

