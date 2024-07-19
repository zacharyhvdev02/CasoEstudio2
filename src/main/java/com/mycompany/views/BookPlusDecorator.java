package com.mycompany.views;

import com.mycompany.ilib.DAOBooksImpl;
import com.mycompany.utils.*;
import com.mycompany.ilib.Dashboard;
import com.mycompany.interfaces.DAOBooks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;

public class BookPlusDecorator extends BooksDecorator {

    JLabel comments;
	
    public BookPlusDecorator(Books books) {
		super(books);
	}

    @Override
	public void Init() {
    	super.Init();
    	this.AddStatusManager();
    	this.addComentarios();
    }
    
    private void AddStatusManager() {
    	javax.swing.JTable table1 = this.books.getTable();
    	table1.setModel(
    			new javax.swing.table.DefaultTableModel(
    		            new Object [][] {

    		            },
    		            new String [] {
    		                "Visual", "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplares", "Stock", "Disponibles", "Estado"
    		            }
    		        ) {
    		            Class[] types = new Class [] {
    		            		javax.swing.ImageIcon.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    		            };
    		            boolean[] canEdit = new boolean [] {
    		                false, false, true, true, true, true, true, true, true, true, true, true, true, true
    		            };

    		            public Class getColumnClass(int columnIndex) {
    		                return types [columnIndex];
    		            }

    		            public boolean isCellEditable(int rowIndex, int columnIndex) {
    		                return canEdit [columnIndex];
    		            }
    		        }
    	);
    	
    	// reload the data.
    	
    	try {
    	    DAOBooks dao = new DAOBooksImpl();
    	    DefaultTableModel model = (DefaultTableModel) table1.getModel();
    	    BufferedImage image = ImageIO.read(getClass().getResourceAsStream("/new_icon.png"));
    	    
    	    dao.listar("").forEach(u -> {
    	        Boolean isNew = false;
    	        if (u.getCreatedDate().after(new GregorianCalendar() {{
    	            	add(Calendar.MONTH, -3);
    	        	}}.getTime())) {
    	            isNew = true;
    	        }
    	        model.addRow(new Object[]{
    	            isNew ? new ImageIcon(image.getScaledInstance(20, 30, Image.SCALE_SMOOTH)) : null,
    	            u.getId(), 
    	            u.getTitle(), 
    	            u.getDate(), 
    	            u.getAuthor(), 
    	            u.getCategory(), 
    	            u.getEdit(), 
    	            u.getLang(), 
    	            u.getPages(), 
    	            u.getDescription(), 
    	            u.getEjemplares(), 
    	            u.getStock(), 
    	            u.getAvailable(), 
    	            u.getState().toString()
    	        });
    	    });
    	} catch (Exception e) {
    	    System.out.println(e.getMessage());
    	}
    	
    	// add new and add books behavior.
    	JButton addButton = this.books.getAddButton();
    	
    	ActionListener[] listeners = addButton.getActionListeners();
    	for (ActionListener l : listeners) {
    	    addButton.removeActionListener(l);
    	}
    	
    	addButton.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	        Dashboard.ShowJPanel(new UpBooksPlus());
    	    }
    	});
    	
    	JButton editButton = this.books.getEditButton();
    	
    	listeners = editButton.getActionListeners();
    	for (ActionListener l : listeners) {
    		editButton.removeActionListener(l);
    	}
    	
    	javax.swing.JPanel booksComponent = this.books;
    	
    	editButton.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	if (table1.getSelectedRow() > -1) {
    	            try {
    	                int bookId = (int) table1.getValueAt(table1.getSelectedRow(), 1);
    	                DAOBooks dao = new DAOBooksImpl();
    	                Dashboard.ShowJPanel(new UpBooksPlus(dao.getBookById(bookId)));
    	            } catch (Exception e) {
    	                System.out.println(e.getMessage());
    	            }
    	        } else {
    	            javax.swing.JOptionPane.showMessageDialog(booksComponent, "Debes seleccionar el libro a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
    	        }
    	    }
    	});
    }
    
    private void addComentarios() {
    
    	// Define the gap
    	int gap = 10;  // Adjust as needed

    	JPanel extraPanel = this.books.getExtraPanel();
    	extraPanel.setLayout(new BorderLayout());  // Ensure it's using BorderLayout

    	JLabel leftCenterLabel = new JLabel("Comentario: ");
    	JLabel newLabel = new JLabel("");

    	// Set the border to add a gap
    	Border margin = BorderFactory.createEmptyBorder(0, gap, 0, 0);  // Top, Left, Bottom, Right
    	leftCenterLabel.setBorder(margin);
    	newLabel.setBorder(margin);

    	// Create a new panel to place the labels
    	JPanel leftPanel = new JPanel(new BorderLayout());
    	leftPanel.add(leftCenterLabel, BorderLayout.WEST);
    	leftPanel.add(newLabel, BorderLayout.CENTER);
    	
    	extraPanel.add(leftPanel, BorderLayout.WEST);
    	
    	this.comments = newLabel;
    	
    	JButton editButton = this.books.getEditButton();
    	
    	javax.swing.JTable table1 = this.books.getTable();
    	// random generatino of comments since the requirements does not state to add the backend logic of comments of the books, just to SEE the comments
    	// the backend would require another requirement to build the leave comments to specific books etc.
    	int commentsSize = 3;
    	String[] comentarios = new String[3];
    	comentarios[0] = "Un libro fascinante con una trama increíble.";
    	comentarios[1] = "La narrativa es envolvente y los personajes bien desarrollados.";
    	comentarios[2] = "Una lectura obligatoria para los amantes de la literatura.";
    	
    	table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    		@Override
    	    public void valueChanged(ListSelectionEvent evnt) {
    	    	if (table1.getSelectedRow() > -1) {
    	            try {
    	                int bookId = (int) table1.getValueAt(table1.getSelectedRow(), 1);
    	                Random random = new Random();
    	            	comments.setText(comentarios[random.nextInt(commentsSize)]);
    	            } catch (Exception e) {
    	                System.out.println(e.getMessage());
    	            }
    	        }
    	    }
    	});
    }
    
    private void LoadComments() {
    	
    }
}