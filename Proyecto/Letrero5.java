import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @version (05/12/15)
 */
public class Letrero5 extends Nivel
{
    /**
    * Se hace la pregunta respectiva al barrio y se revisa si la respuesta es correcta,
     * de lo contrario se resta una vida.
     * Pregunta del barrio Tequisquiapan.
     */
    public void act() 
    {
       setImage("Exterior/Letrero5.png");
       //Revisa si el personaje toca el letrero y si se presiona la tecla enter para poder acceder a la pregunta.
       if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )
        {
            //Se abre el panel para que aparesca la pregunta y sea respondida.
            String inputValue = JOptionPane.showInputDialog("La fiesta dedicada a Ntra. Sra. de los remedios se festeja el dia:\n a) 27 de agosto b) 1 de septiembre c) 15 de noviembre");  
             if(inputValue.equals("b")|| inputValue.equals("B"))
            {//Se revisa si la respuesta es correcta y se muestra un mensaje.
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {//Si no es correcta se muestra un mensaje y se resta una vida.
               String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
               Barrio mundo =(Barrio) getWorld();
               Counter vidas=mundo.dimeVidas();
               vidas.add(-1);              
            }
        }  
    }    
}
