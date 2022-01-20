package My_Forms;

import My_Classes.Centre;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andreea
 */
public class EditCentreForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    
    //create a member object
    My_Classes.Centre centru = new My_Classes.Centre();
    
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    
    //crate a variable to store the profile picture path
    String imagePath = null;
    
    public EditCentreForm() {
        initComponents();
        
        this.setLocationRelativeTo(null); //center
        
        //add gray border
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(1, 152, 117));
        jPanel1.setBorder(panelHeaderBorder);
        
        //add a black border to the jlabel image
        Border jLabelImage_Border = BorderFactory.createMatteBorder(3,3,3,3, new Color(0, 0, 0));
        //jLabel_Image.setBorder(jLabelImage_Border);
        
        
        //dispaly image
        //My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(90, 60, null, "/My_images/members.png", jLabel1_FormTitle);

        
        //hide the jlabel "empty name message"
        jLabel_EmptyName_.setVisible(false);
        jLabel_EmptyCity_.setVisible(false);
        jLabel_EmptyStreet_.setVisible(false);
        jLabel_EmptyCounty_.setVisible(false);
        jLabel_EmptyNumber_.setVisible(false);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_CloseForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_EmptyCounty_ = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1_FormTitle = new javax.swing.JLabel();
        jTextField_County = new javax.swing.JTextField();
        jLabel_EmptyName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_City = new javax.swing.JTextField();
        jLabel_EmptyCity_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Street = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();
        jTextField_Number = new javax.swing.JTextField();
        jLabel_EmptyStreet_ = new javax.swing.JLabel();
        jLabel_EmptyNumber_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jLabel_CloseForm.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_CloseForm.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel_CloseForm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm.setText("X");
        jLabel_CloseForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm.setOpaque(true);
        jLabel_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel1.setText("Nume:");

        jTextField_Name.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jButton_Edit_.setText("Editare");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel_EmptyCounty_.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel_EmptyCounty_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyCounty_.setText("*introduceti judetul");
        jLabel_EmptyCounty_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyCounty_MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(1, 152, 117));

        jLabel1_FormTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1_FormTitle.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_FormTitle.setText("Editare Centru");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField_County.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_County.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CountyActionPerformed(evt);
            }
        });

        jLabel_EmptyName_.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel_EmptyName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyName_.setText("*introduceti numele");
        jLabel_EmptyName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyName_MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans CJK TC", 1, 14)); // NOI18N
        jLabel4.setText("Localitate:");

        jTextField_City.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CityActionPerformed(evt);
            }
        });

        jLabel_EmptyCity_.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel_EmptyCity_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyCity_.setText("*introduceti localitatea");
        jLabel_EmptyCity_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyCity_MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel6.setText("Judet:");

        jTextField_Street.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_Street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StreetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel7.setText("Strada:");

        jLabel_Img.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel_Img.setText("Numar:");

        jLabel2.setFont(new java.awt.Font("Noto Serif CJK TC", 1, 14)); // NOI18N
        jLabel2.setText("Introduceti ID-ul:");

        jTextField_Id.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jButton_Search_.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton_Search_.setText("cautare");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jTextField_Number.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextField_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NumberActionPerformed(evt);
            }
        });

        jLabel_EmptyStreet_.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel_EmptyStreet_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyStreet_.setText("*introduceti strada");
        jLabel_EmptyStreet_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyStreet_MouseClicked(evt);
            }
        });

        jLabel_EmptyNumber_.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel_EmptyNumber_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyNumber_.setText("*introduceti numarul");
        jLabel_EmptyNumber_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyNumber_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Edit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_Street, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_County, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_City, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_EmptyName_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_EmptyCity_)
                                    .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_EmptyCounty_)
                                    .addComponent(jLabel_EmptyStreet_))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Img)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_EmptyNumber_)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyName_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyCity_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_County, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyCounty_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyStreet_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyNumber_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        // TODO add your handling code here:
        
        //close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        
        jLabel_EmptyName_.setVisible(false);
        jLabel_EmptyCity_.setVisible(false);
        jLabel_EmptyStreet_.setVisible(false);
        jLabel_EmptyCounty_.setVisible(false);
        jLabel_EmptyNumber_.setVisible(false);
        
        //edit 
        Integer id = Integer.parseInt(jTextField_Id.getText());
        String name = jTextField_Name.getText();
        String city = jTextField_City.getText();
        String county = jTextField_County.getText();
        String street = jTextField_Street.getText();
        String number = jTextField_Number.getText();
        
        //check if the textfield is empty
        if (name.isEmpty())
        {
            jLabel_EmptyName_.setVisible(true);
        } 
        else if (city.isEmpty())
        {
            jLabel_EmptyCity_.setVisible(true);
        }
        else if (county.isEmpty())
        {
            jLabel_EmptyCounty_.setVisible(true);
        }
        else if (street.isEmpty())
        {
            jLabel_EmptyStreet_.setVisible(true);
        }
        else if (number.isEmpty())
        {
            jLabel_EmptyNumber_.setVisible(true);
        }
        /*else
        {
            byte [] img = null;
            
            if(imagePath != null)
            {
                
                try  
                {    
                    Integer id = Integer.parseInt(jTextField_Id.getText());
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    member.editMember(id, fname, lname, phone, email, gender, img);
                    
                } catch (IOException ex) {
                    Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Select a Profile Pic For This Member", "No Picture Selected", 2);
            }*/
            centru.editCentru(id, name, city, county, street, number);   
        

    }//GEN-LAST:event_jButton_Edit_ActionPerformed
    
    
    private void jLabel_EmptyCounty_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyCounty_MouseClicked
        
        // hide this jlabel on click
        jLabel_EmptyCounty_.setVisible(false);
        
    }//GEN-LAST:event_jLabel_EmptyCounty_MouseClicked

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_CountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CountyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CountyActionPerformed

    private void jLabel_EmptyName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyName_MouseClicked
        // TODO add your handling code here:
        // hide this jlabel on click
        jLabel_EmptyName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyName_MouseClicked

    private void jTextField_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CityActionPerformed

    private void jLabel_EmptyCity_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyCity_MouseClicked
        // TODO add your handling code here:
        // hide this jlabel on click
        jLabel_EmptyCity_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyCity_MouseClicked

    private void jTextField_StreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StreetActionPerformed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
 
        //get member data
        Centre SelectedMember;
        try {
            Integer id = Integer.parseInt(jTextField_Id.getText());
            SelectedMember = centru.getCentruById(id);
            
            if(SelectedMember != null)
            {
                jTextField_Id.setText(String.valueOf(SelectedMember.getId()));
                jTextField_Name.setText(SelectedMember.getName());
                jTextField_City.setText(SelectedMember.getCity());
                jTextField_County.setText(SelectedMember.getCounty());
                jTextField_Street.setText(SelectedMember.getStreet());
                jTextField_Number.setText(SelectedMember.getNumber());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Center With This ID Was Found", "Invalid Id", 3);
            }
            
        
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Member Id", "Invalid Id", 3);
        }
        
       
    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTextField_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NumberActionPerformed

    private void jLabel_EmptyStreet_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyStreet_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyStreet_MouseClicked

    private void jLabel_EmptyNumber_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyNumber_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyNumber_MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditCentreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCentreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCentreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCentreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCentreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_FormTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_EmptyCity_;
    private javax.swing.JLabel jLabel_EmptyCounty_;
    private javax.swing.JLabel jLabel_EmptyName_;
    private javax.swing.JLabel jLabel_EmptyNumber_;
    private javax.swing.JLabel jLabel_EmptyStreet_;
    private javax.swing.JLabel jLabel_Img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_County;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Number;
    private javax.swing.JTextField jTextField_Street;
    // End of variables declaration//GEN-END:variables
}
