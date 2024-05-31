package pantallaPerzonalizada;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Esta clase se encarga del manejo de imagenes en nuestro programa
 * @author Emmanuelito18
 * @param ancho Número de tipo entero mayor o igual a 0, determina el ancho de la imagen
 * @param alto Número de tipo entero mayor o igual a 0, determina el lato de la imagen
 * @param ruta String que indica en donde se guarda la imagen a poner
 */
public class PoneImagenes extends javax.swing.JLabel{
    private int ancho;//width
    private int alto;//height
    private String ruta;//path

    /**
     * 
     * @param jpanel
     * @param ruta 
     */
    public PoneImagenes(JPanel jpanel,String ruta){
        this.ruta=ruta;
        this.ancho=jpanel.getWidth();
        this.alto=jpanel.getHeight();
        this.setSize(ancho,alto);
    }
    
    /**
     * 
     * @param graphics 
     */
    public void paint(Graphics graphics){
        ImageIcon imagen=new ImageIcon(getClass().getResource(ruta));
        graphics.drawImage(imagen.getImage(),0,0,ancho,alto,null);
    }
}
