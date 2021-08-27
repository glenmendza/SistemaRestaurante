
package Implementación;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class facturaSystem extends javax.swing.JFrame {
    
Time date = new Time();

DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form facturaSystem
     * @param Nombre
     * @param Orden
     */
    public facturaSystem() {
        initComponents();
      
    }
       
    
        
    
    
  
    facturaSystem(String Nombre,String Orden,String Hora,String Fecha,String B1,String B2,String B3,String B4,String R1,String R2,String R3,String R4,String R5,String R6,String R7,String R8,String P1P,String P1M,String P1G,String P2P,String P2M,String P2G,String P3P,String P3M,String P3G,String P4P,String P4M,String P4G,String ImpB1,String ImpB2,
            String ImpB3, String ImpB4,String ImpP1P,String ImpP1M,String ImpP1G,String ImpP2P, String ImpP2M, String ImpP2G,String ImpP3P,String ImpP3M,String ImpP3G,String ImpP4P,String ImpP4M,String ImpP4G,String ImpR1, String ImpR2, String ImpR3, String ImpR4, String ImpR5,String ImpR6,
            String ImpR7,String ImpR8,Boolean CheckB1,Boolean CheckB2,Boolean CheckB3, Boolean CheckB4,Boolean CheckP1,Boolean CheckP2,Boolean CheckP3,Boolean CheckP4,Boolean CheckR1,Boolean CheckR2,Boolean CheckR3,Boolean CheckR4,Boolean CheckR1G,Boolean CheckR2G,Boolean CheckR3G,Boolean CheckR4G) {
      
        initComponents();
        tablaFactura.setModel(model);
        String titu[]={"Producto","Precio_Uni","Cantidad","Importe"};
        model.setColumnIdentifiers(titu);
        tablaFactura.getColumnModel().getColumn(0).setPreferredWidth(200);
        
        
        
        this.Nombre = Nombre;
        this.Orden = Orden;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.B1 = B1;
        this.B2 = B2;
        this.B3 = B3;
        this.B4 = B4;
        this.R1 = R1;
        this.R2 = R2;
        this.R3 = R3;
        this.R4 = R4;
        this.R5 = R5;
        this.R6 = R6;
        this.R7 = R7;
        this.R8 = R8;
        this.P1P = P1P;
        this.P1M = P1M;
        this.P1G = P1G;
        this.P2P = P2P;
        this.P2M = P2M;
        this.P2G = P2G;
        this.P3P = P3P;
        this.P3M = P3M;
        this.P3G = P3G;
        this.P4P = P4P;
        this.P4M = P4M;
        this.P4G = P4G;
        this.ImpB1 = ImpB1;
        this.ImpB2 = ImpB2;
        this.ImpB3 = ImpB3;
        this.ImpB4 = ImpB4;
        this.ImpP1P = ImpP1P;
        this.ImpP1M = ImpP1M;
        this.ImpP1G = ImpP1G;
        this.ImpP2P = ImpP2P;
        this.ImpP2M = ImpP2M;
        this.ImpP2G = ImpP2G;
        this.ImpP3P = ImpP3P;
        this.ImpP3M = ImpP3M;
        this.ImpP3G = ImpP3G;
        this.ImpP4P = ImpP4P;
        this.ImpP4M = ImpP4M;
        this.ImpP4G = ImpP4G;
        this.ImpR1 = ImpR1;
        this.ImpR2 = ImpR2;
        this.ImpR3 = ImpR3;
        this.ImpR4 = ImpR4;
        this.ImpR5 = ImpR5;
        this.ImpR6 = ImpR6;
        this.ImpR7 = ImpR7;
        this.ImpR8 = ImpR8;
        this.CheckB1 = CheckB1;
        this.CheckB2 = CheckB2;
        this.CheckB3 = CheckB3;
        this.CheckB4 = CheckB4;
        this.CheckP1 = CheckP1;
        this.CheckP2 = CheckP2;
        this.CheckP3 = CheckP3;
        this.CheckP4 = CheckP4;
        this.CheckR1 = CheckR1;
        this.CheckR2 = CheckR2;
        this.CheckR3 = CheckR3;
        this.CheckR4 = CheckR4;
        this.CheckR1G = CheckR1G;
        this.CheckR2G = CheckR2G;
        this.CheckR3G = CheckR3G;
        this.CheckR4G = CheckR4G;
        
        
        txtNombreFactura.setText(String.valueOf(Nombre));
        txtOrdenFactura.setText(String.valueOf(Orden));
        jLabel9.setText(Hora);
        jLabel11.setText(Fecha);
      
        
        // Factruacion de Hamburguesas
        
        
      if (CheckB1){
        String rowData[]=new String[4];
        rowData[0]= "Pipe's Burger 1";
        rowData[1]= "2050";
        rowData[2]= B1;
        rowData[3]= ImpB1;
        model.addRow(rowData);
        Total();
    }
      if(CheckB2){
        String rowData[]=new String[4];
        rowData[0]= "Pipe's Burger 2";
        rowData[1]= "2850";
        rowData[2]= B2;
        rowData[3]= ImpB2;
        model.addRow(rowData);
        Total();  
      }
      if(CheckB3){
        String rowData[]=new String[4];
        rowData[0]= "Pipe's Burger 3";
        rowData[1]= "3350";
        rowData[2]= B3;
        rowData[3]= ImpB3;
        model.addRow(rowData);
        Total();  
    }
      if(CheckB4){
        String rowData[]=new String[4];
        rowData[0]= "Pipe's Burger 4";
        rowData[1]= "3550";
        rowData[2]= B4;
        rowData[3]= ImpB4;
        model.addRow(rowData);
        Total();  
        
        
      // Facturacion de Pizza
      
      }
      if(CheckP1){
        String rowData[]=new String[4];
        rowData[0]= "Jamon y Queso [Pequeña]";
        rowData[1]= "7500";
        rowData[2]= P1P;
        rowData[3]= ImpP1P;
        model.addRow(rowData);
        Total(); 
      }
       if(CheckP1){
        String rowData[]=new String[4];
        rowData[0]= "Jamon y Queso [Mediana]";
        rowData[1]= "9000";
        rowData[2]= P1M;
        rowData[3]= ImpP1M;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP1){
        String rowData[]=new String[4];
        rowData[0]= "Jamon y Queso [Grande]";
        rowData[1]= "10000";
        rowData[2]= P1G;
        rowData[3]= ImpP1G;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP2){
        String rowData[]=new String[4];
        rowData[0]= "Suprema [Pequeña]";
        rowData[1]= "7500";
        rowData[2]= P2P;
        rowData[3]= ImpP2P;
        model.addRow(rowData);
        Total(); 
      }
       if(CheckP2){
        String rowData[]=new String[4];
        rowData[0]= "Suprema [Mediana]";
        rowData[1]= "9000";
        rowData[2]= P2M;
        rowData[3]= ImpP2M;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP2){
        String rowData[]=new String[4];
        rowData[0]= "Suprema [Grande]";
        rowData[1]= "10000";
        rowData[2]= P2G;
        rowData[3]= ImpP2G;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP3){
        String rowData[]=new String[4];
        rowData[0]= "Hawaiana [Pequeña]";
        rowData[1]= "7500";
        rowData[2]= P3P;
        rowData[3]= ImpP3P;
        model.addRow(rowData);
        Total(); 
      }
       if(CheckP3){
        String rowData[]=new String[4];
        rowData[0]= "Hawaiana [Mediana]";
        rowData[1]= "9000";
        rowData[2]= P3M;
        rowData[3]= ImpP3M;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP3){
        String rowData[]=new String[4];
        rowData[0]= "Hawaiana [Grande]";
        rowData[1]= "10000";
        rowData[2]= P3G;
        rowData[3]= ImpP3G;
        model.addRow(rowData);
        Total(); 
      }
       if(CheckP4){
        String rowData[]=new String[4];
        rowData[0]= "Vegetariana [Pequeña]";
        rowData[1]= "7500";
        rowData[2]= P4P;
        rowData[3]= ImpP4P;
        model.addRow(rowData);
        Total(); 
      }
       if(CheckP4){
        String rowData[]=new String[4];
        rowData[0]= "Vegetariana [Mediana]";
        rowData[1]= "9000";
        rowData[2]= P4M;
        rowData[3]= ImpP4M;
        model.addRow(rowData);
        Total(); 
      }
      if(CheckP4){
        String rowData[]=new String[4];
        rowData[0]= "Vegetariana [Grande]";
        rowData[1]= "10000";
        rowData[2]= P4G;
        rowData[3]= ImpP4G;
        model.addRow(rowData);
        Total(); 
      }
    // Facturacion de Bebidas
      
     if (CheckR1){
       String rowData[]=new String[4];
       rowData[0]= "Coca Cola Regular [14oz]";
       rowData[1]= "25";
       rowData[2]= R1;
       rowData[3]= ImpR1;
       model.addRow(rowData);
       Total();
     }
     if (CheckR2){
       String rowData[]=new String[4];
       rowData[0]= "Pepsi Regular [14oz]";
       rowData[1]= "25";
       rowData[2]= R2;
       rowData[3]= ImpR2;
       model.addRow(rowData);
       Total();
     }
     if (CheckR3){
       String rowData[]=new String[4];
       rowData[0]= "Sprite Regular [14oz]";
       rowData[1]= "1000";
       rowData[2]= R3;
       rowData[3]= ImpR3;
       model.addRow(rowData);
       Total();
     }
     if (CheckR4){
       String rowData[]=new String[4];
       rowData[0]= "Te Frio Regular [14oz]";
       rowData[1]= "25";
       rowData[2]= R4;
       rowData[3]= ImpR4;
       model.addRow(rowData);
       Total();
     }
     if (CheckR1G){
       String rowData[]=new String[4];
       rowData[0]= "Coca Cola Regular [21oz]";
       rowData[1]= "75";
       rowData[2]= R5;
       rowData[3]= ImpR5;
       model.addRow(rowData);
       Total();
     }
       if (CheckR2G){
       String rowData[]=new String[4];
       rowData[0]= "Pepsi Regular [21oz]";
       rowData[1]= "70";
       rowData[2]= R6;
       rowData[3]= ImpR6;
       model.addRow(rowData);
       Total();
       }
       if (CheckR3G){
       String rowData[]=new String[4];
       rowData[0]= "Sprite Regular [21oz]";
       rowData[1]= "70";
       rowData[2]= R7;
       rowData[3]= ImpR7;
       model.addRow(rowData);
       Total();
       }
       if (CheckR4G){
       String rowData[]=new String[4];
       rowData[0]= "Te Frio Regular [21oz]";
       rowData[1]= "70";
       rowData[2]= R8;
       rowData[3]= ImpR8;
       model.addRow(rowData);
       Total();
       }
    }
    
     private double redondear(double num){
        return Math.rint(num*100)/100;
    }
    
  private void Total(){
  double subTotal = 0,iva,total;
  
        for(int i=0;i<tablaFactura.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(model.getValueAt(i, 3).toString());
            }
            subTotal=redondear(subTotal);
            labelSubTotal.setText(String.valueOf(subTotal));
            iva=0.13*subTotal;
            iva=redondear(iva);
            total=subTotal + iva;
            total=redondear(total);
            labelIva.setText(String.valueOf(iva));
            labelTotal.setText(String.valueOf(total));
  }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtOrdenFactura = new javax.swing.JTextField();
        txtNombreFactura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PagoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        labelIva = new javax.swing.JLabel();
        labelSubTotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnFactura2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente");

        txtOrdenFactura.setBackground(new java.awt.Color(255, 255, 255));

        txtNombreFactura.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Orden #");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pago");

        PagoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccionar]", "Efectivo", "Tarjeta de Credito", " " }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sub-total:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("IVA:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total:");

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio_Uni", "Cantidad", "Importe"
            }
        ));
        jScrollPane2.setViewportView(tablaFactura);

        labelIva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelIva.setForeground(new java.awt.Color(0, 0, 0));
        labelIva.setText("00.00");

        labelSubTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelSubTotal.setText("00.00");

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("00.00");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Factura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Hora:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIva)
                    .addComponent(labelSubTotal)
                    .addComponent(labelTotal))
                .addGap(15, 15, 15))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrdenFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtOrdenFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(PagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelIva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFactura2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFactura2.setText("Generar");
        btnFactura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactura2ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow_icon-icons.com_54057 (1).png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jMenu1.setText("File");

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        miSave.setText("Guardar Factura");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        // TODO add your handling code here:
        
        String documento;
        String mensaje;

        if(seleccionar.showDialog(null,"Save")==JFileChooser.APPROVE_OPTION)
        {
            archivo=seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("xlsx"))
            {
                documento=jScrollPane2.getName();
                //documento=jTextArea1.getText();
                mensaje=GuardarArchivo(archivo, documento);
                if (mensaje!=null)
                {
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Unsupported file",
                        "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            JOptionPane.showMessageDialog(null, "Save text document");
        }
        
    }//GEN-LAST:event_miSaveActionPerformed

    private void btnFactura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactura2ActionPerformed
        int numero = (int)(Math.random()*25+1);
        String tiempo = "10 min";
        JOptionPane.showMessageDialog(null, "La orden ya está siendo procesada\n"
                + "El tiempo estimado es de: "+numero+" minutos", "Pipe's Burguesas",JOptionPane.OK_OPTION);
        
        this.setVisible(false);
        new cashSystem().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFactura2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new cashSystem().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

        public String GuardarArchivo(File arch,String doc)
    {
        String mensaje=null;
        byte[] bytxt;
        try
        {
            salida = new FileOutputStream(arch);
            bytxt=doc.getBytes();
            salida.write(bytxt);
            mensaje="File Saved Successfully";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error",
                                            e.getMessage(),
                                            JOptionPane.ERROR_MESSAGE);
        }
        return mensaje;
    }
    
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(facturaSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturaSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturaSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturaSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturaSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PagoComboBox;
    private javax.swing.JButton btnFactura2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtNombreFactura;
    private javax.swing.JTextField txtOrdenFactura;
    // End of variables declaration//GEN-END:variables
    String Nombre;
    String Orden;
    String Hora;
    String Fecha;
    String B1;
    String B2;
    String B3;
    String B4;
    String R1;
    String R2;
    String R3;
    String R4;
    String R5;
    String R6;
    String R7;
    String R8;
    String P1P;
    String P1M;
    String P1G; 
    String P2P;
    String P2M;
    String P2G; 
    String P3P;
    String P3M;
    String P3G; 
    String P4P;
    String P4M;
    String P4G;
    String ImpB1;
    String ImpB2;
    String ImpB3;
    String ImpB4;
    String ImpP1P;
    String ImpP1M;
    String ImpP1G;
    String ImpP2P;
    String ImpP2M;
    String ImpP2G;
    String ImpP3P;
    String ImpP3M;
    String ImpP3G;
    String ImpP4P;
    String ImpP4M;
    String ImpP4G;
    String ImpR1;
    String ImpR2;
    String ImpR3;
    String ImpR4;
    String ImpR5;
    String ImpR6;
    String ImpR7;
    String ImpR8;
    Boolean CheckB1;
    Boolean CheckB2;
    Boolean CheckB3;
    Boolean CheckB4;
    Boolean CheckP1;
    Boolean CheckP2;
    Boolean CheckP3;
    Boolean CheckP4;
    Boolean CheckR1;
    Boolean CheckR2;
    Boolean CheckR3;
    Boolean CheckR4;
    Boolean CheckR1G;
    Boolean CheckR2G;
    Boolean CheckR3G;
    Boolean CheckR4G;
// Declaraciones globales para guardar archivo    
JFileChooser seleccionar = new JFileChooser();
File archivo;
FileInputStream entrada;
FileOutputStream salida;
}
