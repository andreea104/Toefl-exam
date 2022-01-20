package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    private String score;
    private int centru_id;
    private int subiecte_id;
    private int proba_id;
    private int programare_id;
    
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

    public void setScore(String score) {
        this.score = score;
    }
    
    public void setCentru_id(int centru_id) {
        this.centru_id = centru_id;
    }

    public void setSubiecte_id(int subiecte_id) {
        this.subiecte_id = subiecte_id;
    }

    public void setProba_id(int proba_id) {
        this.proba_id = proba_id;
    }

    public void setProgramare_id(int programare_id) {
        this.programare_id = programare_id;
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

    public String getScore() {
        return score;
    }
    
    public int getCentru_id() {
        return centru_id;
    }

    public int getSubiecte_id() {
        return subiecte_id;
    }

    public int getProba_id() {
        return proba_id;
    }

    public int getProgramare_id() {
        return programare_id;
    }

    
    public Participanti(int _id, String _fname, String _lname, String _cnp, String _email, String _gender, String _date, String _score, int _centru, int _subiecte, int _proba, int _programare)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.cnp = _cnp;
        this.email = _email;
        this.gender = _gender;
        this.date = _date;
        this.score = _score;
        this.centru_id = _centru;
        this.subiecte_id = _subiecte;
        this.proba_id = _proba;
        this.programare_id = _programare;
 
    }
    
    //insert a new author function    
    public void addParticipanti(String _fname, String _lname, String _cnp, String _email, String _gender, String _date, String _score, int _centru, int _subiecte, int _proba, int _programare)
    {
        String insertQuery = "INSERT INTO `participanti`(`Nume`, `Prenume`, `CNP`, `Email`, `Sex`, `Data_nasterii`, `Scor`, `Centru_ID`, `Subiecte_ID`, `Programare_ID`, `Proba_ID`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _cnp);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setString(6, _date);
            ps.setString(7, _score);
            ps.setInt(8, _centru);
            ps.setInt(9, _subiecte);
            ps.setInt(10, _proba);
            ps.setInt(11, _programare);

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

    
    public void editMember(Integer _id, String _fname, String _lname, String _cnp, String _email, String _gender, String _date, String _score, int _centru, int _subiecte, int _proba, int _programare)
    {
        String editQuery = "UPDATE `participanti` SET `Prenume`= ?,`Nume`= ?,`CNP`= ?,`Email`= ?, `Sex`= ?, `Data_nasterii`= ?, `Scor`= ?, `Centru_ID`= ?, `Subiecte_ID`=?, `Proba_ID`=?, `Programare_ID`=? WHERE `Participant_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _cnp);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setString(6, _date);
            ps.setString(7, _score);
            ps.setInt(8, _centru);
            ps.setInt(9, _subiecte);
            ps.setInt(10, _proba);
            ps.setInt(11, _programare);
            ps.setInt(12, _id);
             
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
    
    public void removeMember(int _id)
    {
        String removeQuery = "DELETE FROM `participanti` WHERE `Participant_ID` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
               
            if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Participant sters", "remove member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Participantul nu a fost sters", "remove member", 2);
            }
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void showParticipanti(String _fname, String _lname, String _cnp, String _email, String _gender, String _date, String _score, int _centru, int _subiecte, int _proba, int _programare)
    {
        String showQuery = "SELECT * from `participanti`";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(showQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _cnp);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setString(6, _date);
            ps.setString(7, _score);
            ps.setInt(8, _centru);
            ps.setInt(9, _subiecte);
            ps.setInt(10, _proba);
            ps.setInt(11, _programare);
            
            
            /*if (ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Participant adaugat", "add member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Adaugare esuata", "add member", 2);
            }*/
         }
            
            
        catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   public ArrayList<Participanti> participantiList()
    {
        ArrayList<Participanti> aList = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();
        
        //String selectQuery = "SELECT * FROM `author`";
        //PreparedStatement ps;
        //ResultSet rs;
        
        try {
            //ps = DB.getConnection().prepareStatement(selectQuery);
            ResultSet rs = func.getData("SELECT * FROM `participanti`");
            
            Participanti p;
            
            while (rs.next())
            {
                p = new Participanti(rs.getInt("Participant_ID"), rs.getString("Nume"), rs.getString("Prenume"), rs.getString("Data_nasterii"), rs.getString("CNP"), rs.getString("Sex"), rs.getString("Email"), rs.getString("Scor"), rs.getInt("Centru_ID"), rs.getInt("Subiecte_ID"), rs.getInt("Programare_ID"), rs.getInt("Programare_ID"));
                aList.add(p);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;

}
    //get member by id
    public Participanti getParticipantiById(Integer _id) throws SQLException
    {
        Func_Class func = new Func_Class();
        
        String query = "SELECT * FROM `participanti` WHERE `Participant_ID` = "+_id;
        
        ResultSet rs = func.getData(query);
        
        if(rs.next() )
        {
            //System.out.println(rs.getString(4));
            return new Participanti(rs.getInt(1), rs.getString(3), rs.getString(2), rs.getString(5), rs.getString(8), rs.getString(6), rs.getString(4), rs.getString(7), rs.getInt(9), rs.getInt(10), rs.getInt(12), rs.getInt(11));
        }
        else
        {
            return null;
        }
    }
     
    

     public Participanti get(String _name) throws SQLException
    {
        Func_Class func = new Func_Class();
        //System.out.println(_name);
        String query = "SELECT P.Nume as Nume, P.Prenume as Prenume from participanti P inner join centru_exam C ON P.Centru_ID = C.Centru_ID where C.Nume_centru = '"+_name +"'";
        PreparedStatement ps = DB.getConnection().prepareStatement(query);
        //ps.setString(1, _name);
        ResultSet rs = func.getData(query);
        My_Classes.Participanti member = new My_Classes.Participanti();

        while (rs.next() )
        {
            //System.out.println(rs.getString(1));
            System.out.println(rs.getString(2  ));
            //return 
            
        }
         
       return null;
    }

    
}
