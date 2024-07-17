package com.mycompany.views;

import com.mycompany.ilib.DAOBooksImpl;
import com.mycompany.interfaces.DAOBooks;
import com.mycompany.models.BookState;
import com.mycompany.utils.Utils;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class UpBooks extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Books bookEdition;

    public UpBooks() {
    	setMinimumSize(new Dimension(10, 200));
        initComponents();
        InitStyles();
    }

    public UpBooks(com.mycompany.models.Books book) {
        initComponents();
        isEdition = true;
        bookEdition = book;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        titleTxt.putClientProperty("JTextField.placeholderText", "Ingrese el título del libro");
        dateTxt.putClientProperty("JTextField.placeholderText", "Ingrese la de publicación del libro.");
        authorTxt.putClientProperty("JTextField.placeholderText", "Ingrese el autor del libro.");
        catTxt.putClientProperty("JTextField.placeholderText", "Ingrese la categoría del libro.");
        edTxt.putClientProperty("JTextField.placeholderText", "Ingrese la editorial del libro.");
        langTxt.putClientProperty("JTextField.placeholderText", "Ingrese el idioma del libro.");
        pagsTxt.putClientProperty("JTextField.placeholderText", "Ingrese las páginas totales del libro.");
        descTxt.putClientProperty("JTextField.placeholderText", "Ingrese la descripción del libro.");
        stockTxt.putClientProperty("JTextField.placeholderText", "Ingrese el stock total del libro.");
        dispTxt.putClientProperty("JTextField.placeholderText", "Ingrese el númeor de libros disponibles.");
        ejemTxt.putClientProperty("JTextField.placeholderText", "Ingrese el número de ejemplares del libro.");

        if (isEdition) {
            title.setText("Editar Libro");
            button.setText("Guardar");

            if (bookEdition != null) {
                titleTxt.setText(bookEdition.getTitle());
                dateTxt.setText(bookEdition.getDate());
                authorTxt.setText(bookEdition.getAuthor());
                catTxt.setText(bookEdition.getCategory());
                edTxt.setText(bookEdition.getEdit());
                langTxt.setText(bookEdition.getLang());
                pagsTxt.setText(bookEdition.getPages());
                descTxt.setText(bookEdition.getDescription());
                stockTxt.setText(bookEdition.getStock() + "");
                dispTxt.setText(bookEdition.getAvailable() + "");
                ejemTxt.setText(bookEdition.getEjemplares());
            }
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
        bg.setMinimumSize(new Dimension(10, 200));
        title = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        authorTxt = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        catTxt = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        edTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        langLbl = new javax.swing.JLabel();
        langTxt = new javax.swing.JTextField();
        pagsLbl = new javax.swing.JLabel();
        pagsTxt = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        dispTxt = new javax.swing.JTextField();
        dispLbl = new javax.swing.JLabel();
        ejemLbl = new javax.swing.JLabel();
        ejemTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Subir nuevo Libro");

        titleLbl.setText("Título");

        dateLbl.setText("Fecha de Publicación");

        authorLbl.setText("Autor");

        catLbl.setText("Categoría");

        edLbl.setText("Edición");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 200));

        langLbl.setText("Idioma");

        langTxt.setToolTipText("");

        pagsLbl.setText("Páginas");

        pagsTxt.setToolTipText("");

        descLbl.setText("Descripción");

        descTxt.setToolTipText("");

        stockLbl.setText("Stock");
        stockLbl.setToolTipText("");

        stockTxt.setToolTipText("");

        dispTxt.setToolTipText("");

        dispLbl.setText("Disponibles");

        ejemLbl.setText("Estado");

        ejemTxt.setToolTipText("");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Subir");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        
        JLabel ejemLbl_1 = new JLabel();
        ejemLbl_1.setText("Ejemplares");
        
        estadoTxt = new JTextField();
        estadoTxt.setText("Buen estado");
        estadoTxt.setToolTipText("");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bgLayout.setHorizontalGroup(
        	bgLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(bgLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(bgLayout.createSequentialGroup()
        					.addComponent(title, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(bgLayout.createSequentialGroup()
        					.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(catTxt, 260, 260, 260)
        						.addComponent(authorTxt, 260, 260, 260)
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(authorLbl, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        							.addGap(233))
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(catLbl, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        							.addGap(213))
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(titleLbl, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        							.addGap(234))
        						.addComponent(titleTxt, 260, 260, 260)
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(dateLbl, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        							.addGap(161))
        						.addComponent(dateTxt, 260, 260, 260)
        						.addComponent(edTxt, Alignment.TRAILING, 260, 260, 260)
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(edLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGap(227)))
        					.addGap(68)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(70)
        					.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(bgLayout.createSequentialGroup()
        							.addComponent(ejemLbl_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        							.addContainerGap())
        						.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        							.addGroup(bgLayout.createSequentialGroup()
        								.addComponent(ejemTxt, 259, 259, 259)
        								.addContainerGap())
        							.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(ejemLbl, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(stockLbl, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(descTxt, 259, 259, 259)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(descLbl, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(pagsTxt, 259, 259, 259)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(pagsLbl, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        									.addContainerGap())
        								.addGroup(bgLayout.createSequentialGroup()
        									.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        										.addGroup(bgLayout.createSequentialGroup()
        											.addComponent(langLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addGap(228))
        										.addGroup(bgLayout.createSequentialGroup()
        											.addComponent(stockTxt, 120, 120, 120)
        											.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        												.addGroup(bgLayout.createSequentialGroup()
        													.addGap(20)
        													.addComponent(dispLbl, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        												.addGroup(bgLayout.createSequentialGroup()
        													.addGap(18)
        													.addComponent(dispTxt, 119, 119, 119))))
        										.addGroup(bgLayout.createSequentialGroup()
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        												.addComponent(button, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        												.addComponent(estadoTxt, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))))
        									.addGap(72))
        								.addGroup(bgLayout.createSequentialGroup()
        									.addComponent(langTxt, 259, 259, 259)
        									.addContainerGap())))))))
        );
        bgLayout.setVerticalGroup(
        	bgLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(bgLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(title, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        			.addGap(32)
        			.addGroup(bgLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(bgLayout.createSequentialGroup()
        					.addComponent(langLbl, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        					.addGap(2)
        					.addComponent(langTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)
        					.addComponent(pagsLbl, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        					.addGap(2)
        					.addComponent(pagsTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(descLbl, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(descTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(bgLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(stockLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(dispLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(bgLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(stockTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(dispTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(2)
        					.addComponent(ejemLbl_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(ejemTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(ejemLbl, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(estadoTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE)
        				.addGroup(bgLayout.createSequentialGroup()
        					.addComponent(titleLbl, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(titleTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(dateLbl, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(authorLbl, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(authorTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addGap(11)
        					.addComponent(catLbl, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(catTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(edLbl, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(edTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        bg.setLayout(bgLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(bg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(bg, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String mtitle = titleTxt.getText();
        String date = dateTxt.getText();
        String author = authorTxt.getText();
        String cat = catTxt.getText();
        String ed = edTxt.getText();
        String lang = langTxt.getText();
        String pags = pagsTxt.getText();
        String desc = descTxt.getText();
        String stock = stockTxt.getText();
        String disp = dispTxt.getText();
        String ejem = ejemTxt.getText();
        String estado = estadoTxt.getText();
        // Validaciones para los campos
        if (mtitle.isEmpty() || date.isEmpty() || author.isEmpty() || cat.isEmpty() || ed.isEmpty()
                || lang.isEmpty() || pags.isEmpty() || desc.isEmpty() || stock.isEmpty() || disp.isEmpty() || ejem.isEmpty() || estado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(stock) || !Utils.isNumeric(disp)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Stock y Disponibles deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        }

        com.mycompany.models.Books book = isEdition ? bookEdition : new com.mycompany.models.Books();
        book.setTitle(mtitle);
        book.setDate(date);
        book.setAuthor(author);
        book.setCategory(cat);
        book.setEdit(ed);
        book.setLang(lang);
        book.setPages(pags);
        book.setDescription(desc);
        book.setEjemplares(ejem);
        book.setStock(Integer.parseInt(stock));
        book.setAvailable(Integer.parseInt(disp));
        book.setState(BookState.from(estado));

        try {
            DAOBooks dao = new DAOBooksImpl();

            if (!isEdition) {
                dao.registrar(book);
            } else {
                dao.modificar(book);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Libro " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                titleTxt.setText("");
                dateTxt.setText("");
                authorTxt.setText("");
                catTxt.setText("");
                edTxt.setText("");
                langTxt.setText("");
                pagsTxt.setText("");
                descTxt.setText("");
                stockTxt.setText("");
                dispTxt.setText("");
                ejemTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField catTxt;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel dispLbl;
    private javax.swing.JTextField dispTxt;
    private javax.swing.JLabel edLbl;
    private javax.swing.JTextField edTxt;
    private javax.swing.JLabel ejemLbl;
    private javax.swing.JTextField ejemTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel langLbl;
    private javax.swing.JTextField langTxt;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JTextField pagsTxt;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxt;
    private JTextField estadoTxt;
}