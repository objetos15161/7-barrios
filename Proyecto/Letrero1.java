import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Escribe una descrición de la clase Letrero1 aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión (Un número de versión o una fecha)
 */
public class Letrero1 extends Nivel
{
    /**
     * Se hace la pregunta respectiva al barrio y se revisa si la respuesta es correcta,
     * de lo contrario se resta una vida.
     * Pregunta del barrio San Sebastian.
     */
    
   public void act() 
    {
        setImage("Exterior/Letrero1.png");
        //Revisa si el personaje toca el letrero y si se presiona la tecla enter para poder acceder a la pregunta.
        if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )
        {
            //Se abre el panel para que aparesca la pregunta y sea respondida.
            String inputValue = JOptionPane.showInputDialog("El 28 de noviembre de 1906 en la calle Comonfort se encuentra la casa donde murio\n a) Manuel Jose Othon b) Fransisco Gonzales Bocanegra c) Emiliano Zapata ");
             if(inputValue.equals("a")|| inputValue.equals("A"))
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
