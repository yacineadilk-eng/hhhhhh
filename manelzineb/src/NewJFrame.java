import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        bg1.add(rds);
        bg1.add(rdi);
        bg1.add(rdp);
        bg1.add(rdr);   
        rds.setEnabled(false);
        rdi.setEnabled(false);
        rdp.setEnabled(false);
        rdr.setEnabled(false);
        
        ref.setEditable(false);
        sym.setEditable(false);
        asym.setEditable(false);
        trans.setEditable(false);
        comp.setEditable(false);
        fer.setEditable(false);
        semit.setEditable(false);
        modele.setEditable(false);
    }
    
    int N ;
    int Mat[][];
    DefaultTableModel TM =new DefaultTableModel();
    String[] objets;
    double[] valeurs;
    DefaultTableModel TMObjets = new DefaultTableModel();                  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        b_1 = new javax.swing.JButton();
        t_2 = new javax.swing.JTextField();
        t_3 = new javax.swing.JTextField();
        b_2 = new javax.swing.JButton();
        b_3 = new javax.swing.JButton();
        rds = new javax.swing.JRadioButton();
        rdi = new javax.swing.JRadioButton();
        rdp = new javax.swing.JRadioButton();
        rdr = new javax.swing.JRadioButton();
        title1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sym = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        asym = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        trans = new javax.swing.JTextField();
        comp = new javax.swing.JTextField();
        fer = new javax.swing.JTextField();
        semit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        modele = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("cardinaliter de l'ensemble:");

        t_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_1ActionPerformed(evt);
            }
        });

        text.setColumns(20);
        text.setRows(5);
        jScrollPane2.setViewportView(text);

        b_1.setText("cree");
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });

        t_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_2ActionPerformed(evt);
            }
        });

        t_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_3ActionPerformed(evt);
            }
        });

        b_2.setText("valider");
        b_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2ActionPerformed(evt);
            }
        });

        b_3.setText("annuler");
        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });

        rds.setText("s");
        rds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdsActionPerformed(evt);
            }
        });

        rdi.setText("i");
        rdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdiActionPerformed(evt);
            }
        });

        rdp.setText("p");
        rdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpActionPerformed(evt);
            }
        });

        rdr.setText("r");
        rdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrActionPerformed(evt);
            }
        });

        title1.setText("Representation Matricielle");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)), "Proprietes"));

        jLabel2.setText("Reflexive:");

        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        jLabel3.setText("symetrique");

        jLabel4.setText("antisymetrique");

        jLabel5.setText("transitive");

        jLabel6.setText("complete");

        jLabel7.setText("ferres");

        jLabel8.setText("semi transitive");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semit)
                            .addComponent(fer)
                            .addComponent(comp)
                            .addComponent(trans)
                            .addComponent(sym)
                            .addComponent(asym)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(asym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(semit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 1, true), "Modele"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modele)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_1))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rds, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(t_2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(t_3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_2)
                                        .addGap(12, 12, 12)
                                        .addComponent(b_3))
                                    .addComponent(rdr, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(title1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_1)
                    .addComponent(t_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_2)
                    .addComponent(b_3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rds)
                    .addComponent(rdi)
                    .addComponent(rdp)
                    .addComponent(rdr))
                .addGap(20, 20, 20)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                   
    public void prop() {
        boolean Ref = verifRef();
        boolean Com =verifCom();
        boolean Sym = verifSyme();
        boolean Asym = verifAsym();
        boolean Trans = verifTrans();
        boolean Fer = verifFere();
        boolean Strans = veriSTrans();
        
        if (Trans) {
            if (Com) {
                modele.setText("Pre-Ordre Total");
                if (Asym) modele.setText("Ordre Total");
            }
            else {
                modele.setText("Pre-Ordre Partiel");
                if (Asym) modele.setText("Ordre Partiel");
                if (Com && Fer && Strans) modele.setText("Semi-Ordre");
            }
        }
        else modele.setText("");
    }
    // Reflexivite
    public boolean verifRef() {
        int rf = 1;
        for (int i = 0; i < N; i++) {
            if (Mat[i][i] == 0) rf = 0;
        }
        
        if (rf == 0) {
            ref.setText("Non");
            return false;
        }
        else {
            ref.setText("Oui");
            return true;
        }
    }
    // Completude
    public boolean verifCom() {
        int c = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 0 && Mat[j][i] == 0) c = 0;  
            }
        }
        if (c == 1) {
            comp.setText("Oui");
            return true;
        }
        else {
            comp.setText("Non");
            return false;
        }
    }
    // Symetrie
    public boolean verifSyme() {
        int  sm = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] !=  Mat[j][i]) sm = 0;
                
            }
        }
        if (sm == 0) {
            sym.setText("Non");
            return false;
        }
        else {
            sym.setText("Oui");
            return true;
        }
    }
    // Antisymetrie
    public boolean verifAsym() {
        int  as = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 1 && Mat[j][i] == 1 && i!=j) as = 0;
                
            }
        }
        if (as == 0) {
            asym.setText("Non");
            return false;
        }
        else {
            asym.setText("Oui");
            return true;
        }
    }
    // Transitivite
    public boolean verifTrans() {
        int  tr = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(Mat[i][j]==1 && Mat[j][k]==1 && Mat[i][k]==0) tr = 0;
                }
            }
        }
        if (tr == 0) {
            trans.setText("Non");
            return false;
        }
        else {
            trans.setText("Oui");
            return true;
        }
    }
    // Ferres
    public boolean verifFere() {
        int  fr = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int m = 0; m < N; m++){
                    if(Mat[i][j]==1 && Mat[k][m]==1 && Mat[i][m]==0 && Mat[k][j]==0) fr = 0;
                    }
                }
            }
        }
        if (fr == 0) {
            fer.setText("Non");
            return false;
        }
        else {
            fer.setText("Oui");
            return true;
        }
    }
    // Semi Transitivite
    public boolean veriSTrans() {
        int  str = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int m = 0; m < N; m++){
                    if(Mat[i][j]==1 && Mat[j][k]==1 && Mat[i][m]==0 && Mat[m][k]==0) str = 0;
                    }
                }
            }
        }
        if (str == 0) {
            semit.setText("Non");
            return false;
        }
        else {
            semit.setText("Oui");
            return true;
        }
    }
     
                                  
    private void t_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_1ActionPerformed

    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
                                       
    try {
        N = Integer.parseInt(t_1.getText());
        if (N <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Le nombre d'objets doit être positif!");
            return;
        }
        
        // Initialiser les tableaux
        objets = new String[N];
        valeurs = new double[N];
        Mat = new int[N][N];
        
        // Demander les objets via des dialogues
        for (int i = 0; i < N; i++) {
            // Demander le nom
            String nom = javax.swing.JOptionPane.showInputDialog(this, 
                "Entrez le nom de l'objet " + (i + 1) + ":");
            
            if (nom == null || nom.trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nom invalide!");
                return;
            }
            
            // Demander la valeur
            String valStr = javax.swing.JOptionPane.showInputDialog(this, 
                "Entrez la valeur pour '" + nom + "':");
            
            if (valStr == null) return;
            
            try {
                double val = Double.parseDouble(valStr);
                objets[i] = nom.trim();
                valeurs[i] = val;
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Valeur invalide!");
                return;
            }
        }
        
        // Créer le tableau des objets (jTable2)
        TMObjets.setColumnCount(0);
        TMObjets.addColumn("Objet");
        TMObjets.addColumn("Valeur");
        TMObjets.setRowCount(N);
        
        for (int i = 0; i < N; i++) {
            TMObjets.setValueAt(objets[i], i, 0);
            TMObjets.setValueAt(valeurs[i], i, 1);
        }
        jTable2.setModel(TMObjets);
        
        // Générer la matrice de relations automatiquement
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (valeurs[i] >= valeurs[j]) {
                    Mat[i][j] = 1;
                } else {
                    Mat[i][j] = 0;
                }
            }
        }
        
        // Créer le tableau de la matrice (jTable1)
        TM.setColumnCount(0);
        TM.addColumn("");
        
        for (int i = 0; i < N; i++) {
            TM.addColumn(objets[i]);
        }
        
        TM.setRowCount(N);
        for (int i = 0; i < N; i++) {
            TM.setValueAt(objets[i], i, 0);
            for (int j = 0; j < N; j++) {
                TM.setValueAt(Mat[i][j], i, j + 1);
            }
        }
        jTable1.setModel(TM);
        
        // Activer les boutons radio
        rds.setEnabled(true);
        rdi.setEnabled(true);
        rdp.setEnabled(true);
        rdr.setEnabled(true);
        
        // Analyser les propriétés et afficher le modèle
        prop();
        
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Tableaux créés avec succès!\nModèle: " + modele.getText());
        
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Entrez un nombre valide!");
    }
    }//GEN-LAST:event_b_1ActionPerformed

    private void t_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_2ActionPerformed

    private void t_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_3ActionPerformed

    private void b_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2ActionPerformed
        // TODO add your handling code here:
        int E1=t_2.getText().charAt(0);
        int E2=t_3.getText().charAt(0);
        TM.setValueAt("1", E1-97, E2-96);
        Mat[E1-97][E2-97]=1;
        jTable1.setModel(TM);
        prop();
    }//GEN-LAST:event_b_2ActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
        // TODO add your handling code here:
        char c1 = t_2.getText().charAt(0);
        char c2 = t_3.getText().charAt(0);

        int i = c1 - 'a';
        int j = c2 - 'a';

        Mat[i][j] = 0;
        TM.setValueAt("0", i, j + 1); 
        jTable1.setModel(TM);

        prop();
    }//GEN-LAST:event_b_3ActionPerformed

    private void rdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdsActionPerformed
        // TODO add your handling code here:
        StringBuilder couples = new StringBuilder();
        
        text.setText("");
        couples.append("Structure S: \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 1) {
                    couples.append("(").append((char)(i + 'a')).append(", ").append((char)(j + 'a')).append(")\n");
                } 
            }
        }
        text.setText(couples.toString());
    }//GEN-LAST:event_rdsActionPerformed

    private void rdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrActionPerformed
        // TODO add your handling code here:
        StringBuilder couples = new StringBuilder();
        
        text.setText("");
        couples.append("incomparabilite: \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 0 && Mat[j][i] == 0) {
                    couples.append("(").append((char)(i + 'a')).append(", ").append((char)(j + 'a')).append(")\n");
                } 
            }
        }
        text.setText(couples.toString());
    }//GEN-LAST:event_rdrActionPerformed

    private void rdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdiActionPerformed
        // TODO add your handling code here:
        StringBuilder couples = new StringBuilder();
        
        text.setText("");
        couples.append("indiferance: \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 1 && Mat[j][i] == 1) {
                    couples.append("(").append((char)(i + 'a')).append(", ").append((char)(j + 'a')).append(")\n");
                } 
            }
        }
        text.setText(couples.toString());
    }//GEN-LAST:event_rdiActionPerformed

    private void rdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpActionPerformed
        // TODO add your handling code here:
        StringBuilder couples = new StringBuilder();
        
        text.setText("");
        couples.append("preference: \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Mat[i][j] == 1  && i != j) {
                    couples.append("(").append((char)(i + 'a')).append(", ").append((char)(j + 'a')).append(")\n");
                } 
            }
        }
        text.setText(couples.toString());
    }//GEN-LAST:event_rdpActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asym;
    private javax.swing.JButton b_1;
    private javax.swing.JButton b_2;
    private javax.swing.JButton b_3;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JTextField comp;
    private javax.swing.JTextField fer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField modele;
    private javax.swing.JRadioButton rdi;
    private javax.swing.JRadioButton rdp;
    private javax.swing.JRadioButton rdr;
    private javax.swing.JRadioButton rds;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField semit;
    private javax.swing.JTextField sym;
    private javax.swing.JTextField t_1;
    private javax.swing.JTextField t_2;
    private javax.swing.JTextField t_3;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField trans;
    // End of variables declaration//GEN-END:variables
}
