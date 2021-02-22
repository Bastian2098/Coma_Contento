package vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class menu extends javax.swing.JPanel {
    
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3 = new JScrollPane();
    private javax.swing.JTree jTree2 = new JTree();
    private DefaultMutableTreeNode nodoPrincipal = new DefaultMutableTreeNode("Menú");  
    private DefaultMutableTreeNode nodoAmazonica = new DefaultMutableTreeNode("Región Amazónica");
    private DefaultMutableTreeNode nodoAndina = new DefaultMutableTreeNode("Región Andina");
    private DefaultMutableTreeNode nodoCaribe = new DefaultMutableTreeNode("Región del Caribe");
    private DefaultMutableTreeNode nodoOrinoquia = new DefaultMutableTreeNode("Región de la Orinoquia");
    private DefaultMutableTreeNode nodoInsular = new DefaultMutableTreeNode("Región Insular");
    private DefaultMutableTreeNode nodoPacifico = new DefaultMutableTreeNode("Región del Pacifico");

    public menu() {
        initComponents();
        nodoPrincipal.add(nodoAmazonica);
        nodoPrincipal.add(nodoAndina);
        nodoPrincipal.add(nodoCaribe);
        nodoPrincipal.add(nodoInsular);
        nodoPrincipal.add(nodoOrinoquia);
        nodoPrincipal.add(nodoPacifico);
        DefaultTreeModel arbol = new DefaultTreeModel(nodoPrincipal);
        jTree2.setModel(arbol);
        jScrollPane3.setViewportView(jTree2);
        jTree2.addMouseListener(ml);
    }
    
    MouseListener ml = new MouseAdapter() {
        public void clicked(MouseEvent e){
           TreePath selected = jTree2.getPathForLocation(e.getX(), e.getY());
           System.out.println(selected.getClass().toString());
        }
    };

    public JTree getjTree2() {
        return jTree2;
    }

    public void setjTree2(JTree jTree2) {
        this.jTree2 = jTree2;
    }

    public DefaultMutableTreeNode getNodoAmazonica() {
        return nodoAmazonica;
    }

    public void setNodoAmazonica(DefaultMutableTreeNode nodoAmazonica) {
        this.nodoAmazonica = nodoAmazonica;
    }

    public DefaultMutableTreeNode getNodoAndina() {
        return nodoAndina;
    }

    public void setNodoAndina(DefaultMutableTreeNode nodoAndina) {
        this.nodoAndina = nodoAndina;
    }

    public DefaultMutableTreeNode getNodoCaribe() {
        return nodoCaribe;
    }

    public void setNodoCaribe(DefaultMutableTreeNode nodoCaribe) {
        this.nodoCaribe = nodoCaribe;
    }

    public DefaultMutableTreeNode getNodoOrinoquia() {
        return nodoOrinoquia;
    }

    public void setNodoOrinoquia(DefaultMutableTreeNode nodoOrinoquia) {
        this.nodoOrinoquia = nodoOrinoquia;
    }

    public DefaultMutableTreeNode getNodoInsular() {
        return nodoInsular;
    }

    public void setNodoInsular(DefaultMutableTreeNode nodoInsular) {
        this.nodoInsular = nodoInsular;
    }

    public DefaultMutableTreeNode getNodoPacifico() {
        return nodoPacifico;
    }

    public void setNodoPacifico(DefaultMutableTreeNode nodoPacifico) {
        this.nodoPacifico = nodoPacifico;
    }
    
    @SuppressWarnings("unchecked")                        
    private void initComponents() {
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        //jScrollPane3 = new javax.swing.JScrollPane();
        //jTree2 = new javax.swing.JTree();
        jMenuItem1.setText("jMenuItem1");
        
        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
       
        jTree2.setBackground(new java.awt.Color(204, 204, 255));
        jTree2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTree2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTree2.setEditable(false);
        //jScrollPane3.setViewportView(jTree2);
        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 620));

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>                        
                             
}