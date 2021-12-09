package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Func_Class {
    
    public void displayImage(int width, int height, byte [] imagebyte, String imagePath, JLabel label)
    {
        //get image
        ImageIcon imgIco;
        
        if (imagebyte != null) //get the image using bytes
        {
            imgIco = new ImageIcon(imagebyte);
        }
        else
        {
            try 
            {
                imgIco = new ImageIcon(getClass().getResource(imagePath)); //get the image from the project resources
            }
            catch(Exception e)
            {
                imgIco = new ImageIcon(imagePath);
            }
        }
        
        //ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        //make it fit jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        //set the image into the jlabel
        label.setIcon(new ImageIcon(image));
          
    }
    
     //function to return a resultSet used to reduce the code when populating 
     //the array list
    
    public ResultSet getData(String query)
    {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
            }
            catch (SQLException ex) {
                Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return rs;
    }
    
    //create a function to customize the jtable
    public void customTable(JTable table)
    {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);
    }
    
    //create a function to customize the jtable header
    public void customTableHeader(JTable table, Color back_Color, Integer fontSize)
    {
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));
        table.getTableHeader().setOpaque(false);
    }
     
}


