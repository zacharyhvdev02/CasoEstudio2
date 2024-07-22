package com.mycompany.views;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.mycompany.ilib.DAOUsersImpl;
import com.mycompany.interfaces.DAOUsers;

public class UpUsers extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Users userEdition;

    public UpUsers() {
        initComponents();
        InitStyles();
    }

    public UpUsers(com.mycompany.models.Users user) {
        initComponents();
        isEdition = true;
        userEdition = user;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        nameTxt.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del usuario.");
        apPTxt.putClientProperty("JTextField.placeholderText", "Ingrese el apellido paterno del usuario.");
        apMTxt.putClientProperty("JTextField.placeholderText", "Ingrese el apellido materno del usuario.");
        domTxt.putClientProperty("JTextField.placeholderText", "Ingrese el domicilio del usuario.");
        phoneTxt.putClientProperty("JTextField.placeholderText", "Ingrese el teléfono del usuario.");

        if (isEdition) {
            title.setText("Editar Usuario");
            button.setText("Guardar");

            if (userEdition != null) {
                nameTxt.setText(userEdition.getName());
                apPTxt.setText(userEdition.getLast_name_p());
                apMTxt.setText(userEdition.getLast_name_m());
                domTxt.setText(userEdition.getDomicilio());
                phoneTxt.setText(userEdition.getTel());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        apPLbl = new javax.swing.JLabel();
        apPTxt = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();
        apMTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        domLbl = new javax.swing.JLabel();
        domTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        phoneLbl = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar nuevo Usuario");

        nameLbl.setText("Nombre");

        apPLbl.setText("Apellido Paterno");

        apMLbl.setText("Apellido Materno");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        domLbl.setText("Domicilio");

        domTxt.setToolTipText("");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        phoneLbl.setText("Teléfono");

        phoneTxt.setToolTipText("");

        JLabel lblNombreDeUsuario = new JLabel();
        lblNombreDeUsuario.setText("Nombre de usuario");

        txtUsername = new JTextField();
        txtUsername.setToolTipText("");

        txtPassword = new JTextField();
        txtPassword.setToolTipText("");

        JLabel phoneLbl_1_1 = new JLabel();
        phoneLbl_1_1.setText("Contraseña");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(nameLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(223))
                                                        .addComponent(nameTxt, 260, 260, 260)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(apPLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(182))
                                                        .addComponent(apPTxt, 260, 260, 260)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(apMLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(180))
                                                        .addComponent(apMTxt, 260, 260, 260))
                                                .addGap(68)
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(70)
                                                .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE,
                                                                        260, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                                        .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(bgLayout.createSequentialGroup()
                                                                        .addGroup(bgLayout
                                                                                .createParallelGroup(Alignment.TRAILING)
                                                                                .addComponent(button,
                                                                                        GroupLayout.PREFERRED_SIZE, 224,
                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtPassword,
                                                                                        GroupLayout.PREFERRED_SIZE, 260,
                                                                                        GroupLayout.PREFERRED_SIZE))
                                                                        .addContainerGap())
                                                                .addGroup(bgLayout.createSequentialGroup()
                                                                        .addGroup(bgLayout
                                                                                .createParallelGroup(Alignment.LEADING)
                                                                                .addComponent(domTxt, 260, 260, 260)
                                                                                .addGroup(bgLayout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(domLbl,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addGap(220))
                                                                                .addComponent(phoneTxt, 260, 260, 260)
                                                                                .addGroup(bgLayout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(phoneLbl,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addGap(218)))
                                                                        .addGap(72))
                                                                .addGroup(bgLayout.createSequentialGroup()
                                                                        .addComponent(phoneLbl_1_1,
                                                                                GroupLayout.PREFERRED_SIZE, 70,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addContainerGap()))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(lblNombreDeUsuario)
                                                                .addContainerGap())))
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(title, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                .addGap(553)))));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(nameLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18)
                                                                .addComponent(apPLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(apPTxt, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18)
                                                                .addComponent(apMLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(apMTxt, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(bgLayout.createSequentialGroup()
                                                                .addComponent(domLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(domTxt, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18)
                                                                .addComponent(phoneLbl, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(phoneTxt, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(lblNombreDeUsuario)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE,
                                                                        40, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7)))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(phoneLbl_1_1)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 40,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(button, GroupLayout.PREFERRED_SIZE, 50,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(31))
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 360,
                                                        Short.MAX_VALUE)
                                                .addGap(26)))));
        bg.setLayout(bgLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(bg, GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(bg, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE));
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonActionPerformed
        String nombre = nameTxt.getText();
        String apP = apPTxt.getText();
        String apM = apMTxt.getText();
        String dom = domTxt.getText();
        String tel = phoneTxt.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // Validaciones para los campos
        if (nombre.isEmpty() || apP.isEmpty() || apM.isEmpty() || dom.isEmpty() || tel.isEmpty() || username.isEmpty()
                || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            nameTxt.requestFocus();
            return;
        }

        com.mycompany.models.Users user = isEdition ? userEdition : new com.mycompany.models.Users();
        user.setName(nombre);
        user.setLast_name_p(apP);
        user.setLast_name_m(apM);
        user.setDomicilio(dom);
        user.setTel(tel);
        user.setUsername(username);
        user.setPassword(password);

        try {
            DAOUsers dao = new DAOUsersImpl();

            if (!isEdition) {
                dao.registrar(user);
            } else {
                dao.modificar(user);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " exitosamente.\n", "AVISO",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                nameTxt.setText("");
                apPTxt.setText("");
                apMTxt.setText("");
                domTxt.setText("");
                phoneTxt.setText("");
                txtUsername.setText("");
                txtPassword.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el usuario. \n",
                    "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }// GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apMLbl;
    private javax.swing.JTextField apMTxt;
    private javax.swing.JLabel apPLbl;
    private javax.swing.JTextField apPTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel domLbl;
    private javax.swing.JTextField domTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel title;
    private JTextField txtUsername;
    private JTextField txtPassword;
}