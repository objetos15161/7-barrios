import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Escribe una descrición de la clase Letrero2 aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión (Un número de versión o una fecha)
 */
public class Letrero2 extends Nivel
{
    /**
     e hace la pregunta respectiva al barrio y se revisa si la respuesta es correcta,
     * de lo contrario se resta una vida.
     * Pregunta del barrio Montecillo.
     */
    public void act() 
    {
        setImage("Exterior/Letrero2.png");
        //Revisa si el personaje toca el letrero y si se presiona la tecla enter para poder acceder a la pregunta.
         if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )
        {
            //Se abre el panel para que aparesca la pregunta y sea respondida.
            String inputValue = JOptionPane.showInputDialog("La actual iglesia, originalmente en forma de cruz latina y la fachada hacia el poniente, se empezo en ___ y se concluyo en __\n a) 1810 y 1827   b) 1730 y 1747   c) 1780 y 1790");   
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
