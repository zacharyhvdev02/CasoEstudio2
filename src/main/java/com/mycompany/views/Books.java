package com.mycompany.views;

import com.mycompany.Commands.Command;
import com.mycompany.Commands.ConcreteCommands.BookStatusCommand;
import com.mycompany.ilib.DAOBooksImpl;
import com.mycompany.ilib.Dashboard;
import com.mycompany.interfaces.DAOBooks;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Books extends javax.swing.JPanel {

    public Books() {
    	initComponents();
    }
    
    public void Init() {
        InitStyles();
        LoadBooks();
    }
    
    protected javax.swing.JTable getTable() {
    	return this.jTable1;
    }
    
    protected javax.swing.JButton getAddButton() {
    	return this.addButton;
    }
    
    protected javax.swing.JButton getEditButton() {
    	return this.editButton;
    }
    
    protected javax.swing.JPanel getBGPanel() {
    	return this.bg;
    }
    
    
    protected void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        bookSearch.putClientProperty("JTextField.placeholderText", "Ingrese el título del libro a buscar.");
    }
    
    public javax.swing.JPanel getPanel() {
    	return this;
    }
    
    protected void LoadBooks() {
        try {
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	 bg = new javax.swing.JPanel();
         title = new javax.swing.JLabel();
         bookSearch = new javax.swing.JTextField();
         searchButton = new javax.swing.JButton();
         deleteButton = new javax.swing.JButton();
         editButton = new javax.swing.JButton();
         addButton = new javax.swing.JButton();
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();

         setBackground(new java.awt.Color(255, 255, 255));

         bg.setBackground(new java.awt.Color(255, 255, 255));

         title.setText("Libros");

         searchButton.setBackground(new java.awt.Color(18, 90, 173));
         searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
         searchButton.setForeground(new java.awt.Color(255, 255, 255));
         searchButton.setText("Buscar");
         searchButton.setBorderPainted(false);
         searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         searchButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 searchButtonActionPerformed(evt);
             }
         });

        statusButton.setBackground(new java.awt.Color(18, 90, 173));
        statusButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statusButton.setForeground(new java.awt.Color(255, 255, 255));
        statusButton.setText("Estado");
        statusButton.setBorderPainted(false);
        statusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    statusButtonActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

         deleteButton.setBackground(new java.awt.Color(18, 90, 173));
         deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
         deleteButton.setForeground(new java.awt.Color(255, 255, 255));
         deleteButton.setText("Borrar");
         deleteButton.setBorderPainted(false);
         deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         deleteButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 deleteButtonActionPerformed(evt);
             }
         });

         editButton.setBackground(new java.awt.Color(18, 90, 173));
         editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
         editButton.setForeground(new java.awt.Color(255, 255, 255));
         editButton.setText("Editar");
         editButton.setBorderPainted(false);
         editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         editButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 editButtonActionPerformed(evt);
             }
         });

         addButton.setBackground(new java.awt.Color(18, 90, 173));
         addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
         addButton.setForeground(new java.awt.Color(255, 255, 255));
         addButton.setText("Nuevo");
         addButton.setBorderPainted(false);
         addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         addButton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 addButtonActionPerformed(evt);
             }
         });

         jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {

             },
             new String [] {
                 "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
             }
         ) {
             Class[] types = new Class [] {
                 java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
             };
             boolean[] canEdit = new boolean [] {
                 false, true, true, true, true, true, true, true, true, true, true, true, true
             };

             public Class getColumnClass(int columnIndex) {
                 return types [columnIndex];
             }

             public boolean isCellEditable(int rowIndex, int columnIndex) {
                 return canEdit [columnIndex];
             }
         });
         jTable1.getTableHeader().setReorderingAllowed(false);
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 jTable1MousePressed(evt);
             }
         });
         jScrollPane1.setViewportView(jTable1);
         
         extraPanel = new JPanel();
         extraPanel.setBackground(new Color(255, 255, 255));

         javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
         bgLayout.setHorizontalGroup(
         	bgLayout.createParallelGroup(Alignment.LEADING)
         		.addGroup(bgLayout.createSequentialGroup()
         			.addContainerGap()
         			.addGroup(bgLayout.createParallelGroup(Alignment.TRAILING)
         				.addGroup(bgLayout.createSequentialGroup()
         					.addComponent(title, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
         					.addGap(699))
         				.addGroup(bgLayout.createSequentialGroup()
         					.addGroup(bgLayout.createParallelGroup(Alignment.TRAILING)
         						.addGroup(bgLayout.createSequentialGroup()
         							.addComponent(extraPanel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
         							.addGap(18)
         							.addComponent(addButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         							.addPreferredGap(ComponentPlacement.UNRELATED)
         							.addComponent(editButton, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
         							.addPreferredGap(ComponentPlacement.UNRELATED)
         							.addComponent(deleteButton, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
         						.addGroup(bgLayout.createSequentialGroup()
         							.addComponent(bookSearch, 601, 601, 601)
         							.addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(statusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         							.addComponent(searchButton))
         						.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
         					.addGap(50))))
         );
         bgLayout.setVerticalGroup(
         	bgLayout.createParallelGroup(Alignment.LEADING)
         		.addGroup(bgLayout.createSequentialGroup()
         			.addContainerGap()
         			.addComponent(title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         			.addPreferredGap(ComponentPlacement.RELATED)
         			.addGroup(bgLayout.createParallelGroup(Alignment.TRAILING)
         				.addComponent(bookSearch, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
         				.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
         			.addPreferredGap(ComponentPlacement.UNRELATED)
         			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
         			.addPreferredGap(ComponentPlacement.UNRELATED)
         			.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
         				.addGroup(bgLayout.createParallelGroup(Alignment.BASELINE)
         					.addComponent(deleteButton)
         					.addComponent(editButton)
                            .addComponent(statusButton)
         					.addComponent(addButton))
         				.addComponent(extraPanel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
         			.addContainerGap())
         );
         extraPanel.setLayout(new BorderLayout(0, 0));
         bg.setLayout(bgLayout);

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
         this.setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
    }//GEN-LAST:event_jTable1MousePressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Dashboard.ShowJPanel(new UpBooks());
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DAOBooks dao = new DAOBooksImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más libros a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                int bookId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOBooks dao = new DAOBooksImpl();
                Dashboard.ShowJPanel(new UpBooks(dao.getBookById(bookId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el libro a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(bookSearch.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void statusButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        DAOBooks dao = new DAOBooksImpl();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más libros.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    int bookId = (int) jTable1.getValueAt(i, 0);
                    com.mycompany.models.Books book = dao.getBookById(bookId);

                    Command statusCommand = new BookStatusCommand(book);
                    statusCommand.execute();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField bookSearch;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton statusButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private JLabel lblNewLabel;
    private JPanel extraPanel;
	protected JPanel getExtraPanel() {
		return extraPanel;
	}
}