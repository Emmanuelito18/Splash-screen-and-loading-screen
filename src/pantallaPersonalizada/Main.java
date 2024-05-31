package pantallaPersonalizada;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta clase se encarga de controlar todo lo relacionado al programa principal
 * @author Emmanuelito18
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable run=() -> {//crea un objeto de tipo Runnable utilizando una expresion lamda
            Splash splash=new Splash();//crea un objeto de la clase Splash llamada splash
            splash.setVisible(true);//hace visible el objeto splash
            
            try {
                Thread.sleep(5000);//hace que el hilo espere 5 segundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            splash.dispose();//cierra el objeto de la ventana splash
            
            FrmBienvenida bienvenida=new FrmBienvenida();//crea un objeto de la clase FrmBienvenida llamado bienvenida
            bienvenida.setVisible(true);//hace visible el objeto bienvenida
        };
        
        Thread hiloSplash=new Thread(run);//crea un objeto Thread llamado hiloSplash y le pasa como parametro un objeto de tipo Runnable
        hiloSplash.start();//inicial el hilo creado
    }
    //la funcion lambda se utiliza para definir el comportamiento del hilo
}
