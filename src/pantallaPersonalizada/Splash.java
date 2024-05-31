package pantallaPersonalizada;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Ventana principal donde se muestra un JFrame con forma personalizada
 * @author Emmanuelito18
 */
public class Splash extends javax.swing.JFrame {
    private Color transparente;//crea un nuevo color
    private Point punto;//se utliza para obtener el punto en que se está haciendo click y en donde está el mouse
    /**
     * Creates new form Principal
     */
    public Splash() {
        transparente=new Color(0,0,0,0);//Crea el color trasnparente
        //setUndecorated(true); para que no este la barra arriba de la ventana
        initComponents();
        setLocationRelativeTo(null);
        setBackground(transparente);//cambia el fondo del JFrame utilizando el color transparente antes creado

        // <editor-fold defaultstate="collapsed" desc="Cambia el fondo del panel pnlBackground">
        PoneImagenes fondo=new PoneImagenes(pnlBackground, "/iconos/shape2.png");
        pnlBackground.add(fondo).repaint();
        pnlBackground.setOpaque(false);
        pnlBackground.setBorder(null);
        pnlBackground.setBackground(transparente);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Cambia el fondo del panel pnlCerrar">
        PoneImagenes salir=new PoneImagenes(pnlCerrar, "/iconos/salir.png");
        pnlCerrar.add(salir).repaint();
        pnlCerrar.setOpaque(false);
        pnlCerrar.setBorder(null);
        pnlCerrar.setBackground(transparente);
        // </editor-fold>
        
        barraProgresoIniciado();//se llama al método para iniciar la barra de progreso
    }

    /**
     * Se utiliza para que la barra de progreso vaya aumentando su porcenaje
     * no recibe parametros
     */
    private void barraProgresoIniciado(){
        Timer timer=new Timer(45, (ActionEvent e) -> {//funcion lambda para el timer
           pbCarga.setValue(pbCarga.getValue()+1);//obtiene el valor que ya tiene y le suma 1
           pbCarga.setBackground(Color.ORANGE);//Cambia el color de fondo de la barra de progreso
           pbCarga.setStringPainted(true);//Habilita el poder mostrar texto en la barra de prograso
           pbCarga.setString("Cargando... "+pbCarga.getValue()+"%");//Establece un texto en la barra de progreso
        });
        timer.start();//inicia el timer
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pbCarga = new javax.swing.JProgressBar();
        pnlCerrar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(350, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBackgroundMouseDragged(evt);
            }
        });
        pnlBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBackgroundMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emmanuelito18");

        pbCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se utiliza para obtener el punto del JFrame en la que se hace el click
     * @param evt 
     */
    private void pnlBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundMousePressed
        punto=evt.getPoint();//obtiene la posicion del mouse
        getComponentAt(punto);//obtine el componene en la posición punto (posición del mouse)
    }//GEN-LAST:event_pnlBackgroundMousePressed

    /**
     * Se utiliza para saber la posición del mouse mientras se mueve teniendo el click izquierdo presionado
     * @param evt 
     */
    private void pnlBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundMouseDragged
        // <editor-fold defaultstate="collapsed" desc="Obtiene la posición actual en donde se encuentra el cursor">
        int ActualX=this.getLocation().x;
        int ActualY=this.getLocation().y;
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Calcula el movimieno del mouse">
        int movimientoX=(ActualX+evt.getX())-(ActualX+punto.x);
        int movimientoY=(ActualY+evt.getY())-(ActualY+punto.y);
        /*
        ActualX y ActualY sirven para obtner las coordenadas de la ventana o componente
        evt.getX() y evt.getY() sirven para obener las coordenadas de la posición del mouse
        punto.x y punto.y son las coordenas del mouse almacenadas previamente al hacer click
        Al restarse estas cantidades se obtiene el movimiento en cada eje
        */
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Calcula la nueva ubicación del JFrame">
        int x=ActualX+movimientoX;
        int y=ActualY+movimientoY;
        //calcula la nueva posición sumando la posición actual de cada eje con el movimiento en cada eje
        // </editor-fold>
        
        this.setLocation(x,y);//establece la ubicación del JFrame según las coordenadas calculadas
    }//GEN-LAST:event_pnlBackgroundMouseDragged

    /**
     * Se utiliza para saber cuando se dio click en el panel para cerrar el JFrame
     * @param evt 
     */
    private void pnlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnlCerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pbCarga;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCerrar;
    // End of variables declaration//GEN-END:variables
}