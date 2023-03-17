                                                                                                   
package swing_practice;


import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 * Hi this is my First Library
 * sd
 * @author Boruto
 * @version 1.0
 */
public class Billing 
{
    /**
     * hello world
     * @author andrei
     * @version 1.0
     */
  

    private static double total = 0;
    private static double grandTotal = 0;
     
     
     
    public static void display_MilkTeaData_inTable(JTable table, String sql)
    {
        
        DB_config display_data = new DB_config(sql);
        
        try     
        {
            table.setModel(DbUtils.resultSetToTableModel(display_data.rs));
            
            display_data.conn.close();
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(table, e, "Warning", 3);
        }

    }
    
   
    public static void show_AddOrderJFrame(JFrame addOrder_frame, String flavor, JLabel flavor_label)
    {

        if(addOrder_frame == null)
        {
            
            try 
            {
                flavor_label.setText(flavor);
                System.out.println("Flavor : " + flavor);
            } catch (Exception e) 
            {
                System.out.println(e);
            }
        } else
        {
            addOrder_frame.show();
            flavor_label.setText(flavor);
        }
        
        

    }
    
   
    public static void SetPrice(JLabel price_label, String price)
    {
        price_label.setText(price);
    }
    
    public static void AddsOn()       
    {
       
        
    }
  

    public static void addOrder(JTable table_order, Object[] datas, JSpinner qty_spinner)
    {
      DefaultTableModel tb_model = (DefaultTableModel)table_order.getModel(); 
      
      int order_count = Integer.parseInt(qty_spinner.getValue().toString());
      
      for(int i = 0; i < order_count; i++)
      {
           tb_model.addRow(datas);
      }
      
    }
    
  
    public static void compute_GrandTotal(JLabel grandTotal_label, JLabel total_label, JFrame addOrder_frame)
    {
        
        double total = Double.parseDouble(total_label.getText());
        grandTotal += total;

        grandTotal_label.setText(Double.toString(grandTotal));
        addOrder_frame.show(false);
        
    }
    
 
    public static class Sizes
    {

        public String size = "";

  
        public Sizes(JRadioButton[] r_btns) 
        {
          for(int i = 0; i < r_btns.length; i++)
          {
              if(r_btns[i].isSelected())
              {
                  this.size = r_btns[i].getText();
              }
          }
                
                
        }
        
        
        
    }
    
    
    
}
