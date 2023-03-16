/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing_practice;

import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Boruto
 * @version 1.0
 */
public class PopupMenu 
{
   /**
    * Show Menu of your Popup Menu 
    * 
    * @param evt
    * @param table
    * @param popMenu 
    */
    private static DefaultTableModel tb_model;
    
    public static void showMenu(MouseEvent evt, JTable table, JPopupMenu popMenu)
    {
          if(evt.getButton() == MouseEvent.BUTTON3)
        {
            if(table.getRowCount() != 0)
            {
                evt.isPopupTrigger();
                popMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                
            }
        }
        
    }
    
    public static void delete(JTable table)
    {
        tb_model = (DefaultTableModel) table.getModel();
        tb_model.removeRow(table.getSelectedRow());
    }
    
    
    
    
}
