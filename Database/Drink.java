
package Database;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;  // throw data into database
import java.sql.ResultSet;          // push data to database
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Drink extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    DefaultTableModel model;
    DecimalFormat df = new DecimalFormat("0.00");
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon iconerr = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    String sql;
    public Drink() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
        FetchData();
       
    }
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java_2_3pmp","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: "+e.getMessage());
        }
        return con;
  }
    double Total(int qty,double price)
    {
        return qty*price;
    }
    void InsertData(int code,String name,int qty,double price)
    {
        try {
            sql = "INSERT INTO tbproduct1(Code,Name,Qty,Price,Total)VALUES(?,?,?,?,?)";
            ps = connection().prepareStatement(sql);
            ps.setInt(1, code);
            ps.setString(2, name);
            ps.setInt(3, qty);
            ps.setDouble(4, price);
            ps.setDouble(5, Total(qty, price));
            int index = ps.executeUpdate();
            if(index>0)
            {
                JOptionPane.showMessageDialog(null, "Data Saved","SAVE", HEIGHT, icon);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    void FetchData()
    {
        model.setRowCount(0);
        try {
            sql = "SELECT *FROM tbproduct1";
            ps = connection().prepareStatement(sql);
            r = ps.executeQuery();
            while(r.next())
            {
                Object row[]={
                    r.getInt("Code"),
                    r.getString("Name"),
                    r.getInt("Qty"),
                    df.format(r.getDouble("Price"))+"$",
                    df.format(r.getDouble("Total"))+"$"
                };
                model.addRow(row);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
   
  
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        js7up = new javax.swing.JSpinner();
        btn7up = new necesario.MaterialButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jsbachus = new javax.swing.JSpinner();
        btnbachus = new necesario.MaterialButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jscarabao = new javax.swing.JSpinner();
        btncarabao = new necesario.MaterialButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jscocacola = new javax.swing.JSpinner();
        btncocacola = new necesario.MaterialButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jsfanta = new javax.swing.JSpinner();
        btnfanta = new necesario.MaterialButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jshell = new javax.swing.JSpinner();
        btnhell = new necesario.MaterialButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jsize = new javax.swing.JSpinner();
        btnize = new necesario.MaterialButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jsmonster = new javax.swing.JSpinner();
        btnmonster = new necesario.MaterialButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jspepsi = new javax.swing.JSpinner();
        btnpepsi = new necesario.MaterialButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jsprime = new javax.swing.JSpinner();
        btnprime = new necesario.MaterialButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jsredbold = new javax.swing.JSpinner();
        btnredbold = new necesario.MaterialButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jssting = new javax.swing.JSpinner();
        btnsting = new necesario.MaterialButton();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new rojeru_san.complementos.RSTableMetro();
        btnremove = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        txtcode = new javax.swing.JTextField();
        btnreset = new com.k33ptoo.components.KButton();
        btnexit = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1169, 624));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Energy Drink");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 30, 370, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Drink.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 0, 100, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\icons8-energy-drink-100.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 20, 80, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\7UP.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 150, 60, 100);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Qty :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 200, 40, 16);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Code : 1001");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 140, 80, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Name : 7UP");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 160, 80, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Price : 0.75$");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 180, 80, 17);

        js7up.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(js7up);
        js7up.setBounds(120, 200, 60, 30);

        btn7up.setBackground(new java.awt.Color(102, 102, 255));
        btn7up.setForeground(new java.awt.Color(51, 51, 51));
        btn7up.setText("Buy");
        btn7up.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btn7up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7upActionPerformed(evt);
            }
        });
        getContentPane().add(btn7up);
        btn7up.setBounds(80, 240, 60, 20);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 170, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Bachus.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 150, 60, 100);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Qty :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 200, 40, 16);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Code : 1002");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 140, 80, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Name : Bachus");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 160, 100, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Price : 0.75$");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(260, 180, 80, 17);

        jsbachus.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsbachus);
        jsbachus.setBounds(300, 200, 60, 30);

        btnbachus.setBackground(new java.awt.Color(102, 102, 255));
        btnbachus.setForeground(new java.awt.Color(51, 51, 51));
        btnbachus.setText("Buy");
        btnbachus.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnbachus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbachusActionPerformed(evt);
            }
        });
        getContentPane().add(btnbachus);
        btnbachus.setBounds(260, 240, 60, 20);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(200, 130, 170, 140);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Carabao.png")); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(380, 150, 60, 100);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Qty :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(440, 200, 40, 16);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Code : 1003");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(440, 140, 80, 17);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Name : Carabao");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(440, 160, 100, 17);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Price : 0.75$");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(440, 180, 80, 17);

        jscarabao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jscarabao);
        jscarabao.setBounds(480, 200, 60, 30);

        btncarabao.setBackground(new java.awt.Color(102, 102, 255));
        btncarabao.setForeground(new java.awt.Color(51, 51, 51));
        btncarabao.setText("Buy");
        btncarabao.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btncarabao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarabaoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarabao);
        btncarabao.setBounds(440, 240, 60, 20);

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel21);
        jLabel21.setBounds(380, 130, 170, 140);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\COCA.png")); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(560, 150, 60, 100);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Qty :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(630, 200, 40, 16);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Code : 1004");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(620, 140, 80, 17);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Name : Cocacola");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(620, 160, 110, 17);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Price : 0.75$");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(620, 180, 80, 17);

        jscocacola.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jscocacola);
        jscocacola.setBounds(660, 200, 60, 30);

        btncocacola.setBackground(new java.awt.Color(102, 102, 255));
        btncocacola.setForeground(new java.awt.Color(51, 51, 51));
        btncocacola.setText("Buy");
        btncocacola.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btncocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncocacolaActionPerformed(evt);
            }
        });
        getContentPane().add(btncocacola);
        btncocacola.setBounds(620, 240, 60, 20);

        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel27);
        jLabel27.setBounds(560, 130, 170, 140);

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\FANTA.png")); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(20, 300, 60, 100);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Qty :");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(80, 350, 40, 16);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Code : 1005");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(80, 290, 80, 17);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Name : Fanta");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(80, 310, 90, 17);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Price : 0.75$");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(80, 330, 80, 17);

        jsfanta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsfanta);
        jsfanta.setBounds(120, 350, 60, 30);

        btnfanta.setBackground(new java.awt.Color(102, 102, 255));
        btnfanta.setForeground(new java.awt.Color(51, 51, 51));
        btnfanta.setText("Buy");
        btnfanta.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnfanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfantaActionPerformed(evt);
            }
        });
        getContentPane().add(btnfanta);
        btnfanta.setBounds(80, 390, 60, 20);

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel33);
        jLabel33.setBounds(20, 280, 170, 140);

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Hell.png")); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(200, 300, 60, 100);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Qty :");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(260, 350, 40, 16);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Code : 1006");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(260, 290, 80, 17);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Name : Hell");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(260, 310, 80, 17);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Price : 0.75$");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(260, 330, 80, 17);

        jshell.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jshell);
        jshell.setBounds(300, 350, 60, 30);

        btnhell.setBackground(new java.awt.Color(102, 102, 255));
        btnhell.setForeground(new java.awt.Color(51, 51, 51));
        btnhell.setText("Buy");
        btnhell.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnhell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhellActionPerformed(evt);
            }
        });
        getContentPane().add(btnhell);
        btnhell.setBounds(260, 390, 60, 20);

        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel39);
        jLabel39.setBounds(200, 280, 170, 140);

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\IZE.png")); // NOI18N
        getContentPane().add(jLabel40);
        jLabel40.setBounds(380, 300, 60, 100);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Qty :");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(440, 350, 40, 16);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Code : 1007");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(440, 290, 80, 17);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Name : IZE");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(440, 310, 80, 17);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Price : 0.75$");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(440, 330, 80, 17);

        jsize.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsize);
        jsize.setBounds(480, 350, 60, 30);

        btnize.setBackground(new java.awt.Color(102, 102, 255));
        btnize.setForeground(new java.awt.Color(51, 51, 51));
        btnize.setText("Buy");
        btnize.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnizeActionPerformed(evt);
            }
        });
        getContentPane().add(btnize);
        btnize.setBounds(440, 390, 60, 20);

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel45);
        jLabel45.setBounds(380, 280, 170, 140);

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Monster.png")); // NOI18N
        getContentPane().add(jLabel46);
        jLabel46.setBounds(560, 300, 60, 100);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Qty :");
        getContentPane().add(jLabel47);
        jLabel47.setBounds(630, 350, 40, 16);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Code : 1008");
        getContentPane().add(jLabel48);
        jLabel48.setBounds(620, 290, 80, 17);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setText("Name : Monster");
        getContentPane().add(jLabel49);
        jLabel49.setBounds(620, 310, 100, 17);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Price : 0.75$");
        getContentPane().add(jLabel50);
        jLabel50.setBounds(620, 330, 80, 17);

        jsmonster.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsmonster);
        jsmonster.setBounds(660, 350, 60, 30);

        btnmonster.setBackground(new java.awt.Color(102, 102, 255));
        btnmonster.setForeground(new java.awt.Color(51, 51, 51));
        btnmonster.setText("Buy");
        btnmonster.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnmonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonsterActionPerformed(evt);
            }
        });
        getContentPane().add(btnmonster);
        btnmonster.setBounds(620, 390, 60, 20);

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel51);
        jLabel51.setBounds(560, 280, 170, 140);

        jLabel52.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Pepsi.png")); // NOI18N
        getContentPane().add(jLabel52);
        jLabel52.setBounds(20, 450, 60, 100);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Qty :");
        getContentPane().add(jLabel53);
        jLabel53.setBounds(80, 500, 40, 16);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Code : 1009");
        getContentPane().add(jLabel54);
        jLabel54.setBounds(80, 440, 80, 17);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Name : Pepsi");
        getContentPane().add(jLabel55);
        jLabel55.setBounds(80, 460, 80, 17);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Price : 0.75$");
        getContentPane().add(jLabel56);
        jLabel56.setBounds(80, 480, 80, 17);

        jspepsi.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jspepsi);
        jspepsi.setBounds(120, 500, 60, 30);

        btnpepsi.setBackground(new java.awt.Color(102, 102, 255));
        btnpepsi.setForeground(new java.awt.Color(51, 51, 51));
        btnpepsi.setText("Buy");
        btnpepsi.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnpepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpepsiActionPerformed(evt);
            }
        });
        getContentPane().add(btnpepsi);
        btnpepsi.setBounds(80, 540, 60, 20);

        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel57);
        jLabel57.setBounds(20, 430, 170, 140);

        jLabel58.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Prime.png")); // NOI18N
        getContentPane().add(jLabel58);
        jLabel58.setBounds(200, 450, 60, 100);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setText("Qty :");
        getContentPane().add(jLabel59);
        jLabel59.setBounds(260, 500, 40, 16);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Code : 1010");
        getContentPane().add(jLabel60);
        jLabel60.setBounds(260, 440, 80, 17);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Name : Prime");
        getContentPane().add(jLabel61);
        jLabel61.setBounds(260, 460, 90, 17);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Price : 0.75$");
        getContentPane().add(jLabel62);
        jLabel62.setBounds(260, 480, 80, 17);

        jsprime.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsprime);
        jsprime.setBounds(300, 500, 60, 30);

        btnprime.setBackground(new java.awt.Color(102, 102, 255));
        btnprime.setForeground(new java.awt.Color(51, 51, 51));
        btnprime.setText("Buy");
        btnprime.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeActionPerformed(evt);
            }
        });
        getContentPane().add(btnprime);
        btnprime.setBounds(260, 540, 60, 20);

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel63);
        jLabel63.setBounds(200, 430, 170, 140);

        jLabel64.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Redbold.png")); // NOI18N
        getContentPane().add(jLabel64);
        jLabel64.setBounds(380, 450, 60, 100);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("Qty :");
        getContentPane().add(jLabel65);
        jLabel65.setBounds(440, 500, 40, 16);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setText("Code : 1011");
        getContentPane().add(jLabel66);
        jLabel66.setBounds(440, 440, 80, 17);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel67.setText("Name : Redbold");
        getContentPane().add(jLabel67);
        jLabel67.setBounds(440, 460, 97, 17);

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setText("Price : 0.75$");
        getContentPane().add(jLabel68);
        jLabel68.setBounds(440, 480, 80, 17);

        jsredbold.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jsredbold);
        jsredbold.setBounds(480, 500, 60, 30);

        btnredbold.setBackground(new java.awt.Color(102, 102, 255));
        btnredbold.setForeground(new java.awt.Color(51, 51, 51));
        btnredbold.setText("Buy");
        btnredbold.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnredbold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnredboldActionPerformed(evt);
            }
        });
        getContentPane().add(btnredbold);
        btnredbold.setBounds(440, 540, 60, 20);

        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel69);
        jLabel69.setBounds(380, 430, 170, 140);

        jLabel70.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\New_Pic\\Sting.png")); // NOI18N
        getContentPane().add(jLabel70);
        jLabel70.setBounds(560, 450, 60, 100);

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel71.setText("Qty :");
        getContentPane().add(jLabel71);
        jLabel71.setBounds(630, 500, 40, 16);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel72.setText("Code : 1012");
        getContentPane().add(jLabel72);
        jLabel72.setBounds(620, 440, 80, 17);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setText("Name : Sting");
        getContentPane().add(jLabel73);
        jLabel73.setBounds(620, 460, 80, 17);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel74.setText("Price : 0.75$");
        getContentPane().add(jLabel74);
        jLabel74.setBounds(620, 480, 80, 17);

        jssting.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(jssting);
        jssting.setBounds(660, 500, 60, 30);

        btnsting.setBackground(new java.awt.Color(102, 102, 255));
        btnsting.setForeground(new java.awt.Color(51, 51, 51));
        btnsting.setText("Buy");
        btnsting.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        btnsting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstingActionPerformed(evt);
            }
        });
        getContentPane().add(btnsting);
        btnsting.setBounds(620, 540, 60, 20);

        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel75);
        jLabel75.setBounds(560, 430, 170, 140);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Qty", "Price", "Total"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(740, 130, 400, 360);

        btnremove.setText("Remove");
        btnremove.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove);
        btnremove.setBounds(750, 520, 100, 45);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(-1, 577, 1170, 20);
        jPanel1.add(txtcode);
        txtcode.setBounds(1080, 522, 64, 30);

        btnreset.setText("Reset");
        btnreset.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(860, 520, 100, 45);

        btnexit.setText("Exit");
        btnexit.setFont(new java.awt.Font("Niagara Solid", 1, 24)); // NOI18N
        jPanel1.add(btnexit);
        btnexit.setBounds(970, 520, 100, 45);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn7upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7upActionPerformed
      int qty = Integer.parseInt(js7up.getValue().toString());
       if(qty>0)
       {
            int code = 1001;
            String name="7UP";
            float price = 0.75f;
            Total(qty, price);
            InsertData(code, name, qty, price);
            FetchData();
            js7up.setValue(0);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Pls Select Qty");
       }
       
            
    }//GEN-LAST:event_btn7upActionPerformed

    private void btnbachusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbachusActionPerformed
       int qty = Integer.parseInt(jsbachus.getValue().toString());
       if(qty>0)
       {
            int code = 1002;
            String name="Bachus";
            float price = 0.75f;
            Total(qty, price);
            InsertData(code, name, qty, price);
            FetchData();
            jsbachus.setValue(0);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Pls Select Qty");
       }
    }//GEN-LAST:event_btnbachusActionPerformed

    private void btncarabaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarabaoActionPerformed
       
    }//GEN-LAST:event_btncarabaoActionPerformed

    private void btncocacolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncocacolaActionPerformed
       
    }//GEN-LAST:event_btncocacolaActionPerformed

    private void btnfantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfantaActionPerformed
        
    }//GEN-LAST:event_btnfantaActionPerformed

    private void btnhellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhellActionPerformed
         
    }//GEN-LAST:event_btnhellActionPerformed

    private void btnizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnizeActionPerformed
       
    }//GEN-LAST:event_btnizeActionPerformed

    private void btnmonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonsterActionPerformed
        
    }//GEN-LAST:event_btnmonsterActionPerformed

    private void btnpepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpepsiActionPerformed
        
    }//GEN-LAST:event_btnpepsiActionPerformed

    private void btnprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeActionPerformed
       
    }//GEN-LAST:event_btnprimeActionPerformed

    private void btnredboldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnredboldActionPerformed
      
    }//GEN-LAST:event_btnredboldActionPerformed

    private void btnstingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstingActionPerformed
        
    }//GEN-LAST:event_btnstingActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
       int code = Integer.parseInt(txtcode.getText());
        try {
            sql = "DELETE FROM tbproduct1 WHERE Code = ?";
            ps = connection().prepareStatement(sql);
            ps.setInt(1, code);
            int index = ps.executeUpdate();
            if(index>0)
            {
           
                JOptionPane.showMessageDialog(null, "Data Deleted","Delete", HEIGHT, icon);
                FetchData();
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtcode.setText(model.getValueAt(row,0).toString());
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        
    }//GEN-LAST:event_btnresetActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btn7up;
    private necesario.MaterialButton btnbachus;
    private necesario.MaterialButton btncarabao;
    private necesario.MaterialButton btncocacola;
    private com.k33ptoo.components.KButton btnexit;
    private necesario.MaterialButton btnfanta;
    private necesario.MaterialButton btnhell;
    private necesario.MaterialButton btnize;
    private necesario.MaterialButton btnmonster;
    private necesario.MaterialButton btnpepsi;
    private necesario.MaterialButton btnprime;
    private necesario.MaterialButton btnredbold;
    private com.k33ptoo.components.KButton btnremove;
    private com.k33ptoo.components.KButton btnreset;
    private necesario.MaterialButton btnsting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner js7up;
    private javax.swing.JSpinner jsbachus;
    private javax.swing.JSpinner jscarabao;
    private javax.swing.JSpinner jscocacola;
    private javax.swing.JSpinner jsfanta;
    private javax.swing.JSpinner jshell;
    private javax.swing.JSpinner jsize;
    private javax.swing.JSpinner jsmonster;
    private javax.swing.JSpinner jspepsi;
    private javax.swing.JSpinner jsprime;
    private javax.swing.JSpinner jsredbold;
    private javax.swing.JSpinner jssting;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private rojeru_san.complementos.RSTableMetro tbtable;
    private javax.swing.JTextField txtcode;
    // End of variables declaration//GEN-END:variables
}
