package Aplikasi;

import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class trans_pinjaman extends javax.swing.JFrame {
    
    boolean x;
    koneksi con=new koneksi();
    Date tgl=new Date();
    SimpleDateFormat noformat=new SimpleDateFormat("yyMM");
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        
    /* Membuat form Transaksi Pinjaman koperasi */
    public trans_pinjaman() {
        initComponents();
    
    }
    
 private void bersih()
 {
 ttgl.setText("");           tket.setText("");          tjmlbunga.setText("");       
 tpinj.setText("");          tlama.setText("");         ttotal.setText("");
 tpersenbunga.setText("");   tpersenadmin.setText("");  tangsuran.setText("");
 tnoang.setText("");         tnama.setText("");         talamat.setText("");
 tpekerjaan.setText("");     tbunga.setText("");        tadmin.setText(""); 
 }
    
 private void nonaktif()
 {
 ttgl.setEnabled(false);           tket.setEnabled(false);           tjmlbunga.setEnabled(false);       
 tpinj.setEnabled(false);          tlama.setEnabled(false);          ttotal.setEnabled(false); 
 tpersenbunga.setEnabled(false);   tpersenadmin.setEnabled(false);   tangsuran.setEnabled(false);
 tnama.setEnabled(false);          talamat.setEnabled(false);        tpekerjaan.setEnabled(false);
 tbunga.setEnabled(false);         tadmin.setEnabled(false);         tnopin.setEnabled(false);
 }
 
 private void aktif()
 {
 tket.setEnabled(true);           tnoang.setEnabled(true);          tpersenbunga.setEnabled(true);               
 tpinj.setEnabled(true);          tlama.setEnabled(true);           tpersenadmin.setEnabled(true);        
 } 
 
 private void nopinjam() 
 {
    try
    {
        con.setkoneksi();
        String nomor=null;
        con.rs=con.st.executeQuery("select right(nopinjam,3)+1 as no from trans_pinjaman order by nopinjam desc");
        if(con.rs.next()) 
        {
            nomor=con.rs.getString("no");
            while(nomor.length()<2)
            nomor="0"+nomor; 
            nomor="PJ-"+noformat.format(tgl)+nomor;
        }
        else
            nomor="PJ-"+noformat.format(tgl)+"0"; 
            tnopin.setText(nomor);
        }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}

private void awal()
 {
 bersih();
 nonaktif();
 nopinjam();
 ttgl.setText(format.format(tgl));
 tnoang.requestFocus();
 bhapus.setEnabled(false);
 bhitung.setEnabled(false);
 } 





    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnopin = new javax.swing.JTextField();
        ttgl = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnoang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        tpekerjaan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tket = new javax.swing.JTextField();
        tpinj = new javax.swing.JTextField();
        tlama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bsimpan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tjmlbunga = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        tangsuran = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tpersenbunga = new javax.swing.JTextField();
        tpersenadmin = new javax.swing.JTextField();
        tbunga = new javax.swing.JTextField();
        tadmin = new javax.swing.JTextField();
        bhitung = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bkeluar = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bcari = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaksi Pinjaman Koperasi");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No Pinjam :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tgl Pinjam :");

        tnopin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnopinActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Anggota"));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("No Anggota :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nama :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Alamat :");

        tnoang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnoangKeyPressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Pekerjaan :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tnoang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Keterangan Pinjaman"));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Keterangan :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Pinjaman Pokok :");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Lama Angsuran :");

        tlama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tlamaKeyPressed(evt);
            }
        });

        jLabel11.setText("Bulan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tket, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(tpinj)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tlama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpinj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Jumlah :");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Total Pinjaman :");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Angsuran :");

        tjmlbunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjmlbungaActionPerformed(evt);
            }
        });

        ttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttotalActionPerformed(evt);
            }
        });

        tangsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangsuranActionPerformed(evt);
            }
        });

        jLabel18.setText("Bunga [%] :");

        jLabel19.setText("Admin [%] :");

        tpersenbunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpersenbungaActionPerformed(evt);
            }
        });
        tpersenbunga.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tpersenbungaPropertyChange(evt);
            }
        });
        tpersenbunga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpersenbungaKeyPressed(evt);
            }
        });

        tpersenadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpersenadminActionPerformed(evt);
            }
        });
        tpersenadmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpersenadminKeyPressed(evt);
            }
        });

        tbunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbungaActionPerformed(evt);
            }
        });

        bhitung.setText("Hitung");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Keterangan :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Biaya Administrasi 3%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bhitung))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tpersenbunga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpersenadmin, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tadmin)
                            .addComponent(tbunga)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttotal)
                            .addComponent(tjmlbunga)
                            .addComponent(tangsuran)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpersenbunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tbunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpersenadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bhitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tjmlbunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tangsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        bkeluar.setText("Kembali");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsimpan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ttgl, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(tnopin))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bhapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bkeluar))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tnopin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bkeluar)
                    .addComponent(bhapus)
                    .addComponent(bcari))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnopinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnopinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnopinActionPerformed

    private void tpersenadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpersenadminActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tpersenadminActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
    try
    {
    con.setkoneksi();
    String sql="delete from trans_pinjaman where nopinjam='"+tnopin.getText()+"'";
    con.st.executeUpdate(sql);
    con.rs.close();
    JOptionPane.showMessageDialog(null,"Database Berhasil Terhapus","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
    con.conn.close();
    awal();
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
    }
}//GEN-LAST:event_bhapusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        awal();
        aktif();
    }//GEN-LAST:event_formWindowOpened

    private void tnoangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnoangKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
                con.setkoneksi();
                con.rs=con.st.executeQuery("select * from anggota where no_ang='"+tnoang.getText()+"'");
                if (con.rs.next())
                {
                    tnama.setText(con.rs.getString(2));
                    talamat.setText(con.rs.getString(3));
                    tpekerjaan.setText(con.rs.getString(6));
                    tket.requestFocus();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Nomor Anggota Tidak Tersedia");
                    tnoang.setText("");
                    tnoang.requestFocus();
                }
            }
            catch(Exception e)
            {
              
            }
        }
    }//GEN-LAST:event_tnoangKeyPressed

    private void tlamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlamaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
            {
                int lama=Integer.parseInt(tlama.getText());
                if(lama>=37)
                {
                    JOptionPane.showMessageDialog(null,"Lama angsuran tidak boleh lebih dari 36 bulan");
                    tlama.setText("");
                    tlama.requestFocus();
                }    
                else
                {
                    tpersenbunga.requestFocus();
                }
            }
            catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_tlamaKeyPressed

    private void tpersenbungaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpersenbungaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        double pinjam=Double.parseDouble(tpinj.getText());
        double bunga=Double.parseDouble(tpersenbunga.getText());
        double total=(bunga/100)*pinjam;
        tbunga.setText(Double.toString(total));
        tpersenadmin.requestFocus();
        }
    }//GEN-LAST:event_tpersenbungaKeyPressed

    private void tpersenbungaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tpersenbungaPropertyChange
       
    }//GEN-LAST:event_tpersenbungaPropertyChange

    private void tpersenadminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpersenadminKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        double pinjam=Double.parseDouble(tpinj.getText());
        double admin=Double.parseDouble(tpersenadmin.getText());
        double total=(admin/100)*pinjam;
        tadmin.setText(Double.toString(total));
        bhitung.setEnabled(true);
        bhitung.requestFocus();
        }
    }//GEN-LAST:event_tpersenadminKeyPressed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        tjmlbunga.setText(Double.toString(Double.parseDouble(tbunga.getText())+Double.parseDouble(tadmin.getText())));
        ttotal.setText(Double.toString(Double.parseDouble(tpinj.getText())+Double.parseDouble(tjmlbunga.getText())));
        tangsuran.setText(Double.toString(Double.parseDouble(ttotal.getText())/Double.parseDouble(tlama.getText())));
    }//GEN-LAST:event_bhitungActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        try
        {
            if (x!=true)
            {
                con.setkoneksi();
                String sql="insert into trans_pinjaman values('"+tnopin.getText()+"','"+ttgl.getText()+"','"+tnoang.getText()+"','"+tket.getText()+"','"+tpinj.getText()+"','"+tlama.getText()+"','"+tpersenbunga.getText()+"','"+tpersenadmin.getText()+"','"+tjmlbunga.getText()+"','"+ttotal.getText()+"','"+tangsuran.getText()+"')";                                                    
                con.st.executeUpdate(sql);      
            }
            else
            {
                String sql="update trans_pinjaman set noang='"+tnoang.getText()+"',nama_ang='"+tnama.getText()+"',alamat='"+talamat.getText()+"',pekerjaan='"+tpekerjaan.getText()+"',keterangan='"+tket.getText()+"',pinjpokok='"+tpinj.getText()+"',lama='"+tlama.getText()+"',bunga='"+tpersenbunga.getText()+"',admin='"+tpersenadmin.getText()+"',jml='"+tjmlbunga.getText()+"',total='"+ttotal.getText()+"',angsuran='"+tangsuran.getText()+"' where nopinjam='"+tnopin.getText()+"'";
                con.st.executeUpdate(sql);    
            }
            awal();
            aktif();
            con.rs.close();
            JOptionPane.showMessageDialog(null,"Database Berhasil Tersimpan","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
            con.conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
    String cari = JOptionPane.showInputDialog(null, "Pencarian Data berdasarkan Nomer Pinjam", "Harus diisi", JOptionPane.QUESTION_MESSAGE);
    try
    {
        con.setkoneksi();
        con.rs=con.st.executeQuery("select * from trans_pinjaman where nopinjam like '"+cari+"'");
        if (con.rs.next())
        {
            tnopin.setText(con.rs.getString(1));       ttgl.setText(con.rs.getString(2));
            tnoang.setText(con.rs.getString(3));       tket.setText(con.rs.getString(4));
            tpinj.setText(con.rs.getString(5));        tlama.setText(con.rs.getString(6));
            tpersenbunga.setText(con.rs.getString(7)); tpersenadmin.setText(con.rs.getString(8));
            tjmlbunga.setText(con.rs.getString(9));    ttotal.setText(con.rs.getString(10));
            tangsuran.setText(con.rs.getString(11));
            
            double pinjam=Double.parseDouble(tpinj.getText());
            double admin=Double.parseDouble(tpersenadmin.getText());
            double total=(admin/100)*pinjam;
            tadmin.setText(Double.toString(total));
            
            double pinjam1=Double.parseDouble(tpinj.getText());
            double bunga1=Double.parseDouble(tpersenbunga.getText());
            double total1=(bunga1/100)*pinjam1;
            tbunga.setText(Double.toString(total1));
            
            con.rs=con.st.executeQuery("select * from anggota where no_ang='"+tnoang.getText()+"'");
            if (con.rs.next())
            {    
            tnama.setText(con.rs.getString(2));    talamat.setText(con.rs.getString(3));
            tpekerjaan.setText(con.rs.getString(6));
            }
            bhapus.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan","Gagal",JOptionPane.WARNING_MESSAGE);
        }
        con.rs.close();
        con.conn.close();     
    }
    catch(Exception e){}
    }//GEN-LAST:event_bcariActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
    new Menuutama().setVisible(true);
    dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void tpersenbungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpersenbungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpersenbungaActionPerformed

    private void tbungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbungaActionPerformed

    private void tjmlbungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjmlbungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjmlbungaActionPerformed

    private void ttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttotalActionPerformed

    private void tangsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangsuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tangsuranActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trans_pinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField tadmin;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tangsuran;
    private javax.swing.JTextField tbunga;
    private javax.swing.JTextField tjmlbunga;
    private javax.swing.JTextField tket;
    private javax.swing.JTextField tlama;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnoang;
    private javax.swing.JTextField tnopin;
    private javax.swing.JTextField tpekerjaan;
    private javax.swing.JTextField tpersenadmin;
    private javax.swing.JTextField tpersenbunga;
    private javax.swing.JTextField tpinj;
    private javax.swing.JTextField ttgl;
    private javax.swing.JTextField ttotal;
    // End of variables declaration//GEN-END:variables
}