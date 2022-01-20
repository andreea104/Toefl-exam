package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Evaluatori
 {
    private int id;
    private String firstName;
    private String lastName;
    private String code;
    
    public Evaluatori() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public Evaluatori(int _id, String _fname, String _lname, String _code)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.code = _code;
    }
    
    //insert a new author function    
    public void addEvaluatori(String _fname, String _lname, String _code)
    {
        String insertQuery = "INSERT INTO `evaluatori`(`Nume_eval`, `Prenume_eval`, `Cod`) VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _code);

            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Evaluator adaugat", "add member", 1);
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

    
    public void editEvaluatori(Integer _id, String _fname, String _lname, String _code)
    {
        String editQuery = "UPDATE `evaluatori` SET `Nume_eval`= ?,`Prenume_eval`= ?,`Cod`= ? WHERE `Eval_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _code);
            ps.setInt(4, _id);
             
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
    
    public void removeEvaluatori(int _id)
    {
        String removeQuery = "DELETE FROM `evaluatori` WHERE `Eval_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
               
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Evaluator sters", "remove member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Evaluator nu a fost sters", "remove member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    //get member by id
    public Evaluatori getEvaluatorById(Integer _id) throws SQLException
    {
        Func_Class func = new Func_Class();
        
        String query = "SELECT * FROM `evaluatori` WHERE `Eval_ID` = "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next() )
        {
            //System.out.println(rs.getString(4));
            return new Evaluatori(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); 
        }
        else
        {
            return null;
        }
    }
}

