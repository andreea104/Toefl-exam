package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Participanti {
    private int id;
    private String firstName;
    private String lastName;
    private String cnp;
    private String email;
    private String gender;
    private String date;
    
    public Participanti() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCNP(String cnp) {
        this.cnp = cnp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCNP() {
        return cnp;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
    
    public String getDate() {
        return date;
    }

    
    public Participanti(int _id, String _fname, String _lname, String _cnp, String _email, String _gender, String _date)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.cnp = _cnp;
        this.email = _email;
        this.gender = _gender;
        this.date = _date;
 
    }
    
    //insert a new author function    
    public void addParticipanti(String _fname, String _lname, String _cnp, String _email, String _gender, String _date)
    {
        String insertQuery = "INSERT INTO `participanti`(`Nume`, `Prenume`, `Cnp`, `Email`, `Sex`, `Data_nasterii`) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _cnp);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setString(6, _date);
            
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Participant adaugat", "add member", 1);
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
}
    
    /*public void editMember(Integer _id, String _fname, String _lname, String _phone, String _email, String _gender, byte [] _picture)
    {
        String editQuery = "UPDATE `members` SET `firstName`= ?,`lastName`= ?,`phone`= ?,`email`= ?, `gender`= ?, `picture`= ? WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _picture);
            ps.setInt(7, _id);
             
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }*/
    
    /*public void removeMember(int _id)
    {
        String removeQuery = "DELETE FROM `members` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
               
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Removed", "remove member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    //get member by id
    public Participanti getParticipantiById(Integer _id) throws SQLException
    {
        Func_Class func = new Func_Class();
        
        String query = "SELECT * FROM `members` WHERE `id` = "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next() )
        {
            //System.out.println(rs.getString(4));
            return new Participanti(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
        }
        else
        {
            return null;
        }
    }
}
