
package Database;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;          // push data to database
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Student_CRUD {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon iconerr = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    String grade;
    double averager,total;
    String col[]={"ID","Name","Gender","Java","C#","PHP","Total","Average","Grade"};
    DefaultTableModel model = new DefaultTableModel(col, 0);
    DefaultTableModel getModel(){
       return model;
    }
   Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?autoReconnect=true&useSSL=false","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return con;
  }
   void CalculatorItem(double java,double csharp,double php)
   {
       total = java+csharp+php;
       averager = total/3;
       grade = (averager>90 && averager<=100)?"A":
               (averager>80 && averager<=90)?"B":
               (averager>70 && averager<=80)?"C":
               (averager>60 && averager<=70)?"D":
               (averager>50 && averager<=60)?"E":"F";           
   }
   void Save(String name,String gender,double java,double csharp,double php)
   {
       CalculatorItem(java, csharp, php);
       try {
           sql = "INSERT INTO tbstudent(Name,Gender,Java,C#,PHP,Total,Average,Grade) VALUES(?,?,?,?,?,?,?,?)";
           ps = connection().prepareStatement(sql);
           ps.setString(1,name);
           ps.setString(2, gender);
           ps.setDouble(3, java);
           ps.setDouble(4, csharp);
           ps.setDouble(5, php);
           ps.setDouble(6, total);
           ps.setDouble(7, averager);
           ps.setString(8, grade);
           int index = ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Saved","Save", index, icon);
           }
           
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
       }
   }
   void FetchData()
   {
       try {
           sql = "SELECT *FROM tbstudent";
           ps = connection().prepareStatement(sql);
           r = ps.executeQuery();
           model.setRowCount(0);
           while(r.next())
           {
               Object row[]={
                   r.getInt("ID"),
                   r.getString("Name"),
                   r.getString("Gender"),
                   r.getDouble("Java"),
                   r.getDouble("C_Sharp"),
                   r.getDouble("PHP"),
                   r.getDouble("Total"),
                   r.getDouble("Average"),
                   r.getString("Grade"),
               };
               model.addRow(row);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
   void Update(int id,String name,String gender,double java,double csharp,double php)
   {
       CalculatorItem(java, csharp, php);
       try {
           sql="UPDATE tbstudent SET Name=?,Gender=?,Java=?,C_Sharp=?,PHP=?,Total=?,Average=?,Grade=? WHERE ID=?";
           ps = connection().prepareStatement(sql);
           ps.setString(1,name);
           ps.setString(2, gender);
           ps.setDouble(3, java);
           ps.setDouble(4, csharp);
           ps.setDouble(5, php);
           ps.setDouble(6, total);
           ps.setDouble(7, averager);
           ps.setString(8, grade);
           ps.setInt(9, id);
           int index = ps.executeUpdate();
           if(index>0)
           {
               
               JOptionPane.showMessageDialog(null,"Data Updated","Save", index, icon);
               
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
   void Remove(int id)
   {
       try {
           sql = "DELETE FROM tbstudent WHERE ID =?";
           ps = connection().prepareStatement(sql);
           ps.setInt(1, id);
           int index=ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Removed","Save", index, icon);
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }
   void Reset()
   {
       try {
           sql = "DELETE FROM tbstudent";
           ps = connection().prepareStatement(sql);
           int index=ps.executeUpdate();
           if(index>0)
           {
               JOptionPane.showMessageDialog(null,"Data Reseted","Save", index, icon);
           }
           
       } catch (Exception e){  
           
           JOptionPane.showMessageDialog(null, e);
       }
   }
    
}
